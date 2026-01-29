class Sig {
    double magnitude, phase;
    Sig(double m, double p) {
        magnitude = m;
        phase = p;
    }

    void add(double m, double p) {
        this.magnitude += m;
        this.phase += p;
    }

    void display() {
        System.out.println("\nMagnitude: " + magnitude);
        System.out.println("Phase: " + phase);
    }

    void Scale(double factor) {
        this.magnitude = this.magnitude * factor;
    }

    public static void main(String[] args) {
        Sig s1 = new Sig(5.0, 30.0);
        Sig s2 = new Sig(3.0, 20.0);
        System.out.println("Signal 1:");
        s1.display();
        System.out.println("Signal 2:");
        s2.display();
        s1.add(s2.magnitude, s2.phase);
        System.out.println("\nAdded Signal: ");
        s1.display();
        // System.out.println("Sum of magnitude: " + (s1.magnitude + s2.magnitude));
        // System.out.println("Sum of phase: " + (s1.phase + s2.phase));
        double factor = 2.0;
        s1.Scale(factor);
        System.out.println("\nFactor: ");
        s1.display();
    }
}