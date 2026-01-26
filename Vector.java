public class Vector {
    double x;
    double y;
    Vector(double x, double y){
       this.x = x;
       this.y = y;

    }
Vector add(Vector other){
    double newx = this.x+other.x;
    double newy = this.y+other.y;
     return new Vector(newx,newy);
}
Vector Scale(double factor){

 double newx = this.x*factor;
return new Vector(newx,y);
}


void display(){
    System.out.println("The value of x for object  is:"+x);
    System.out.println("The value of y for object is: "+y);
}
public static void main(String[] args) {
    Vector v1 =  new Vector(3.4, 6.9);
    Vector v2 = new Vector(2.3, 4.5);

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
