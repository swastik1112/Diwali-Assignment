// How to convert ArrayList to String Array in java ?

import java.util.ArrayList;
import java.util.Arrays;
 

class Q23 {
 
 
    public static void main(String[] args)
    {
 

        ArrayList<String> al = new ArrayList<String>();
 

        al.add("Swastik Awaze");
        al.add("Vishal Tighare");
        al.add("Abhishek Kulkarni");
        al.add("Lukesh Manusmare");
 
        String[] str = new String[al.size()];
 
        for (int i = 0; i < al.size(); i++) {
            str[i] = al.get(i);
        }

        for (String k : str) {
            System.out.println(k);
        }
    }
}