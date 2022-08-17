package practise_java_questions.FilleHandling;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException {

        File file = new File("/Users/dzmitryrazhkou/Downloads/stp.pdf");
        File opFile = new File("/Users/dzmitryrazhkou/Downloads/sample.pdf");

        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(opFile);

        System.out.println("File contains " + fileInputStream.available() + " bytes. ");

        int i = 0;
        while ((i = fileInputStream.read()) != -1) {
            fileOutputStream.write(i);
        }
    }

    }


