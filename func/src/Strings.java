import java.util.Scanner;

// Strings a non primitive data type
public class Strings {
    public static void main(String[] args) {
        // user input string
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter String: ");
//        String name = in.nextLine();
//        System.out.println(name);
        //Concatenation
        String name1 = "Hello";
        String name2 = "World";
        String fullname = name1 + "@" + name2;
        System.out.println(fullname);
        // String Length
        System.out.println(fullname.length());
        // CharAt (delete/update)
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }
        // Compare Strings
        // compareTo returns a int value where if 0 then same else not
        String same1 = "Rimo1";
        String same2 = "Rimo";
        if (same1.compareTo(same2) == 0)
            System.out.println("Same String");
        else
            System.out.println("Different String");
        // SubStrings
        String sentence = "RimoRow";
        String newname = sentence.substring(4);
        System.out.println(newname);
    }
}
