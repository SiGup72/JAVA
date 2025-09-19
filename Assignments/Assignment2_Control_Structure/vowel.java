import java.util.Scanner;

class vowels{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter a string");
String str = scan.nextLine();
if (str.length() == 1){
char input = Character.toLowerCase(str.charAt(0)); 
if(input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u'){
System.out.println("it is a vowel");
}
else if(Character.isLetter(input)){
System.out.println("it is a consonant");
}
else
{System.out.println("it is neither vowel nor consonant");
}
}
else{
System.out.println("Error:This is not an alphabet");} 

System.out.println("SIA GUPTA 24CSU201");
}}

