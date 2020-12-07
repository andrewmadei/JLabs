package Serializer;

import java.io.*;

import Audience.Audience;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONSerializer<T extends Audience> implements Serializer<T> {

    private ObjectMapper mapper;
    private Class<T> audience;

    public JSONSerializer(Class<T> myClass) {
        mapper = new ObjectMapper();
        this.audience = myClass;
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
    public T Deserialize(File file) {
        try {
            return mapper.readValue(file, audience);
        }
        catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}

