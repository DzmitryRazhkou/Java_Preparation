package practise_java_questions.BuilderPattern;

public class E_commApp {

    public E_commApp login() {
        System.out.println("default login");
        return this;
    }

    public E_commApp login(String un, String pwd) {
        System.out.println("Login with: " + un + ", " + pwd);
        return this;
    }

    public E_commApp doSearch(String productName) {
        System.out.println("Search with: " + productName);
        return this;
    }

    public E_commApp doSearch(String productName, int price) {
        System.out.println("Search with: " + productName + ", price: " + price+ "$ plus taxes. ");
        return this;
    }

    public E_commApp selectProduct(String productName) {
        System.out.println("Select the product: " + productName);
        return this;
    }

    public E_commApp addToCart(String productName) {
        System.out.println("Adding the product in cart: " + productName);
        return this;
    }

    public E_commApp doPayment(String accountName, String pwd) {
        System.out.println("The Payment done via: " + accountName + ", " + pwd);
        return this;
    }

    public int generateID() {
        return 10001;
    }

    public E_commApp sendEmail() {
        System.out.println("The email is sent successfully... ");
        return this;
    }

    public E_commApp logOut() {
        System.out.println("Logout from the App...");
        return this;
    }
}
