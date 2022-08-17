package practise_java_questions.FilleHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        String path = "/Users/dzmitryrazhkou/Desktop/sp.pdf";

//        1. Using File:

        File file = new File(path);

        boolean flag = file.createNewFile();
        if (flag) {
            System.out.println("File is created");
        }
        else {
            System.out.println("File is already existed");
        }

//        2. FileOutputStream along with Scanner:

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name with path");
        String fileName = sc.nextLine();

        FileOutputStream fos = new FileOutputStream(fileName, true);

        System.out.println("Enter the file content: ");
        String content = sc.nextLine();
        byte[] b = content.getBytes();

        fos.write(b);
        fos.close();
        System.out.println("File is saved on the given location");




    }
}
