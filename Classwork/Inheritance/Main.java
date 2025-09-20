class Grandfather{
void show()
{System.out.println("Grandfather class");}
}

class Father extends Grandfather{
void display()
{System.out.println("Father class"); }
}

class Son extends Father{
void print()
{System.out.println("Son class"); }
}


class Main{
public static void main(String args[]){
Son son=new Son();
son.show();
son.display();
son.print();

}
}