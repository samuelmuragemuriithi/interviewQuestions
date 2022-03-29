package com.awesam;

import java.util.ArrayList;
import java.util.List;

public class Toptal {
    static int solution(String[]T,String[]R){
        int count=0;
        int counter=0;
        for (int i = 0; i <T.length; i++) {
            String string = T[i];
           //String lastElement=(string.substring(string.length() - 1));
            //char[] lastChar = lastElement.toCharArray();
           if( Character.isLetter(string.charAt(string.length()-1))){
               counter++;
             if (R[i].equals("OK")) {
                 count++;
              }
           }
        }
        return (count*100)/counter;
    }
    public static int solution1(int[] A) {

        List<Integer> l = new ArrayList<Integer>();
        List<Integer> s = new ArrayList<Integer>();


        for (int j : A) {
            if (!l.contains(j)) {
                l.add((Integer) j);
            } else if (l.indexOf(j) == 0) {
                l.remove((Integer) j);
                l.add((Integer) j);
            } else {
                l.add((Integer) j);
            }
        }


        for (int i = l.size() - 1; i >= 0; i--) {
            if (s.indexOf(l.get(i)) == -1) {
                s.add(l.get(i));
            } else if (s.indexOf(l.get(i)) == 0) {
                s.remove(l.get(i));
                s.add(l.get(i));
            } else {
                s.add(l.get(i));
            }
        }

        for (Integer e : s) {
           // System.out.println(e);
        }

        return s.size();
    }
        public static void main(String[] args) {
        String[]T={"t1","t3","t2","t4b","t4a"};
        String[]R={"Wrong answer","OK","OK","Runtime error","OK"};
        String string=T[3];
        if( Character.isLetter(string.charAt(string.length()-1))) System.out.println(string);
        System.out.println(solution(T,R));

        int[]array1={7,3,7,3,1,3,4,1};
            int[]array2={2,1,2,3,2,1,1,3};

            int[]array3={7,5,2,7,2,7,4,7};

            System.out.print(solution1(array1));
    }
}
