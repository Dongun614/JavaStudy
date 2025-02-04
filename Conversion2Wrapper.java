public class Conversion2Wrapper{
    public static void main(String args){
        //using constructor
        //The constructor Integer(int) is deprecated since version 9
        Integer integer1 = new Integer(10);
        System.out.println(interger1);

        //using static factory method: valueOf()
        //The static factory valueOf(int) is generally a better choicee,
        //as it is likely to yield significantly better space and time performance
        Integer integer2 = Integer.valueOf(20);
        System.out.println(interger2);

        System.out.println(integer1 + integer2);
    }
}