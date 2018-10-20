
package figury;



public class Prostokat extends Figury {



    private double a;

    private double b;



    public Prostokat(double a, double b) {

        this.a = a;

        this.b = b;

    }



    @Override

    public double obliczPole() {

        return (2*a) +(2*b);

    }



    @Override

    public double obliczObwod() {

        return a*b;

    }

}
