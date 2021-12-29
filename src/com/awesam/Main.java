package com.awesam;

import java.util.*;


public class Main {
    static  void swap(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==-1){
                int temp = arr[i];
                arr[i]=arr[arr.length-1];
                arr[arr.length-1]=temp;
            }

        }
    }
    static int solution (int [] A) {
        if (A[A.length-1] == -1) return A.length;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == -1) {
                int temp = A[i];
                A[i] = A[A.length - 1];
                A[A.length - 1] = temp;
            }
        }
        int count = 0;
        int current = 1;
        while (A[current+1 ] != -1) {
            count++;
            current = current + 1;
        }
        return count;
    }
static int parking(String E,String L){
        String [] arrv= E.split(":");
        int hours = Integer.parseInt(arrv[0]);
        int mins =Integer.parseInt(arrv[1]);
        int arrival=(hours*60)+mins;
        String [] dep= L.split(":");
        int hour1 = Integer.parseInt(dep[0]);
        int min1 =Integer.parseInt(dep[1]);
        int depature=(hour1*60)+min1;
        int timeDiff = depature-arrival;
        int ent= 2;
        int firstH=3;
        int afterH=4;
        int timeH=(timeDiff-60);
        int time=(timeH%60==0)?timeH/60:(timeH/60)+1;

        int amount=(timeDiff<=60)
                ?ent+firstH
                :ent+firstH+(time*afterH);
        return amount;
    }
static int parityDegree(int N){
        int result=0;
        double power=0;
        while(result<=N){
            power++;
            result=(int)Math.pow(2,power);

        }
        while(true){
            if(N%result==0)break;
            else power--;
            result=(int)Math.pow(2,power);
        }
        return (int)power;
}
  static  String partern(int A, int B) {
      char[] result = new char[A + B];
    if (A>B&&A-B>3)return ("NA");
        if (B>A&&B-A>3)return ("NA");
        if(A==0||B==0)return ("ab");
      for (int i = 0; i < A; i++) {
          result[i]='a';
      }
      for (int j = A; j < result.length; j++) {
          result[j]='b';
      }

      if (A == B) {
          for (int i = 0; i < A + B; i++) {
              result[i] = (i % 2 != 0) ? 'a' : 'b';
          }
      }
      else if(A>B){
          int n =result.length-1;
          if ((A%B)==1){
              int position =1;
              while (position<A){
                  char temp = result[position];
                  result[position]=result[n];
                  result[n]= temp;
                  position+=2;
                  n=n-2;
              }
          }
          else {
              int position = 2;
              while (position < A) {
                  char temp = result[position];
                  result[position] = result[n];
                  result[n] = temp;
                  position += 3;
                  n = n - 3;
              }
          }
      }
      else{
          for (int i = 0; i < B; i++) {
              result[i]='b';
          }
          for (int j = B; j < result.length; j++) {
              result[j]='a';
          }


          int  n =result.length-1;
          if (B/A==1){
              int position =1;
              while (position<B){
                  char temp = result[position];
                  result[position]=result[n];
                  result[n]= temp;
                  position+=2;
                  n=n-2;
              }
          }
          int position =2;
          while (position<=B){
              char temp = result[position];
              result[position]=result[n];
              result[n]= temp;
              position+=3;
              n=n-3;
          }

      }
      String b = new String(result);
      return  b;
  }


    public static void main(String[] args) {
	int [] arr = {1,4,-1,3,2};
        swap(arr);
        System.out.print(Arrays.toString(arr));

        System.out.println();
        System.out.print("*Q0: ");
        System.out.println(solution(arr));

        System.out.print("Q1: ");
        String E ="10:00";
        String L ="13:21";
        System.out.println(parking(E,L));

        System.out.print("Q2: ");
        System.out.println(parityDegree(24));

        int min = 1;
        if (min<2)min=2;
            System.out.println(min);

        System.out.println((partern(3,0)));


    }
}
