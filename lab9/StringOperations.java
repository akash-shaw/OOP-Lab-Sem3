// import java.util.Scanner;

// public class StringOperations {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input two strings
//         System.out.println("Enter the first string:");
//         String firstString = scanner.nextLine();

//         System.out.println("Enter the second string:");
//         String secondString = scanner.nextLine();

//         while (true) {
//             System.out.println("\nMenu:");
//             System.out.println("1. Compare two strings");
//             System.out.println("2. Convert case of characters");
//             System.out.println("3. Check if one string is a substring of the other");
//             System.out.println("4. Replace substring with 'Hello'");
//             System.out.println("5. Exit");
//             System.out.print("Choose an option (1-5): ");

//             int choice = scanner.nextInt();
//             scanner.nextLine(); // Consume the newline character

//             switch (choice) {
//                 case 1:
//                     compareStrings(firstString, secondString);
//                     break;
//                 case 2:
//                     convertCase(firstString, secondString);
//                     break;
//                 case 3:
//                     checkSubstring(firstString, secondString);
//                     break;
//                 case 4:
//                     replaceSubstring(firstString, secondString);
//                     break;
//                 case 5:
//                     System.out.println("Exiting...");
//                     scanner.close();
//                     return;
//                 default:
//                     System.out.println("Invalid choice. Please try again.");
//             }
//         }
//     }

//     private static void compareStrings(String str1, String str2) {
//         if (str1.equals(str2)) {
//             System.out.println("The strings are equal.");
//         } else {
//             System.out.println("The strings are not equal.");
//         }
//     }

//     private static void convertCase(String str1, String str2) {
//         System.out.println("First string (case converted): " + toggleCase(str1));
//         System.out.println("Second string (case converted): " + toggleCase(str2));
//     }

//     private static String toggleCase(String str) {
//         StringBuilder toggled = new StringBuilder();
//         for (char ch : str.toCharArray()) {
//             if (Character.isUpperCase(ch)) {
//                 toggled.append(Character.toLowerCase(ch));
//             } else {
//                 toggled.append(Character.toUpperCase(ch));
//             }
//         }
//         return toggled.toString();
//     }

//     private static void checkSubstring(String str1, String str2) {
//         if (str1.contains(str2)) {
//             System.out.println("\"" + str2 + "\" is a substring of \"" + str1 + "\".");
//         } else if (str2.contains(str1)) {
//             System.out.println("\"" + str1 + "\" is a substring of \"" + str2 + "\".");
//         } else {
//             System.out.println("Neither string is a substring of the other.");
//         }
//     }

//     private static void replaceSubstring(String str1, String str2) {
//         if (str1.contains(str2)) {
//             String updatedString = str1.replace(str2, "Hello");
//             System.out.println("Updated first string: " + updatedString);
//         } else if (str2.contains(str1)) {
//             String updatedString = str2.replace(str1, "Hello");
//             System.out.println("Updated second string: " + updatedString);
//         } else {
//             System.out.println("No substring replacement possible.");
//         }
//     }
// }


import java.util.Scanner;

class StringOperations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("a. To compare two strings\nb. To convert the uppercase character to lower andvice-versa\nc. To display whether an entered string is a substring of the other or not\nd. If the entered string is a substring of the other, replace it with \"Hello\"\ne. Exit.");
            System.out.println("Enter choice: ");
            char choice = sc.nextLine().charAt(0);

            System.out.println("String 1: ");
            String str1 = sc.nextLine();
            System.out.println("String 2: ");
            String str2 = sc.nextLine();

            switch (choice) {
                case 'a':
                    System.out.println(str1.compareTo(str2));
                    break;
                
                case 'b':
                    String toogleCased = "";
                    for(char ch : str1.toCharArray()){
                        if (Character.isUpperCase(ch)) {
                            toogleCased += Character.toLowerCase(ch);
                        }
                        else{
                            toogleCased += Character.toUpperCase(ch);
                        }
                    }
                    System.out.println(toogleCased);
                    break;

                case 'c':
                    System.out.println(str2.contains(str1));
                    break;
                
                case 'd':
                    if(str2.contains(str1)){
                        str2 = str2.replace(str1, "Hello");
                    }
                    System.out.println(str2);
                    break;

                case 'e':
                    return;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}