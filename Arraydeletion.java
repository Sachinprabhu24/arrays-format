public class Arraydeletion{
    public static void main(String [] args){
        int []numbers={10,20,30,40,50};
        int deletionArray=2;
        for (int i=deletionArray;i<numbers.length-1;i++){
            numbers[i]=numbers[i+1];
        }
        numbers[numbers.length-1]=0;
        for (int i=0;i<numbers.length-1;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}