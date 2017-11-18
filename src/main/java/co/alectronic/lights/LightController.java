package co.alectronic.lights;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by alec on 25/07/17.
 */
public class LightController {



    public static void main(String[] args){
        LightArray lightArray = new LightArray(10, Arrays.asList(
                new Colour(ColourTypes.BLACK),
                new Colour(ColourTypes.RED),
                new Colour(ColourTypes.GREEN),
                new Colour(ColourTypes.BLUE)
        ));


        lightArray.getBulbs().stream().map(
                Bulb::toString
        ).forEach(System.out::println);

    }
}
