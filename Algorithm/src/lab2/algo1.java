package lab2;

public class algo1 {
    public static void main(String[] args) {


        int [] arr = {20, 20, 18, 4, 2, 19, 20, 3} ;

        threeMax(arr);

    }

    /*Algorithm 1 : Idea – Use three loops one after another. First will find Max. Second will find Second Max,
Third will find third max. Note that it is possible First max == second Max == Third Max as in
7, 20, 18, 4, 20, 19, 20, 3.
and your program should return 20 in this case.*/

    public static  void threeMax(int [] array) {

        int firstMax = array[0];
        
        int firstMaxIndex = 0;

        int secondMax = array[0];
        int secondMaxIndex = 0 ;

        int thirdMax = array[0];


        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstMax) {

                firstMax = array[i];
                firstMaxIndex = i;

            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > secondMax && i!=firstMaxIndex){
                secondMax = array[i];
                secondMaxIndex = i ;

            }

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > thirdMax && i!=firstMaxIndex && i!=secondMaxIndex){
                thirdMax = array[i];
            }

        }





        System.out.println("first max : " + firstMax);
        System.out.println("second max : " + secondMax);
        System.out.println("third max  : " + thirdMax);


    }

}
