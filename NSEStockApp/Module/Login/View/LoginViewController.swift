import UIKit
import Firebase

class LoginViewController: BaseViewController {

    
    @IBOutlet weak var btnlogin: UIButton!
    @IBOutlet weak var textFieldPassword: UITextField!
    @IBOutlet weak var textFieldEmail: UITextField!
    init() {
        super.init(nibName: "LoginViewController", bundle: nil)
    }
    
    required init?(coder: NSCoder) {
        fatalError("init(coder:) has not been implemented")
    }
    override func viewDidLoad() {
        super.viewDidLoad()
        initailSetUp()
    }
    
    fileprivate func initailSetUp() {
        btnlogin.setCornerRadius()
        textFieldPassword.setCornerRadius()
        textFieldEmail.setCornerRadius()
    }
    
    @IBAction func actionLogin(_ sender: Any) {
        guard let email =  textFieldEmail.text else {return}
        guard let password = textFieldPassword.text else {return}
        showActivityIndicator()
        Auth.auth().signIn(withEmail: email, password: password) { [weak self] authResult, error in
            guard let self = self else {return}
            self.hideActivityIndicator()
            if error == nil {
                if let name = authResult?.user.displayName {
                    UserDefaults.standard.set("\(name)", forKey: "name")
                }
                UserDefaults.standard.set(true, forKey: "isLogin")
                UserDefaults.standard.synchronize()
                guard let windowScene = UIApplication.shared.connectedScenes.first as? UIWindowScene,
                      let sceneDelegate = windowScene.delegate as? SceneDelegate
                else {
                    return
                }
                let viewcontroller = MainTabBarController()
                viewcontroller.view.backgroundColor = .blue
                sceneDelegate.window?.rootViewController = viewcontroller
            } else {
                self.showAlert(error!.localizedDescription , title: "Error")
            }
        }
    }
    
    @IBAction func actionSignUp(_ sender: Any) {
        self.present(SignUpViewController(), animated: true, completion: nil)
    }
    
}
