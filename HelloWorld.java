import java.util.Scanner;
class HelloWorld{
public static void main(String args[]){
int a; float b; String s;
Scanner in= new Scanner(System.in);
s=in.nextLine();
System.out.println("You entered string "+s);
System.out.println("Enter an integer");
a=in.nextInt();
System.out.println("You entered an integer"+a);
System.out.println("Enter a float");
b=in.nextFloat();
System.out.println("You entered float"+b);
}
}
