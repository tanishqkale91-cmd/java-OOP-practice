public class Vector {
   private double x;
   private double y; // Encapsulation = data hiding + cotrolled access + validation


   public Vector(double x, double y){
       this.x = x;// we can directly pass Setx and sety
       this.y = y;

    }
public double getX(){ // getters read the value -> methoda that returns private field
return x;
}
public void setX(double x){ // setters validate the value -> methods that modify a private field (with validation)
    this.x = x;
}

public double getY(){
    return y;
}
public void setY(double y){
this.y = y;

}

Vector add(Vector other){
    double newx = this.getX()+other.getX();
    double newy = this.getY()+other.getY();
     return new Vector(newx,newy);
}

Vector Scale(double factor){

 double newx = this.getX()*factor;
 double newy = this.getY()*factor;
return new Vector(newx,y);
}


void display(){
    System.out.println("The value of x for object  is:"+x);
    System.out.println("The value of y for object is: "+y);
}
public static void main(String[] args) {
    Vector v1 =  new Vector(3.4, 6.9);
    Vector v2 = new Vector(2.3, 4.5);
v1.setX(3.4);
v1.setY(6.9);
 

v2.setX(2.3);
v2.setY(4.5);
    System.out.println("The object 1:");
    v1.display();
    System.out.println("The object 2:");
    v2.display();

   Vector sum = v1.add(v2);
   System.out.println("The added vector is :");
    sum.display();
    Vector scaled = v1.Scale(5.6);
    System.out.println("The Scaled vector is:");
    scaled.display();

}
}
