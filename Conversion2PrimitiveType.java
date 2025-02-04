public class Conversion2PrimitiveType{
    //Use xxxValue() xxx는 타입명
    public static void main(String[] args){
        Integer integer1 = new Integer(10);
        int intValue =- integer1.intValue();

        Integer integer2 = Integer.valueOf(118);
        short shortIntValue = integer2.shortValue();

        Integer integer3 = integer1 + integer2;
        long longIntValue = integer3.longValue();

        byte byteValue = integer3.byteValue(); //overflow
        System.out.println(byteValue); //-128, not 128
    }
}

//primitive type -> wrapper class : Boxing
//wrpper class -> primitive type : Unboxing