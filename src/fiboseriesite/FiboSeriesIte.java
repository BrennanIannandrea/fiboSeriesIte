//@author: Brennan Iannandrea
package fiboseriesite;
import java.util.Scanner;
public class FiboSeriesIte {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Insert number of values:");
        long b = a.nextLong();
        long tim = System.currentTimeMillis();
        if(b>0){
            System.out.println("0");
            b--;
            if (b>0){
                System.out.println("1");
                b--;
            }
        }
        long numberOne = 1;
        long  numberTwo = 1;
        while (b>0){
        numberOne= numberOne+numberTwo;
        System.out.println(numberOne);
        b--;
        if(b>0){
        numberTwo= numberOne+numberTwo;
        System.out.println(numberTwo);
        b--;
        }
        }
        long sTim = System.currentTimeMillis();
        long eTime = sTim - tim;
        System.out.print(eTime);
        System.out.println(" Milliseconds");
    }
    
}
