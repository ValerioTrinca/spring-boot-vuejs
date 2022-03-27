package de.jonashackt.springbootvuejs.service.log;

import java.util.HashMap;
import java.util.Map;

abstract public class AbstractLogFormatterService {

    protected HashMap<String, String> getArgumentsMap() {
        return new HashMap<>();
    }

    protected String formatLog(HashMap<String, String> arguments, String log) {
        for(Map.Entry<String, String> entry : arguments.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            log = log.replaceAll("@" + key + "@", value);
        }

        return log;
    }
}
