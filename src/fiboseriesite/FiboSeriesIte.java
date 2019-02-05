//@author: Brennan Iannandrea
package fiboseriesite;
import java.util.Scanner;
public class FiboSeriesIte {
    public static void main(String[] args) {Scanner a = new Scanner(System.in);
        System.out.println("Insert number of values:");
        long b = a.nextLong();
        long tim = System.currentTimeMillis();
        long numberOne = 1;
        long  numberTwo = 1;
        System.out.println(numberOne);
        System.out.println(numberTwo);
        while (numberOne + numberTwo <= b){
        numberOne= numberOne+numberTwo;
        System.out.println(numberOne);
        if(numberOne+numberTwo<= b){
        numberTwo= numberOne+numberTwo;
        System.out.println(numberTwo);
        }
        }
        long sTim = System.currentTimeMillis();
        long eTime = sTim - tim;
        System.out.print(eTime);
        System.out.println(" Millioseconds");
    }
    
}
