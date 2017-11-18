package co.alectronic.lights;

/**
 * Created by alec on 25/07/17.
 */
public class Bulb {
    Colour colour;
    boolean state;


    public Bulb(){
        this(new Colour());
    }

    public Bulb(Colour colour) {
        this(colour,false);
    }

    public Bulb(Colour colour, boolean state) {
        this.colour = colour;
        this.state = state;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void turnOn(){
        setState(true);
    }

    public void turnOff(){
        setState(false);
    }

    public void switchState(){
        setState(!state);
    }


    @Override
    public String toString() {
        return colour.getHexcode() + colour.getName() + " Bulb | State: " + state;
    }
}
