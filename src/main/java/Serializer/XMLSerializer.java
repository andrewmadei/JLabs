package Serializer;

import java.io.File;
import java.io.IOException;

import Audience.Audience;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XMLSerializer<T extends Audience> implements Serializer<T> {

    private XmlMapper mapper;
    private Class<T> audience;

    public XMLSerializer(Class<T> myClass) {
        this.audience = myClass;
        mapper = new XmlMapper();
    }

    @Override
    public void Serialize(T obj, File file) throws IOException {
        try {
            mapper.writeValue(file, obj);
        }
        catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public T Deserialize(File file) throws IOException {
        try {
            return mapper.readValue(file, audience);
        }
        catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}

