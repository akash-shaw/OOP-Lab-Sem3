import java.util.Scanner;

class CountString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string: ");
        String str = sc.nextLine();

        System.out.println("Characters: "+str.length());

        System.out.println("Words: " + str.split(" ").length);

        System.out.println("lines: " + str.split("\n").length);

        System.out.println("Vowels: " + countVowels(str));

        sc.close();
    }

    public static int countVowels(String str){
        int count=0;

        String vowels = "aeiouAEIOU";

        for(char ch : str.toCharArray()){
            if(vowels.indexOf(ch) != -1){
                count++;
            }
        }

        return count;
    }
}