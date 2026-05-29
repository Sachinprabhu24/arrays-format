public class ArrayInsertion {
    public static void main(String[]args){
        int[]numbers={10,20,30,40,50};
        int insertindex=2;
        int insertvalue=25;

        for(int i =numbers.length-1;i>insertindex;i--){
            numbers[i]=numbers[i-1];
        }
        numbers[insertindex]=insertvalue;

        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
