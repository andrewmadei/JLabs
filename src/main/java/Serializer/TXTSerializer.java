package Serializer;
import Audience.Audience;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TXTSerializer<T extends Audience> implements Serializer<T> {

    @Override
    public void Serialize(T obj, File file) throws IOException {
        try(FileWriter fw = new FileWriter(file)) {
            String str = obj.toString();
            fw.write(str);
        }
        catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public T Deserialize(File file) throws IOException {
        try(FileReader fr = new FileReader(file)){
            String str = "";
            int c;
            while((c = fr.read()) != -1)
                str += (char)c;
            String[] values = str.split(" ");
            //return  new Audience(Integer.parseInt(values[3]), Double.parseDouble(values[5]), values[1]);
        }
        catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        return null;
    }
}

