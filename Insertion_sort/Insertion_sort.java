package com.mikecodes.Insertion_sort;

public class Insertion_sort {


    public void insertion_sort(Integer[] numbers){

        for(int i=1; i<numbers.length;i++){
            int currentValue=numbers[i];
            int j=i-1;
            while(j>=0 && numbers[j]>currentValue){
                numbers[j+1]=numbers[j];  //shifting to the right.
                j--;
            }
            numbers[j+1]=currentValue;  //Setting the value to its position
        }

    }

    void insertion_display(Integer[] numbers) {

        System.out.println("====================");
        for (int n=0; n<numbers.length; n++) {

            System.out.println(numbers[n]);
        }
    }



}
