package practise_java_questions.principles.encapsulation;

public class WebDriverTool {

    public void launchBrowser(String browser){
        if (browser.equalsIgnoreCase("chrome")) {
            launchChrome();
        } else if (browser.equalsIgnoreCase("safari")){
            launchSafari();
        } else {
            System.out.println("Please pass the correct browser");
        }

    }

    private void launchChrome(){
        System.out.println("Checking Chrome Version");
        System.out.println("Checking OS Version");
        System.out.println("Launch Chrome");
    }
    private void launchSafari(){
        System.out.println("Checking Safari Version");
        System.out.println("Checking OS Version");
        System.out.println("Launch Safari");
    }

}
