package co.alectronic.lights;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alec on 25/07/17.
 */
public class LightArray implements ILightArray<Bulb> {

    private List<Bulb> bulbs;

    public LightArray(){
        bulbs = new ArrayList<Bulb>();
    }

    public LightArray(int size) {
        this();
        while (size > 0) {
            bulbs.add(new Bulb());
            size--;
        }
    }

    public LightArray(List<Bulb> bulbs){
        this();
        bulbs.addAll(bulbs);

    }

    public LightArray(int size, List<Colour> colours){
        this();
        for (int i = 0 ; i < size ; i++) {
            Bulb bulb = new Bulb(colours.get(i % colours.size()));
            bulbs.add(bulb);
        }
    }


    public List<Bulb> getBulbs() {
        return bulbs;
    }

    public void setBulbs(List<Bulb> bulbs) {
        this.bulbs = bulbs;
    }



}
