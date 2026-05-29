public class ArrayTraversal {
    public static void main(String []args){
        int[]numbers=new int[5];
        String []names={"John","Jame","Jack","Jill"};
        System.out.println("Number array:");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]);
        }
        System.out.println("\nName array:");
        for(int i=0;i<names.length;i++){
            System.out.print(names[i]);
        }
    }
}
