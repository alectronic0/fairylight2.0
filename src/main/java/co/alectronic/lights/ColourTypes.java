package co.alectronic.lights;

import static co.alectronic.lights.Colour.*;

/**
 * Created by alec on 25/07/17.
 */
public enum ColourTypes {

    UNKNOWN("unknown",ANSI_RESET),
    BLACK("black",ANSI_BLACK),
    RED("red",ANSI_RED),
    GREEN("green",ANSI_GREEN),
    YELLOW("yellow",ANSI_YELLOW),
    BLUE("blue",ANSI_BLUE),
    PURPLE("purple",ANSI_PURPLE),
    CYAN("cyan",ANSI_CYAN),
    WHITE("white",ANSI_WHITE);

    String name;
    String code;

    ColourTypes(String name, String code){
        this.name= name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

}
