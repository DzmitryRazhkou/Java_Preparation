package practise_java_questions.FilleHandling;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageHandling {
    public static void main(String[] args) throws IOException {

//        .jpg ---> .png/ .bmp/ .gif

//        URL url = new URL("https://m.media-amazon.com/images/I/815g8Uo656S._AC_SY400_.jpg");

        File file = new File("/Users/dzmitryrazhkou/Desktop/Screen Shot 2021-10-22 at 11.55.53 PM.png");

        BufferedImage image = ImageIO.read(file);

        ImageIO.write(image, "jpg", new File("/Users/dzmitryrazhkou/Desktop/A/lp.jpg"));
        ImageIO.write(image, "gif", new File("/Users/dzmitryrazhkou/Desktop/A/lp.gif"));
        ImageIO.write(image, "png", new File("/Users/dzmitryrazhkou/Desktop/A/lp.png"));

        System.out.println("Done .....");

    }
}
