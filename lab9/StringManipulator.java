import java.util.Scanner;
import java.util.Arrays;


class StringManipulator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("String: ");
        String str = sc.nextLine();

        while(true){
            System.out.println("a. Check Palindrome");
            System.out.println("b. Sort alphabetically");
            System.out.println("c. Reverse");
            System.out.println("d. Concatenate original and reverse");
            System.out.println("e. Exit");
            System.out.print("Choice: ");
            char ch = sc.nextLine().charAt(0);
            switch (ch) {
                case 'a':
                    String rev = new StringBuilder(str).reverse().toString();
                    if(rev.equalsIgnoreCase(str))
                        System.out.println("Palindrome");
                    else
                        System.out.println("Not Palindrome");
                    break;

                case 'b':
                    char[] characters = str.toCharArray();
                    Arrays.sort(characters);
                    System.out.println(new String(characters));
                    break;

                case 'c':
                    System.out.println(new StringBuilder(str).reverse().toString());
                    break;

                case 'd':
                    str = str.concat(new StringBuilder(str).reverse().toString());
                    System.out.println(str);
                    break;

                case 'e':
                    return;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}