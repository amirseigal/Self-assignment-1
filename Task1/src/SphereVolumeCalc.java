public class SphereVolumeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Diameters in miles
        double earthDiameter = 7600.0;
        double sunDiameter = 865000.0;

        // Radii
        double earthRadius = earthDiameter / 2.0;
        double sunRadius = sunDiameter / 2.0;

        // Volumes (formula: 4/3 * pi * r^3)
        double earthVolume = (4.0 / 3.0) * Math.PI * Math.pow(earthRadius, 3);
        double sunVolume = (4.0 / 3.0) * Math.PI * Math.pow(sunRadius, 3);

        // Ratio
        double ratio = sunVolume / earthVolume;

        // Output
        System.out.println("The volume of the Earth is " + earthVolume + " cubic miles,");
        System.out.println("the volume of the Sun is " + sunVolume + " cubic miles,");
        System.out.println("and the ratio of the volume of the Sun to the volume of the Earth is " + ratio + ".");

	}

}
