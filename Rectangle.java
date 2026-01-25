public class Rectangle {
    double length;
    double breadth;
    Rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;

    }
double Area(){
    return length * breadth;
}
public static void main(String[] args) {
    Rectangle r = new Rectangle(2.0, 3.0);
System.out.println("Area="+r.Area());
}


}
