package Lab1;

import java.util.*;

public class Algorithm_4 {
    public static void main(String[] args) {
       Integer[] arr= generate(0,10000);
        System.out.println(max_min(arr));
    }
public static Integer max_min (Integer arr[]){
        List<Integer>list = Arrays.asList(arr);

    Integer max = list.stream().max((a,b)->(a-b)).get();
    Integer min =list.stream().min((a,b)->(a-b)).get();
    return max-min;
}



public static Integer[] generate(int lower , int upper){
        Integer[] randArray = new Integer[lower+upper+1];

        for(int i = 0; i < randArray.length; i++){

            randArray[i] = (int)(Math.random()*10000);
        }



        return randArray;
    }
}
