public class ArrayLengthBoundcheck {
    public static void main(String[]args){
        int[]numbers={10,20,30,40,50};
        System.out.println("Array length:"+numbers.length);
        // This will cause an ArrayIndexOutOfBoundsException
        System.out.println("Element at index 5:"+numbers[5]);
    }
}
