package java_list_interface;
import java.io.*;
import java.util.*;
public class _11_Vector {
	 public static void main(String[] args)
	    {
	        int n = 5;
	        List<Integer> v = new Vector<Integer>(n);
	        for (int i = 1; i <= n; i++)
	            v.add(i);
	        System.out.println(v);
	        // Remove element at index 3
	        v.remove(3);
	        System.out.println(v);
	        for (int i = 0; i < v.size(); i++)
	            System.out.print(v.get(i) + " ");
	    }
}
