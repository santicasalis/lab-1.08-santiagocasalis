import Classes.Sedan;
import Classes.Truck;
import Classes.UtilityVehicle;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main (String[] args){
        double numberRandom =4.8945;
        BigDecimal num = new BigDecimal("1.2345");
        System.out.println(roundedTwo(numberRandom));
        System.out.println(reverseSign(num));

        Sedan focus= new Sedan("vinda54s","ford","Focus", 120000);
        Truck fordCargo2500=new Truck("vinsga2500","ford","cargo2500", 300000,5);
        UtilityVehicle ranger=new UtilityVehicle("vindhads500","ford","ranger",10000,true);
    }

    public static BigDecimal roundedTwo(double number){
        BigDecimal bd= new BigDecimal(number);
        BigDecimal roundOff= bd.setScale(2, RoundingMode.FLOOR);
        return(roundOff);
    }

    public static BigDecimal reverseSign(BigDecimal number){
 number= number.multiply(BigDecimal.valueOf(-1));
 return number.setScale(2, RoundingMode.FLOOR);

    }
    
}
