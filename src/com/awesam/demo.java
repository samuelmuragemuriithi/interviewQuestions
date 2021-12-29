package com.awesam;
import java.util.*;
public class demo {
        public int solution(int[] A) {
            HashSet<Integer>hashset = new HashSet<>();
            for(int i:A){
                if(i>0)hashset.add(i);
            }
            for(int i =1;i<=A.length+1;i++){
                if(!hashset.contains(i))return i;
            }
            return 1;
        }
        static  Integer[] removeD(int[]A){
            HashSet <Integer>hashSet=new HashSet<>();
            for (int i : A) hashSet.add(i);
            Integer[] myArray = new Integer[hashSet.size()];
            hashSet.toArray(myArray);
            return myArray;
        }
        static void Rduplicates(int[]A){
            int [] result = new int[A.length];
            HashMap<Integer,Integer>hashMap=new HashMap<>();
            for (int i : A){
                if (!hashMap.containsKey(i))hashMap.put(i,1);
                else hashMap.put(i, hashMap.get(i)+1);
            }System.out.print("repeated elements are: " );
            for (int i : hashMap.keySet()) {
                if (hashMap.get(i)+1>2) System.out.print( i+",");
            }
            System.out.println();
            System.out.println(hashMap);
        }
        static int[] sort(int[]A){
            int [] result = new int[A.length];
            int max =0,min=0;
            for (int i = 0; i < A.length; i++) {
               if (A[i]>max)max=A[i];
               if (A[i]<min)min=A[i];
            }
            HashSet<Integer>hashSet=new HashSet<>();
            for (int i : A) {
                hashSet.add(i);
            }int k=0;
            for (int i = 0; i < max+1; i++) {
                if (hashSet.contains(i)){
                    result[k]=i;
                    k++;
                }
                }

            return result;
        }
        public static void main(String[]ars){
            int [] A = {4,6,7,2,1,9,8};
            demo dm = new demo();
            System.out.println(dm.solution(A));

            System.out.print("Before sort: ");
            System.out.println(Arrays.toString(A));
            System.out.print("After sort: ");
            System.out.print(Arrays.toString(sort(A)));


            System.out.println();
            int[]A2={2,2,2,3,3,4,4,5,6,7};
            System.out.println(Arrays.toString(removeD(A2)));

            Rduplicates(A2);
        }
    }

