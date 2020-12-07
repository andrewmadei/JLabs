package Serializer;

import Audience.Audience;

import java.io.IOException;
import java.io.File;

public interface Serializer<T extends Audience> {
    void Serialize(T obj, File file) throws IOException;
    T Deserialize(File file) throws IOException;
}