package sjsu.edu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Selection Sort");

        //open the file as a scanner
        Scanner scanner = new Scanner(new File("src/sjsu/edu/arr2-1.txt"));

        //Create an array to store the integers
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        //while loop to add the integers to the array
        while(scanner.hasNextInt()){
            arr2.add(scanner.nextInt());
        }


        //print the unsorted array
        System.out.println("Unsorted: " + arr2);
        //size of the array
        int size = arr2.size();

        //for loop to go through the size of the array decrement
        for (int i = size-1; i>=1 ; i--){
            //declaring the first index as max
            int maxIndex = i;
            //for loop to go through the array, while not sorting the already sorted which are n
            for (int j= 0; j<i; j++){
                //if the array is bigger than the "max" swap both
                if (arr2.get(j) >= arr2.get(maxIndex))
                    maxIndex = j;
                //swap function
                int temp = arr2.get(i);
                arr2.set(i, arr2.get(maxIndex));
                arr2.set(maxIndex, temp);
            }
        }
        //print the sorted array
        System.out.println("Sorted: " + arr2);





    }
}

//output
/*
Selection Sort
Unsorted: [97, 72, 97, 49, 76, 88, 97, 9, 100, 57, 35, 73, 18, 85, 33, 49, 94, 72, 74, 22, 8, 21, 61, 34, 75, 54, 43, 26, 28, 79, 60, 10, 4, 63, 48, 89, 83, 18, 45, 51, 93, 17, 84, 47, 20, 9, 32, 96, 82, 70]
Sorted: [4, 8, 9, 9, 10, 17, 18, 20, 18, 21, 22, 26, 28, 32, 33, 34, 35, 43, 45, 47, 48, 49, 49, 51, 60, 61, 54, 63, 57, 70, 72, 72, 74, 73, 75, 76, 79, 84, 82, 83, 88, 94, 85, 93, 89, 97, 96, 97, 97, 100]

 */