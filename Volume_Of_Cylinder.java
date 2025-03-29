public class Volume_Of_Cylinder extends Area_Of_Circle{
    double height,volume;
    Volume_Of_Cylinder(double r,double h)
    {
    super(r);
    height=h;
    volume=0;
    }
   double calculate(){
    volume=(3.14)*radius*radius*height;
    return volume;
    }
   void display(){
    super.display();
    System.out.println("Volume Of The Cylinder"+" "+volume);
    }
}
