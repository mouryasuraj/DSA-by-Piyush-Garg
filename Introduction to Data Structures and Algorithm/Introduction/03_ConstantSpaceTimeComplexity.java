/*

1.If the size of the input increases, time complexity always remain constant O(1)
2.Constant space complexity:
    a.What extra space is occupied by any line in the  program is space complexity
    b.It doesn't matter the size of input. It used fixed amount of memeory space.

Example:
    public class Main{
        public static void main(String[] args){
            int[] arr = int[]{1,2,3,4}
        }
    }
    
    */

public class ConstantSpaceTimeComplexity{
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4};

        // Add 10 to the first element of an array
        arr[0] = arr[0] + 10;   // Time Com -->O(1)
        int num = arr[0];     //space Com ---> O(4bytes)
        System.out.println(arr[0]);  //Time Com -->O(1)

        //Time Com -->  O(1) + O(1) = O(2) === O(1) Constant Time Complexity
        //Space com --> O(4bytes) === O(4) Constant Space Complexity

    }
}