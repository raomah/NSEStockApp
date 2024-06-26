import Foundation
import Firebase
import FirebaseFirestore
class WishlistManager {

    private var wishListStock = [String]()
    private let db = Firestore.firestore()
    
    init() {
        GetWishListFromCloud()
    }
    
    func getWishListStock() -> [String] {
        return wishListStock
    }
    
    func isStockInWisthList(with id: String) -> Bool {
        wishListStock.contains(id)
    }
    
    func updateWishList(_ stockID: String) {
        if wishListStock.contains(stockID) {
            wishListStock.removeAll { $0 == stockID }
        } else {
            wishListStock.append(stockID)
        }
         updateWishlistToCloud()
    }
    
    func updateWishlistToCloud() {
        guard let  userId = Auth.auth().currentUser?.uid  else {return}
        db.collection(userId).document("wishlist").setData([
            "value" : wishListStock
        ]) { _ in
        }
    }
    
   private func GetWishListFromCloud() {
        guard let  userId = Auth.auth().currentUser?.uid  else {return}
        db.collection(userId).getDocuments() { (querySnapshot, err) in
            if err != nil {
                self.updateWishlistToCloud()
            } else {
                for document in querySnapshot!.documents {
                    if let anyArray = document.data()["value"] as? [String] {
                        self.wishListStock = anyArray
                    }
                }
            }
        }
    }
}
