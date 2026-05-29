public class ArrayUpdate {
    public static void main(String[]args){
        int[]numbers={10,20,30,40,50};

        System.out.println("Element atindex 2:"+numbers[2]);
        numbers[2]=35;
        
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
