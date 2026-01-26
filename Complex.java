public class Complex {
    double real;
    double img;
    Complex(double real, double img){
        this.real = real;
        this.img = img;
    }

    Complex add(Complex other){
        double newreal = this.real+other.real;
        double newimg = this.img + other.img;
         return new Complex(newreal, newimg); 
    }
Complex scale(double factor){
double newreal = this.real*factor;
double newimg = this.img*factor;

return new Complex(newreal, newimg);

}
void display(){
    System.out.println(real+" + i"+img);
   
    System.out.println("--------------------");
}
public static void main(String[] args) {
    Complex c1 = new Complex(3.5, 4.3);
    Complex c2 = new Complex(4.2, 9.1);

    System.out.println("The comlex Number for object 1:");
    c1.display();
    System.out.println("The complex number for object 2:");
    c2.display();

    System.out.println("The addition of two comlex number ");
    Complex sum = c1.add(c2);
    sum.display();

    System.out.println("The scaled complex number is:");
    Complex scaled = c1.scale(4.0);
    scaled.display(); 

}

}
