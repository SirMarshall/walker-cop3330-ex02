/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carter Walker
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
        {
            //Variable declaration
            Scanner input = new Scanner(System.in);
            String inputString;

            //Input query
            System.out.println( "What is the input string?" );
            inputString = input.next();

            //Output
            System.out.println( inputString + " has " + inputString.length() + " characters.");
        }
}
