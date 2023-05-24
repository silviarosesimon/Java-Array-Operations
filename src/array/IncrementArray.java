package array;

public class IncrementArray {

    public static void main(String args[]) {
        int[] intArr = {1,2,3,4,5};
        System.out.println("Before Increment");
        printArray(intArr);
        intArr = incrementArray(intArr);
        System.out.println("After Increment");
        printArray(intArr);
    }

    public static int[] incrementArray(int[] intArr) {
        for(int i=0; i<intArr.length; i++) {
            intArr[i] = ++intArr[i];
        }
        return intArr;
    }

    public static void printArray(int[] intArr) {
        for(int i=0; i<intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }
}
