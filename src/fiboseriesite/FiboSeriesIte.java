//@author: Brennan Iannandrea
package fiboseriesite;
import java.util.Scanner;
public class FiboSeriesIte {// made to work without temp value
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Insert number of values:");
        long b = a.nextLong();
        long tim = System.currentTimeMillis();//take start time
        if(b>0){ // handle teh 0 and the first 1
            System.out.println("0");
            if (b>0){
                System.out.println("1");
                b--;
            }
        }
        long numberOne = 0;
        long  numberTwo = 1;
        while (b>0){// do the first variable
        numberOne= numberOne+numberTwo;
        System.out.println(numberOne);
        b--;
        if(b>0){//switch it to work for the other variahle
        numberTwo= numberOne+numberTwo;
        System.out.println(numberTwo);
        b--;
        }
        }
        long sTim = System.currentTimeMillis();// take end time
        long eTime = sTim - tim;//calculate end time
        System.out.print(eTime);
        System.out.println(" Milliseconds");
    }
    
}
