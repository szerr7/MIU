package Lab1;

import java.util.Random;

public class Algorithm_3 {
    public static void main(String[] args) {

        int [] arr =generate(0,1000);


    }


    // find the largest distance between a and b .
    public static int max_min(int[]arr){
        int  k=0;
        int  min =0;
        int max =0;

        while(k<arr.length) {
            if (arr[k] % 2 == 0) {
                min = arr[k];
                max = arr[k];
                k++;
            }

        }
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0 && arr[i]<min){
            min =arr[i];
        }
        if(arr[i]%2==0 && arr[i]>max){
            max= arr[i];
        }


    }


        return max-min;
    }
    // find the array of random elements that bound between lower and upper
    public static int [] generate(int lower , int upper){
        int[] randArray = new int[lower+upper+1];

        for(int i = 0; i < randArray.length; i++){

            randArray[i] = (int)(Math.random()*1000);
        }



        return randArray;
    }
}


