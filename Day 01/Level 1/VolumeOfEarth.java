public class VolumeOfEarth {
    public static void main(String[] args){
        double radiusKilometer = 6378;
        double volume = (4.0/3) * Math.PI * Math.pow(radiusKilometer, 3);

        double radiusMiles = radiusKilometer * 0.621371; //0.621371 is conversion factor for Km to miles conversion
        double volumeMiles = (4.0/3) * Math.PI * Math.pow(radiusMiles, 3);
        System.out.printf("The volume of earth in cubic kilometers is %.3f  and cubic miles is %.3f" , volume, volumeMiles);
        
    }    
    
}
