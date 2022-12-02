package Lab1;

import java.util.Random;

public class Algorithm_1 {
    public static void main(String[] args) {

        int [] arr =generate(0,1000);
        System.out.println(distance(arr,4,988));

    }


// find the largest distance between a and b .
public static int  distance(int[]arr, int a,int b){

        int [] even = new int[arr.length];
        int j=0;

        // find array of even elements
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even[j]=arr[i];
                j++;

            }
        }

        //  find the largest distance between two even number a and b;

    if(a==b)
        return 0;
    if(a>b){
        int c =a;
        a=b;
        b=c;
    }
     for(int i=0;i<even.length;i++){
         if(even[i]==a){
             for (int k=i+1; k<even.length;k++){
                   if(even[k]==b)
                     return k-i;

             }

         }


     }

    return -1;//  will return -1 if either a or b is not an element of the array
}
// find the array of random elements that bound between lower and upper
public static int [] generate(int lower , int upper){
        int[] randArray = new int[lower+upper+1];
    for(int i = 0; i < 1000; i++){

        randArray[i] = (int)(Math.random()*1000);
    }



    return randArray;
}
}