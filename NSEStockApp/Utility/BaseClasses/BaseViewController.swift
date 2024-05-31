import UIKit

class BaseViewController: UIViewController {

    override func viewDidLoad() {
        hideKeyboardWhenTappedAround()
    }
    
    deinit {
        print("deinit -->",String(describing: self))
    }
    func hideKeyboardWhenTappedAround() {
        let tap = UITapGestureRecognizer(target: self, action: #selector(dismissKeyboard))
        tap.cancelsTouchesInView = false
        view.addGestureRecognizer(tap)
    }
    
    @objc func dismissKeyboard() {
        view.endEditing(true)
    }
    
    func showAlert(_ message: String, title: String, completion: @escaping ()->Void = {}) {
        let alert = UIAlertController(title: title, message: message, preferredStyle: .alert)

        alert.addAction(UIAlertAction(title: "ok", style: .cancel, handler: { _ in
            completion()
        }))

        self.present(alert, animated: true)
    }
    
}
