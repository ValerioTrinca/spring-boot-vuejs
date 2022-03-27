package de.jonashackt.springbootvuejs.service.log;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class LogFormatterService extends AbstractLogFormatterService{

    private final String getCalled = "GET called on @path@ resource";
    private final String successfullySaved = "@entity@ successfully saved into DB";
    private final String readingEntity = "Reading @entity@ with id @id@ from database";

    public String getCalledLog(String pathName) {
        HashMap<String, String> arguments = this.getArgumentsMap();
        arguments.put("path", pathName);
        return this.formatLog(arguments, this.getCalled);
    }
}
