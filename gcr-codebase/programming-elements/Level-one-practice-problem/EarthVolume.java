
//Creating a class with name AgeCalculation to calculate the volume of the Earth in cubic kilometers and cubic miles
public class EarthVolume {
    public static void main(String[] args) {
        //Radius of the Earth in kilometers
        int radius = 6378;

        //Calculate volume of Earth using formula: (4/3) * pi * r^3
        double volumeInKilometers = (4.0/3.0) * 3.14 * Math.pow(radius, 3);

        //Convert cubic kilometers to cubic miles 
        double volumeInMiles = volumeInKilometers * Math.pow(0.621371, 3);

        System.out.println("The volume of Earth in cubic kilometers is " + volumeInKilometers + " and in cubic miles is " + volumeInMiles);
    }
}
