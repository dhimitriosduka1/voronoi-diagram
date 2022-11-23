import utils.ImageUtils;
import entity.Site;
import utils.SiteUtils;
import entity.Voronoi;
import ppm.PPMImageWriter;

import java.awt.*;
import java.io.IOException;
import java.util.List;

public class Main {

    final static int WIDTH = 800;
    final static int HEIGHT = 600;
    final static int RADIUS = 5;
    final static int SITE_AMOUNT = 10;

    final static String PATH = "output.ppm";

    public static void main(String[] args) throws IOException {

        Color[][] image = ImageUtils.init(HEIGHT, WIDTH);

        List<Site> sites = SiteUtils.initRandom(SITE_AMOUNT, RADIUS, image);

        Voronoi.render(sites, image);

        SiteUtils.fill(sites, image);

        PPMImageWriter.saveImageAsPPM(PATH, image);

    }
}