/*****************************************************************************************************************************
 * @file    OrderedIntegers.java
 * @brief   This program implements a program that reads the 3 inout integers from the user and list it as decreasing order
 * @author  Kyung mo Doh
 * @data    September 19, 2023
 ****************************************************************************************************************************/

import java.util.Scanner;  //import Scanner in the program

public class OrderedIntegers{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);  //new scanner command program "scnr"

        System.out.println("Order Three Integers ==========");
        System.out.print("Enter Three Integers: ");
        int firstInt = scnr.nextInt();   //first integer of the user input
        int secondInt = scnr.nextInt();  //second integer of the user input
        int thirdInt = scnr.nextInt();   //third integer of the user input
        System.out.print("The integers in decreasing order are: ");

        if((firstInt >= secondInt) && (firstInt >= thirdInt)){
            System.out.print(firstInt + " ");
            if(secondInt >= thirdInt){
                System.out.print(secondInt + " " + thirdInt);
            }
            else{
                System.out.print(thirdInt + " " + secondInt);
            }
        }
        else if((secondInt >= firstInt) && (secondInt >= thirdInt)){
            System.out.print(secondInt + " ");
            if(firstInt >= thirdInt){
                System.out.print(firstInt + " " + thirdInt);
            }
            else{
                System.out.print(thirdInt + " " + firstInt);
            }
        }
        else{
            System.out.print(thirdInt + " ");
            if(firstInt >= secondInt){
                System.out.print(firstInt + " " + secondInt);
            }
            else{
                System.out.print(secondInt + " " + firstInt);
            }
        }

    }
}