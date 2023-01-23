import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main (String[] args){
        double numberRandom =4.8945;
        BigDecimal num = new BigDecimal("1.2345");
        System.out.println(roundedTwo(numberRandom));
        System.out.println(reverseSign(num));

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
