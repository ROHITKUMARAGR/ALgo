package package2;

import java.io.*; import java.util.Scanner; public class linearsearch {  public static void main(String[] args)  {   Scanner scan = new Scanner(System.in);   System.out.println("Enter the number of elements in list: ");   int n = scan.nextInt();   int a[];   int i = 0;   a = new int[n];   System.out.println("Enter the elements for the list: ");   for(i=0;i<n;i++)   {    a[i] = scan.nextInt();   }   System.out.println("Enter the element you want to search: ");   int x = scan.nextInt(); 
for(i=0;i<n;i++)   {    if(a[i]==x)    {      System.out.println("The element is present at position " + (i+1) +" in the list.");     break;       }   }   if(i > n-1)   {    System.out.println("The element is not present in the list.");   } 

}
}
