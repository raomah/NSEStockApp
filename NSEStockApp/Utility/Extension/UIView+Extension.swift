import UIKit

extension UIView {
    func setCornerRadius(_ radius: CGFloat = 10, _ maskToBound: Bool = true) {
        layer.cornerRadius = radius
        layer.masksToBounds = maskToBound
    }
}
