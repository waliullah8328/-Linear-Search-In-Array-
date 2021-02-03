package com.company;

import java.util.Scanner;

public class SearchFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,a,i,j;
        int d;
        System.out.print("Test Case : ");
        n = input.nextInt();
        System.out.print("How many Numbers you want to insert: ");
        a = input.nextInt();
        System.out.println("Enter " +a+ " array elements :");
        int arr[] = new int[a];
        int arr1[] = new int [n];

        for(i=0; i<a;i++)
        {
            arr[i] = input.nextInt();
        }
        for(j = 0;j<n;j++)
        {
            System.out.println("Case: "+(j+1));
            System.out.println("Enter Data You want to search:");
            arr1[j]= input.nextInt();
            for(i=0;i<a;i++)
            {
         if( arr[i] == arr1[j] )
             {
              System.out.printf("%d is found at Index %d\n",arr[i],i+1);
                break;
             }

            }
            if(i == a)
            {
                System.out.printf("%d is not found in the Array\n",arr1[j]);
            }



        }

    }
}
