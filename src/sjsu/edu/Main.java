package sjsu.edu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("src/sjsu/edu/arr2-1.txt"));
        int [] arr2 = new int [50];
        int x = 0;
        while(scanner.hasNextInt()){
            arr2[x++] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr2));
        int size = arr2.length;

        for (int i = size-1; i>=1 ; i--){
            int maxIndex = i;
            for (int j= 0; j<i; j++){
                if (arr2[j] >= arr2[maxIndex])
                    maxIndex = j;
                int temp = arr2[i];
                arr2[i] = arr2[maxIndex];
                arr2[maxIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr2));





    }
}
