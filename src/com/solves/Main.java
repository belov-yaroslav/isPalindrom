package com.solves;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String a = input.nextLine();
        String lowA = a.toLowerCase();
        System.out.print(isPalindrome(lowA));
    }

    public static boolean isPalindrome(String abc)
    {
        int count = 0;
        for (int len = abc.length() - 1; len >= 0; len--)
        {
            if(abc.charAt(count) == abc.charAt(len)){
                count++;
            }
        }

        if(count == abc.length()){
            return true;
        }

        return false;
    }

}
