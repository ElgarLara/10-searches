package com.Searches10.app;

import java.util.Random;
import java.util.Scanner;

public class searchers 
{

	public static void main(String[] args)
	{
		// constants
		final int ELEMENTS_ARRAY=100;
		int bound=0;
		int numberToFind=0;
	    int indexFound=-1;  
	    
	   boolean isFound=false;
		//Array
		int[]vector = new int[ELEMENTS_ARRAY];
		
		Random numbers = new Random(System.nanoTime());
		Scanner input=new Scanner(System.in);
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			vector[i] = numbers.nextInt(101);
		
		}
		for(int i =0;i<ELEMENTS_ARRAY;i++)
		{
			System.out.println(vector[i]+" ");
		}
		do
		{
			System.out.println("input value inside array");
			numberToFind=input.nextInt();
			if(numberToFind<0)
			{
				System.out.println("number grater or equal than");
				
			}
		}
		while(numberToFind<0);
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			if(numberToFind==vector[i]);
			{indexFound=i;
			break;
			}
			
		}
		if( indexFound!=-1)
		{System.out.println("element in index"+indexFound);
		
		}
		else
		{
		System.out.println("element in index not found");
		
		}
		int i=0;
		while(!isFound==true&& i<ELEMENTS_ARRAY)
		{if(numberToFind==vector[i])
		{
			indexFound=i;
			isFound=true;
		}
		}
		}
			input.close();
		

	}


