package entity;

import utils.MathUtils;

import java.awt.*;
import java.util.List;

public class Voronoi {

    private static final List<Color> pallet = List.of(
            Color.ORANGE,
            Color.BLUE,
            Color.YELLOW,
            Color.GREEN,
            Color.RED,
            Color.DARK_GRAY,
            Color.MAGENTA,
            Color.CYAN
    );

    public static void render(List<Site> sites, Color[][] image) {
        for (int i = 0; i < image[0].length; i++) {
            for (int j = 0; j < image.length; j++) {
                int closestSiteIndex = 0;
                for (int k = 1; k < sites.size(); k++) {
                    Site closestSite = sites.get(closestSiteIndex);
                    Site candidateSite = sites.get(k);

                    int distanceOne = MathUtils.euclideanDistance(closestSite.getX(), closestSite.getY(), i, j);
                    int distanceTwo = MathUtils.euclideanDistance(candidateSite.getX(), candidateSite.getY(), i, j);

                    if (distanceTwo < distanceOne) {
                        closestSiteIndex = k;
                    }
                }
                image[j][i] = pallet.get(closestSiteIndex % pallet.size());
            }
        }
    }
}
