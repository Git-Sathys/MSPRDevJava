package clinique;

import java.util.Arrays;

public class FunctionGet{

    private FunctionGet() {

    }

    static String getStaff(String[] staff) {
        StringBuilder staffListe = new StringBuilder();

        int n = staff.length;
        for (int i = 0; i < n; i++) {
            Thread t = new Thread(new MultiThreadingFunction(staff));
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
