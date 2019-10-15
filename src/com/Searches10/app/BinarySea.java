package com.Searches10.app;

import java.util.Random;
import java.util.Scanner;

public class BinarySea
{
     


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		final int ELEMENTS_ARRAY=100;
		
		int numberToFind=0;
		int indexFound=1;
		int limInf=0;
		int limSuper=ELEMENTS_ARRAY;
		int Pivotal= (limInf-limSuper)/2;
		int temp=0;
		
		//array
		
		int[]miArray= new int[ELEMENTS_ARRAY];
		
		
		Random randomNumbers = new Random(System.nanoTime());
		Scanner input=new Scanner(System.in);
		
		//initia
		
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		 {
			miArray[i]=randomNumbers.nextInt(101);
		 }
		//visualization
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		 {
			System.out.println(miArray[i]+" ");
			
		 } 
		System.out.println("");
		//ask number
		do
		{
		 
			System.out.println("input number in the array 0 to 100:");
			numberToFind= input.nextInt();
			if(numberToFind<0)
				}
			{
			
				System.out.println("number must be xzero or positive");
			}
		
		 
			
			
		//sorting
			for(int i=0;i<ELEMENTS_ARRAY;i++)
				{for(int j=0;j<ELEMENTS_ARRAY;j++)
				{if(miArray[j]>miArray[j+1])
				{temp=miArray[j+1];
				miArray
				}
				}
		 }
		
		while(numberToFind<0);
		//binary search
		while(limInf<=limSuper);
		 {
			pivotal=(limSuper-limInf)/2;
			if(numberToFind==miArray[pivotal])
			{
				indexFound=pivotal;
			break;
				
			}
		 
		else if (numberToFind>miArray[pivotal])
		 { 
		
			limInf=pivotal+1;
		 }
		else if (numberToFind<miArray[pivotal])
		 { 
		
			limInf=pivotal-1;
		 }
			if(indexFound!=-1)
			{System.out.println("Element found in index:"+indexFound);
		 }
			
			
			


		
		
		
			
			
		 
}