package utils;

public class MathUtils {

    public static int euclideanDistance(int x0, int y0, int x1, int y1) {
        int dx = x1 - x0;
        int dy = y1 - y0;
        return (int) Math.sqrt(dx * dx + dy * dy);
    }

    public static int manhattanDistance(int x0, int y0, int x1, int y1) {
        int dx = x1 - x0;
        int dy = y1 - y0;
        return Math.abs(dx) + Math.abs(dy);
    }

}
