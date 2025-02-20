public class AutoUnboxing{
    public static void main(String[] args){
        List<Integer> integerList = new ArrayList<>();
        for(int i=1; i<=5; i++){
            integerList.add(i);
        }
        System.out.println(integerList);

        int sumOfEven = 0;
        for(integer i: integerList){
            if(i % 2 == 0){
                sumOfEven += i;
            }
        }

        System.out.println(sumOfEven);
    }
}

//wntjr cnrk