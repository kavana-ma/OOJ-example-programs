import java.util.Scanner;

class SumOfDigits {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.print("Enter a 5-digit number: ");
int number = scanner.nextInt();

if (number >= 10000 && number <= 99999) {
    int sum = 0;
    while (number != 0) {
    sum += number % 10;
    number /= 10;
    }
System.out.println("Sum of digits is: " + sum);
} 
else{
System.out.println("Please enter a valid 5-digit number.");
}

scanner.close();
}
}
