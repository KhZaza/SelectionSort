package sjsu.edu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("src/sjsu/edu/arr2-1.txt"));

        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        while(scanner.hasNextInt()){
            arr2.add(scanner.nextInt());
        }


        System.out.println(arr2);
        int size = arr2.size();

        for (int i = size-1; i>=1 ; i--){
            int maxIndex = i;
            for (int j= 0; j<i; j++){
                if (arr2.get(j) >= arr2.get(maxIndex))
                    maxIndex = j;
                int temp = arr2.get(i);
                arr2.set(i, arr2.get(maxIndex));
                arr2.set(maxIndex, temp);
            }
        }
        System.out.println(arr2);





    }
}
