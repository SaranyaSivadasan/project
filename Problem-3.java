import java.io.*;
import java.util.*;

class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int num = (x % 2 == 0) ? x-1 :  x;
        for(int i=1;i<num*2;i=i+2){
            System.out.print(i+" ");
        }
    }
}
