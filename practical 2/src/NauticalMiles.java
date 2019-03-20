public class NauticalMiles {
    public static void main(String[] args){
        double kilometers=1.852;
        double miles=1.150779;
        double nauticalMiles;

        nauticalMiles=kilometers*0.539956803;
        System.out.println(kilometers+" kilometers = "+ nauticalMiles+ " nautical miles");
        nauticalMiles=miles*0.868976242;
        System.out.println(miles+" miles = "+ nauticalMiles+ " nautical miles");
    }
}
