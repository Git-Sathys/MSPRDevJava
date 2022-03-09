package clinique;

import java.util.Arrays;

public class FunctionGet{

    private FunctionGet() {

    }

    static String getStaff(String[] staff) {
        StringBuilder staffListe = new StringBuilder();
        Arrays.sort(staff);

        for (String s : staff) {
            Thread t = new Thread(new MultiThreadingFunction(s));
            t.start();
        }

        Arrays.sort(staff);

        for (String agent: staff) {
            staffListe
                    .append("\t\t\t\t\t<li><a href=")
                    .append(agent)
                    .append(".html>")
                    .append(agent)
                    .append("</a></li>\n");
        }
        return staffListe.toString();
    }
}
