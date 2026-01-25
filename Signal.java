public class Signal {
    int phase;
    double magnitude;
Signal(int p, double m){
phase  = p;
magnitude  = m;
}
void method(){
     System.out.println(phase+" "+magnitude);
}
void addition(){
    double sum = phase + magnitude;
    System.out.println("The addition is: "+sum);

}


public static void main(String[] args) {
    Signal s1 = new Signal(111,3.5);
    Signal s2 = new Signal(23,4.5);
    s1.method();
    s2.method();
    s1.addition();
    System.out.println(s1.phase+s2.phase);
    
}
}
