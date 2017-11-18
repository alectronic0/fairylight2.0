package co.alectronic.lights;

/**
 * Created by alec on 25/07/17.
 */
public class Colour {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private String name;
    private String hexcode;

    public Colour(){
        this("");
    }

    public Colour(String colourName) {
        this(colourName,ANSI_RESET);
    }


    public Colour(String name, String hexcode) {
        this.name = name;
        this.hexcode = hexcode;
    }

    public Colour(ColourTypes type){
        this(type.getName(),type.getCode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHexcode() {
        return hexcode;
    }

    public void setHexcode(String hexcode) {
        this.hexcode = hexcode;
    }

    public static Colour getBlackBulb(){
        return new Colour(ColourTypes.BLACK);
    }
    public static Colour getRedBulb(){
        return new Colour(ColourTypes.RED);
    }
    public static Colour getGreenBulb(){
        return new Colour(ColourTypes.GREEN);
    }
    public static Colour getYellowBulb(){
        return new Colour(ColourTypes.YELLOW);
    }
    public static Colour getBlueBulb(){
        return new Colour(ColourTypes.BLUE);
    }
    public static Colour getPurpleBulb(){
        return new Colour(ColourTypes.PURPLE);
    }
    public static Colour getCyanBulb(){
        return new Colour(ColourTypes.CYAN);
    }
    public static Colour getWhiteBulb(){
        return new Colour(ColourTypes.WHITE);
    }
}
