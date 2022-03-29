package com.awesam;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class pattern {
    static boolean isPattern(int []array) {
        int odd = 0;
        int even = 0;
        if (array[0] % 2 == 0) {
            for (int j : array) {
                if (j % 2 == 0) even++;
                else break;
            }
            for (int i = even; i < array.length; i++) {
                if (array[i] % 2 != 0) odd++;
                else break;
            }
        } else {
            for (int j : array) {
                if (j % 2 != 0) odd++;
                else break;
            }
            for (int i = odd; i < array.length; i++) {
                if (array[i] % 2 == 0) even++;
                else break;
            }

        }

        Stack<Integer> stack = new Stack<>();
        for (int j : array) {
            stack.push(j);
        }
        while (!stack.isEmpty()) {
            if (stack.peek()%2==0){
                if (!removeEven(stack,even))
               return false;
            }
            else if (stack.peek()%2!=0){
                if (!removeOdd(stack,odd))
             return false;
            }
        }
           return true;
    }
    static boolean removeEven(Stack<Integer>stack,int even){
        int count = 0;

                    while (!stack.isEmpty()&&stack.peek() % 2 == 0) {
                        count++;
                        stack.pop();
                    }

            return even == count;
        }
    static boolean removeOdd(Stack<Integer>stack,int odd){
        int count = 0;

                while (!stack.isEmpty()&&stack.peek() % 2 != 0) {
                    count++;
                    stack.pop();
                }
        return odd == count;
    }

    public static void main(String[] args) {
        int []array={1,3,2,4,5,7,9};
        System.out.println(isPattern(array));
        Scanner scanner=new Scanner(System.in);
        int value1= scanner.nextInt();
        scanner.nextLine();
        int value2= scanner.nextInt();
        scanner.nextLine();
        int value3= scanner.nextInt();
        scanner.nextLine();
        int[]arry={value1,value2,value3};
        for (int i = 0; i < arry.length ; i++) {
            for (int j = i + 1; j< arry.length ; j++) {
                if (arry[i] > arry[j]) {
                    int temp = arry[i];
                    arry[i] = arry[j];
                    arry[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arry));
        System.out.println("==================");

//        Input value1: value1=read input
//        Declare a variable sum
//        Loop through till value1=-1
//        Add sum to value1
//        Return sum

        int sum=0;
        while (true){
            int val1=scanner.nextInt();
             if (val1==-1)break;
            sum+=val1;
        }
        System.out.println(sum);
    }
}
