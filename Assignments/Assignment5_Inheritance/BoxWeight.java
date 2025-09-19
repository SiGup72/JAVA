class BoxWeight extends Box{
float weight;

BoxWeight(BoxWeight bw)
{super(bw);
this.weight=bw.weight;
}

BoxWeight()
{super();
weight=0;
}

BoxWeight(float width, float height, float depth, float weight)
{super(width, height, depth);
this.weight=weight;
}

float getweight()
{return weight;}

void setWeight(float w)
{weight=w;}

void display()
{super.display();
System.out.println("Weight of box is "+weight); }
}
