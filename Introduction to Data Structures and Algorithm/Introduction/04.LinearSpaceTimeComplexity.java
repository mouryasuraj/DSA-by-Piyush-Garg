/*
 
1.Linear:
    1.If the input grows your time and space grows and if the input shrinks your time and space shrinks even. O(n)
    2.An algorithm is said to have linear time complexity if the execution time is directly proportional to the size of the input data.
2.Space:
    1.n is directly proportional to the size of the input length.
    2.An algorithm is said to have linear space complexity if the amount of memory it uses is directly proportional to the size of the input data.

 */

 public class Main {
     public static void main(){
        int[] arr = new int[]{1,2,3,4};  // T.C - O(1)

        // Print every element present in the array
        for(int i=0; i<arr.length; i++){  // T.C - O(n) - Linear time complexity beacuse here loop is depend on the size of the input
                                            // S.C - O(4bytes) == O(1)
            System.out.println(arr[i]);
        }

        System.out.println(arr[0]); // T.C - O(1)

        //Total T.C - O(1) + O(1) + O(n) === O(2 + n) --> O(n) - Linear time complexiy - Ignore constant 
        // Overall
        // T.C --> O(n) and S.C ---> O(1)
     }
 }



 public class Main {
     public static void main(){
        int[] arr = new int[]{1,2,3,4};  // T.C - O(1) | S.C -O(1)

        // Print every element present in the array
        for(int i=0; i<arr.length; i++){  // T.C - O(n) | S.C - O(4bytes) == O(1)
            System.out.println(arr[i]);
        }

        // Copy the data of arr and print the copied data
        int[] anotherArr = new int[arr.length]; // T.C - O(n) | S.C - O(n)
        for(int i=0; i<arr.length; i++){   //T.C - O(1) | S.C -O(1)
            anotherArr[i] = arr[i];
        }

        // Print copied data
        for(int num : anotherArr){   //T.C - O(n) | S.C - O(1)
            System.out.println(num);
        }

        System.out.println(arr[0]); // T.C - O(1)

        // Overall
        // T.C --> 1 + 1 + 1 + n + n + n ----> O(3 + 3n) ---> O(3n) -- > O(n) - Linear Time complexity
        // S.C ---> 1+1+1+n ---> O(3+n) --> O(n)  --> Linear Space COmplexity
     }
 }