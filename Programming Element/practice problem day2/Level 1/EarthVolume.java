import java.util.*;

public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378.0;
        double pi = Math.PI;

        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);
        double volumeMi = volumeKm3 / Math.pow(1.609, 3);

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm +" and cubic miles is " + volumeMi);
    }
}
