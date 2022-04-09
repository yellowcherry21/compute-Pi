package by;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.random;

public class PiMain {
    public static void main(String[] args) {
        System.out.println(random());

        double n = 1000000;
        double b = 0;

        List<Point> points = new ArrayList<>();

        for (int i = 0; i < n; i++){
            Point center = new Point(0.5,0.5);
            Point p = new Point(random(),random());

            points.add(p);

            if(p.getDistance(center) <= 0.5) {
                b++;
            }
        }

        double pi = 4*b/n;

        System.out.println(b + "\n" + n + "\n" + pi);
    }
}
