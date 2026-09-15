package com.testik;

import java.util.Scanner;

//Строчка без пробелов, НЕ учитывается разница регистров большая маленькая буква, строчка Довод должна вывести true

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String a = input.nextLine();
//        System.out.println(a.length());

//        String day = switch (a){
//            case 1 -> "Monday";
//            case 2 -> "Thursday";
//            case 3 -> "Wednesday";
//            default -> "Something else";
//        };
//        System.out.print(day);
        System.out.print(isPalindrom(a));
    }

    public static boolean isPalindrom(String abc)
    {
        String b = "";
        int count = 0;

        for (int len = abc.length() - 1; len >= 0; len--)
        {
            b += abc.charAt(len);
        }

        for (int len = abc.length() - 2; len >= 1; len--)
        {
            if(b.charAt(len) == abc.charAt(len)){
                count++;
                continue;
            }
            else if(count == abc.length() - 2){
                return true;
            }
            else{
                return false;
            }
        }


//        for(int len = abc.length() - 1; len >= 0; len--)
//        {
//            if(abc.charAt(len) == b.charAt(count))
//            {
//                count++;
//                continue;
//            }
//            else{
//                break;
//            }
//        }
//
//        if(count == abc.length()){
//            return true;
//        }
//        else{
//            return false;
//        }

    }

}
