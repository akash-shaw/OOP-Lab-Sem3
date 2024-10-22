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