package ppm;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PPMImageWriter {

    public static void saveImageAsPPM(String path, Color[][] image) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String header = String.format("P3\n%d %d\n255\n", image[0].length, image.length);
        bufferedWriter.write(header);

        for (Color[] colors : image) {
            for (int j = 0; j < image[0].length; j++) {
                Color color = colors[j];
                bufferedWriter.write(String.format("%d %d %d\n", color.getRed(), color.getGreen(), color.getBlue()));
            }
        }

        bufferedWriter.close();
    }

}
