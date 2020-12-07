package Program;

import Audience.ComputerAudience;
import Audience.ComputerAudienceBuilder;
import Serializer.JSONSerializer;
import Serializer.XMLSerializer;
import Serializer.TXTSerializer;
import Serializer.Serializer;
import java.io.IOException;
import java.io.File;

public class Main {
    public static void main (String[] args) {
        ComputerAudience computerAudience;
        ComputerAudienceBuilder computerAudienceBuilder = new ComputerAudienceBuilder();
        computerAudienceBuilder.addComputer(20);
        computerAudienceBuilder.setNumberOfAudience(21);
        computerAudience = computerAudienceBuilder.getComputerAudience();
        Serializer jsonSerializer = new JSONSerializer<ComputerAudience>(ComputerAudience.class);

        String dir = new File("").getAbsolutePath() + "\\src\\main\\java\\Output\\Result";

        try {
            File json = new File(dir, "");
            jsonSerializer.Serialize(computerAudience, new File(dir + "Json"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Serializer xmlSerializer = new XMLSerializer<ComputerAudience>(ComputerAudience.class);
        try {
            File xml = new File(dir, "");
            xmlSerializer.Serialize(computerAudience, new File(dir + "Xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Serializer txtSerializer = new TXTSerializer<ComputerAudience>();
        try {
            File txt = new File(dir, "");
            txtSerializer.Serialize(computerAudience, new File(dir + "Txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
