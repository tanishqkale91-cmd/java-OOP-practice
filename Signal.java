public class Signal{
double magnitude;
double phase;

Signal(double magnitude, double phase){
this.magnitude = magnitude;
this.phase = phase;
}

Signal add(Signal other){
double newmagnitude = this.magnitude+other.magnitude;
double newphase = this.phase+other.magnitude;

return new Signal(newmagnitude,newphase);
}

Signal scale(double factor){
double newmagnitude = this.magnitude*factor;
return new Signal(newmagnitude,phase);
}

void display(){
    System.out.println("The phase is:"+phase);
    System.out.println("The magnitude is:"+magnitude);
}

public static void main(String[] args) {
    Signal s1 = new Signal(3.4, 5.0);
    Signal s2 = new Signal(5.6, 9.0);
     
System.out.println("The signal 1:");
s1.display();
System.out.println("The Signal 2:");
s2.display();

System.out.println("The signal after Addition is:");
    Signal sum = s1.add(s2);
    sum.display();
    System.out.println("The signal after scaling:");
    Signal scaled =  s1.scale(4.0);
   scaled.display();



}


}