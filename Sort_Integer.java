
//Arrays.sort�A�H��Comparator�������Ϊk
/*
    jdk����Arrays.sort�ƧǤ�k
    
    Arrays.sort(���O���}�C) �Ѥp��j
�@�@Arrays.sort(���O���}�C, Comparator����)
    Collections.reverseOrder() Comparator����Ѥj��p
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

public class Sort_Integer 
{
	public static void main(String[] args) 
	{
		System.out.println("Integer�Ƨ�");
    	Integer[] arrayToSort = new Integer[] { 48, 5, 89, 80, 81, 23, 45, 16, 2 };
    
    	System.out.print("�Ƨǫe:");
    	for(int i = 0; i < arrayToSort.length; i++)
    	{
      		System.out.print(arrayToSort[i] + "\t");
    	}  
    	System.out.println("\n");
    	
    	Arrays.sort(arrayToSort); //�Ѥp��j
    	    
    	System.out.print("�Ƨǫ�:");
        for(int element : arrayToSort) System.out.print(element + "\t");
    	System.out.println("\n"); 
	} 
} 