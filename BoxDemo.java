class Box{
double width,height,depth;
}

class BoxDemo{
public static void main(String args[]){
Box mybox= new Box();
double vol;

mybox.width=10;
mybox.height=20;
mybox.depth=15;

vol=mybox.height*mybox.width*mybox.depth;
System.out.println("Volume is "+vol);
}
}
