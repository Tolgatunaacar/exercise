import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dizi boyutunu girin:");
        int n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0 ; i < n ; i++){
            System.out.println("Dizideki "+ (i+1) + ".sayi:");
            int x = input.nextInt();
            arr[i]=x;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
