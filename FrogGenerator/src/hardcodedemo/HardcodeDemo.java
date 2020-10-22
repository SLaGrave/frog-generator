package hardcodedemo;

import java.util.ArrayList;
import java.util.Random;

public class HardcodeDemo {
    private final ArrayList<String> data;

    public HardcodeDemo() {
        this.data = new ArrayList<>();

        this.data.add(
                "  o\n" + "_`O'_"
        );

        this.data.add(
                "\n" + "    _    _\n" + "   (o)--(o)\n" + "  /.______.\\\n" +
                        "  \\________/\n" + " ./        \\.\n" + "( .        , )\n" +
                        " \\ \\_\\\\//_/ /\n" + "  ~~  ~~  ~~"
        );

        this.data.add(
                "           (')-=-(')\n" + "         __(   \"   )__\n" +
                        "        / _/'-----'\\_ \\\n" + "     ___\\\\ \\\\     // //___\n" +
                        "     >____)/_\\---/_\\(____<"
        );
    }

    public String getFrog() {
        Random rand = new Random();
        int randomInt = rand.nextInt((this.data.size()));
        return this.data.get(randomInt);
    }
}
