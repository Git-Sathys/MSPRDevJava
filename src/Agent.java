import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Agent {
    private final String name;
    private final String firstname;
    private final String job;
    private final String password;
    private final String[] list;

    public Agent(String name, String firstname, String job, String password, String[] list) {
        this.name = name;
        this.firstname = firstname;
        this.job = job;
        this.password = password;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getJob() {
        return job;
    }

    public String getPassword() {
        return password;
    }

    public String[] getList() {
        return list;
    }

    public String getPseudo() {
        return (firstname.charAt(0) + name).toLowerCase();
    }
}
