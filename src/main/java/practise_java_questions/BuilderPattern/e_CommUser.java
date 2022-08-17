package practise_java_questions.BuilderPattern;

public class e_CommUser {
    public static void main(String[] args) {

        E_commApp shop = new E_commApp();
        shop
                .login("dzmitryrazhkou", "3036057Dr")
                .doSearch("Macbook Air M1", 999)
                .addToCart("Macbook Air M1")
                .doPayment("Wells Fargo 194555", "test124966")
                .sendEmail();
        int id = shop.generateID();
        System.out.println("The product ID is: " +id);
                shop.logOut();
    }
}
