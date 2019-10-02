package platform.api.common;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.std.*;

import java.io.*;
import java.time.*;

public class LocalDateTimeJsonDeserializer extends StdDeserializer<LocalDateTime> {

    public LocalDateTimeJsonDeserializer() {

        super(LocalDateTime.class);

    }

    @Override
    public LocalDateTime deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {

        System.out.println(p.getValueAsString());

        return LocalDateTime.parse(p.getValueAsString()); // or overloaded with an appropriate format

    }

}
