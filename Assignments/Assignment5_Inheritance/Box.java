class Box
{float width;
float height;
float depth;
float v;

Box(Box box)
{this.width=box.width;
this.height=box.height;
this.depth=box.depth;
}

Box()
{width=0;
height=0;
depth=0;}

Box(float width, float height, float depth)
{this.width=width;
this.height=height;
this.depth=depth;}

float getwidth()
{return width; }

float getheight()
{return height; }

float getdepth()
{return depth; }

void setDim(float w, float h, float d)
{width=w;
height=h;
depth=d;}

void display()
{v=width*height*depth;
System.out.println("Volume of box is "+v); }
}