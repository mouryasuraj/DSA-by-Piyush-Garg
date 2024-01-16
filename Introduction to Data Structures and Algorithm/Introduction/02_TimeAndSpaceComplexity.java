/*

1.Time Complexity:
    a.Time complexity is a measure of how the running time of algorithm increase with the inputs.
    b.It helps us to understand that how efficient an algorithm is in terms of time as the input grows larger.
    c.We use Big O notation to express time complexity. Big O provides an upper bound on the growth rate of the running time.
    d.There are 3 ways to express time complexity:
        a.Big-O (Mostly used) because it gives an upper bound or worst case of how the running time or space requirement of an algorithm grow as input size increases.
            1.Constant time - O(1)
            2.Linear time - O(n)
            3.Log time - O(log n)
            4.Quadratic time- O(n^2)
            5.Cubic time- O(n^3)
        b.Theta-O
        c.Omega-O

2.Space complexity:
    a.Space complexity is a measure of how much memroy algorithm need in relation to the size of  input processess.
    b.It helps us to understand how the memory requirement of an algorithm grow as the input size increases.
            1.Constant space - O(1)
            2.Linear space - O(n)
            3.Quadratic space- O(n^2)

 */

//  Examples
// Constant - O(1)

public class TimeAndSpaceComplexity{
    public static void main(String args[]){
        // Big O(1) - Constant
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(arr[0]);    //O(1), Here big O is constant because If length of the array goes to one million items or just one item it will take constant time to give output.
    }
}