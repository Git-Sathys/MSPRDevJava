package securi;

import java.util.HashMap;
import java.util.Map;

public class Liste {
    private final String name;
    private final String description;

    public Liste(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, String> mapData() {
        Map<String, String> data = new HashMap<>();
        data.put(description, name);
        return data;
    }
}
