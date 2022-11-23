package utils;

import java.awt.*;

public class ImageUtils {

    public static Color[][] init(int height, int width) {
        Color[][] image = new Color[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                image[i][j] = new Color(255, 0, 0);
            }
        }
        return image;
    }

}
