import java.io.*;
import java.util.*;

class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements in the list : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int multiples[] = new int[9];
        System.out.println("Enter the list of numbers : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            for(int j=1;j<10;j++){
                if(arr[i] % j == 0 ){
                    multiples[j-1]++;
                }
            }
        }
        for(int k=0;k<9;k++){
            System.out.println(k+1 + ":"+multiples[k]);
        }
    }
}
