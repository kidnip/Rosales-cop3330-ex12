package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class sInterest
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        float I, P, r, t;

        System.out.print("Enter the principal: ");
        P = input.nextFloat();
        System.out.print("Enter the rate of interest: ");
        r = input.nextFloat();
        System.out.print("Enter the number of years: ");
        t = input.nextFloat();

        I = P * (1 + (r / 100) * t);
        System.out.printf("After %.0f years at %.2f%%, the investment will be worth $%.0f.", t, r, I);
    }
}
