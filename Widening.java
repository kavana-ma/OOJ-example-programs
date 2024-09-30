class Widening{
public static void main(String args[]){
short s;
int i1,i2;
byte b1=10,b2=20;
s=b1; //byte to short
i1=b2; //byte to int
System.out.println("byte to short coversion");
System.out.println(b1+" "+s);
System.out.println("byte to int conversion");
System.out.println(b2+" "+i1);
char c='a';
i2=c;
System.out.println("char to int conversion");
System.out.println(c+" "+i2);
}
}
