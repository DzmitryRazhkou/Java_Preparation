package practise_java_questions.FilleHandling;

import java.io.File;
import java.util.Arrays;

public class PrintAllFilesAndFolderDirectorySorted {
    public static void main(String[] args) {
        String path = "/Users/dzmitryrazhkou/Documents/Automation";
        File file = new File(path);
        File[]doc = file.listFiles();
        Arrays.sort(doc);

        for (File f: doc){
            if (f.isFile()) {
                System.out.println("File: " + f.getName());
            } else if (f.isDirectory()){
                System.out.println("Directory: " + f.getName());
            } else {
                System.out.println("Unknown");
            }
        }
    }
}
