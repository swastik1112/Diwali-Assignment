// Write a program to remove a given character from String?


package com.demo3;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c =  sc.next().charAt(0);
        getValues(str,c);
    }
    private static void getValues(String str, char c) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(c!=str.charAt(i)){
                sb.append(str.charAt((i)));
            }
        }
        System.out.println(sb);
    }
}