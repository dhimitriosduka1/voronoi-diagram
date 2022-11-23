package utils;

import entity.Site;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SiteUtils {

    public static List<Site> initRandom(int amount, int radius, Color[][] image) {
        List<Site> sites = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < amount; i++) {
            int randomX = (int) (Math.random() * image[0].length);
            int randomY = (int) (Math.random() * image.length);
            sites.add(new Site(randomX, randomY, radius, Color.BLACK));
        }
        return sites;
    }

    public static void fill(List<Site> sites, Color[][] image) {
        for (Site site : sites) {
            fill(site, image);
        }
    }

    private static void fill(Site site, Color[][] image) {
        int x0 = site.getX() - site.getRadius();
        int y0 = site.getY() - site.getRadius();
        int x1 = site.getX() + site.getRadius();
        int y1 = site.getY() + site.getRadius();

        for (int x = x0; x < x1; x++) {
            if (x >= 0 && x < image[0].length) {
                for (int y = y0; y < y1; y++) {
                    if (y >= 0 && y < image.length) {
                        int dx = site.getX() - x;
                        int dy = site.getY() - y;
                        if (dx * dx + dy * dy <= site.getRadius() * site.getRadius()) {
                            image[y][x] = site.getColor();
                        }
                    }
                }
            }
        }
    }

}
