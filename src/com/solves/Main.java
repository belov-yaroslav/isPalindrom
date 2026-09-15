package com.solves;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String a = input.nextLine();
        String lowerA = a.toLowerCase();
        System.out.print(isPalindrome(lowerA));
    }

    public static boolean isPalindrome(String palindrome)
    {
        int count = 0;
        for (int len = palindrome.length() - 1; len >= 0; len--)
        {
            if(palindrome.charAt(count) == palindrome.charAt(len)){
                count++;
            }
        }

        if (count == palindrome.length()){
            return true;
        }

        return false;
    }

}
