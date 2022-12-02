package lab2;

public class algo2 {
    public static void main(String[] args) {

        int [] arr = {2, 20, 18, 40, 2, 19, 2, 3} ;

        printMaxThree(arr);

    }
    /*
    * Algorithm 2 : Idea – Use one loop. Maintain three variable max, preMax and prePreMax such that max
will have the maximum value, preMax will have the second largest and prePreMax will have the third
largest value.*/

    static  void printMaxThree(int [] array){

        int  max  = array[0] ;
        int preMax  = array[0] ;
        int prePreMax = array[0] ;

        int indexOne = 0 ;
        int indexTwo = 0 ;


        for (int i = 0; i < array.length; i++) {

            if (array[i] > max){
                prePreMax = preMax ;
                preMax = max ;
                max = array[i] ;

                //max = Math.max(max ,array[i]) ;
            } else if (array[i] > preMax) {

                prePreMax= preMax ;
                preMax = array[i] ;

                //preMax = Math.max(preMax , array[i]) ;

            } else if (array[i] >= prePreMax) {

                prePreMax = array[i] ;

                //prePreMax = Math.max(prePreMax , array[i]) ;

            }

        }


        System.out.println(max);
        System.out.println(preMax);
        System.out.println(prePreMax);
    }
}
