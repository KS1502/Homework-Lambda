package Homework;

public class Main {
    public static void main(String[] args) {
        StringConcate stringConcate = (a, b) -> String.valueOf((a + b));
        System.out.println(stringConcate.concat(5, 5));

        /* 10 */

        Printable printer = s -> System.out.println(s);
        printer.print("Hello Java!");
        printer.print("!string!");
        /* Hello Java!
           !string!
                    */
        Printable printable = s -> System.out.println(s);
        String s = "!string!";
        String[] words = s.split(" ");
        for (String word : words) {
            System.out.println(word);
         /* !string! */
        }


        Checkable checkable = in -> {
            return in.isEmpty();
        };
        String word = "Summer";
        int length = word.length();
        int searchChar = 3;
        boolean isFound = false;
        for (int i = 3; i < length; ++i) {
            if (word.charAt(i) == searchChar) {
                isFound = true;
                break;
            }
        }
        System.out.println(checkable.check("Summer"));
        System.out.println("Summer".length()); //6


        /* false */
    }


}

/*
    Написать следующие лямбды используя наши интерфейсы
    1. сложить строки a и  b
    2.есть строка, если ее длина равна 3 вернуть true  иначе  false
    3.Есть строка string распечатать ее в виде !string!
     */
