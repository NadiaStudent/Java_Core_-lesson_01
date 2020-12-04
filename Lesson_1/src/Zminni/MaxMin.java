package Zminni;
import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
			public static void main(String[] args) {
	  
	System.out.println("Уведіть 10 цілочисельних елементів масиву");			
	Scanner input = new Scanner(System.in);
	int size=10;
	int[] a =new int[size];
		for(int i = 0; i<size;  i++)
 		{ a[i] = input.nextInt();	}
						
    Arrays.sort(a);
	System.out.println("найменше число: " + a[0]);
    System.out.println("найбільше число: " + a[size-1]);
			}
	}

//first commit to gitHub