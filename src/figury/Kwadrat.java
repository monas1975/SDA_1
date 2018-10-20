package figury;

public class Kwadrat extends Figury {

    private double bok;

    public Kwadrat(double bok){
        this.bok = bok;

    }
    //implementacja metod z klasy abstrakcyjnej
    @Override
    public double obliczPole(){
        return bok*bok;
    }

    //implementacja metody z klasy abstrakcyjnej
    @Override
    public double obliczObwod(){
        return 4*bok;
    }

    // nadpisanie metody toString z klasy Object do zwrócenia tekstowej

    // reprezentacji obiektu

    @Override
    public String toString(){
        return "Jestem kwadratem o boku: " +bok;
    }

}
