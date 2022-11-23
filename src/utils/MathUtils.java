package utils;

public class MathUtils {

    public static int sqrt(int x0, int y0, int x1, int y1) {
        int dx = x1 - x0;
        int dy = y1 - y0;
        return dx * dx + dy * dy;
    }

}
