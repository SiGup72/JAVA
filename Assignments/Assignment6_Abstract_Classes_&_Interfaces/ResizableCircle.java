class ResizableCircle extends Circle implements Resizable{
ResizableCircle(double radius){
super(radius);
System.out.println("ResizableCircle constructor called");
}

public void resize(int percent){
radius = radius * percent / 100.0;
System.out.println("Circle resized to " + percent + "% of its original size.");
}
}
