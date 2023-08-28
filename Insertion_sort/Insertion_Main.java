package com.mikecodes.Insertion_sort;

import java.util.Random;
import java.util.Scanner;

public class Insertion_Main {

    public static void main(String agr[]){

        Insertion_sort is = new Insertion_sort();
        Random rm = new Random();
        System.out.println();
        System.out.println("================================== Insertion Sort =============================================");
        Random ran = new Random();
        System.out.print("Enter a Number Between 1-100:  ");

        try {

            Scanner scanNumber = new Scanner(System.in);
            int inNumber = scanNumber.nextInt();
            if(inNumber >100){
                return;
            }
            Integer  [] numbers = new Integer [inNumber];

            for(int h=0; h<inNumber; h++){

                numbers[h] = ran.nextInt(100);
            }
            //Insertion_sort is = new Insertion_sort();
            System.out.println("=====================================Before Insertion Sorted====================================================");
            is.insertion_display(numbers);
            System.out.println();
            System.out.println("======================================After Insertion Sorted====================================================");
            is.insertion_sort(numbers);
            System.out.println();
            is.insertion_display(numbers);
        }
        catch (Exception exception){

            System.out.println();
            System.out.println(exception);

        }



    }
}
