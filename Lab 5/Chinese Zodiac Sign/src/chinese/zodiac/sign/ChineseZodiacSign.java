package chinese.zodiac.sign;
import java.util.Scanner;

public class ChineseZodiacSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int year = input.nextInt();
        
        String zodiacSign ;
        
        switch(year % 12) {
            case 0: zodiacSign = "Monkey"; break;
            case 1: zodiacSign = "Rooster"; break;
            case 2: zodiacSign = "Dog"; break;
            case 3: zodiacSign = "Pig"; break;
            case 4: zodiacSign = "Rat"; break;
            case 5: zodiacSign = "Ox"; break;
            case 6: zodiacSign = "Tiger"; break;
            case 7: zodiacSign = "Rabbit"; break;
            case 8: zodiacSign = "Dragon"; break;
            case 9: zodiacSign = "Snake"; break;
            case 10: zodiacSign = "Horse"; break;
            case 11: zodiacSign = "Sheep"; break;
            default: zodiacSign = "Unknown"; break;
        }
        
        System.out.println("Your Chinese Zodiac sign is: " + zodiacSign);
    }
}