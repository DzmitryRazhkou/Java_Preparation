package practise_java_questions.String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueEmails {
    public static void main(String[] args) {
        String[] emails = {
                "alice@example.com",
                "bob@example.com",
                "alice@example.com",
                "charlie@example.org",
                "bob@example.com"
        };

        uniqueEmails(emails);
    }

    public static void uniqueEmails(String[] emails) {
        Set<String> setEmails = new HashSet<String>(Arrays.asList(emails));

        for (String email : setEmails) {
            System.out.print(email + ", ");
        }
    }
}
