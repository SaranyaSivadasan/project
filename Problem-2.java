import java.io.*;
import java.util.*;

class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1;i<x*2;i=i+2){
            System.out.print(i+" ");
        }
    }
}
