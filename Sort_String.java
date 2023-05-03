/*�̦r����ױƧ�
  �ۭqComparator����*/

import java.util.Arrays;
import java.util.Comparator;

public class Sort_String 
{ 
  	public static void main(String[] args) 
  	{
  		System.out.println("String�Ƨ�");
    	String[] names = { "Oscar", "Charlie", "Ryan", "Ted", "David" };
    	System.out.print("�Ƨǫe:");
    	for(String element : names)
    	{
      		System.out.print(element + "\t");
    	}
    	System.out.println("\n");
      
    	Arrays.sort(names, new MyComparator());

    	System.out.print("�Ƨǫ�:");
    	for (String element : names) System.out.print(element + "\t");

   		System.out.println("\n");  
  	} 
}

class MyComparator implements Comparator
{
  public int compare(Object first, Object second) 
  {
    int len1 =  ((String)first).length();
    int len2 =  ((String)second).length();
 
    if(len1>len2)
        return -1;
    else if(len1==len2)
        return 0;
    else
        return 1;

    //return len2-len1;           
  }
}
