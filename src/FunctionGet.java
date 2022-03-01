import java.util.Arrays;
import java.util.Objects;

public class FunctionGet {
    static String getStaff(String[] staff) {
        StringBuilder staffListe = new StringBuilder();
        String pathDbAgent = "src/bd/ficheAgent/";
        String pathAgentHtml = "src/template/";

        String pathDbListe = "src/bd/";
        String fileNameListe = "liste.txt";
        int linesCountListe = Function.fichierExist(fileNameListe, pathDbListe);

        Arrays.sort(staff);

        for (String agent: staff) {
            String fileNameAgent = agent + ".txt";
            int linesCountAgent = Function.fichierExist(fileNameAgent, pathDbAgent);
            GenerateHtml.generateAgentHtml(
                    pathAgentHtml,
                    Objects.requireNonNull(FunctionRead.lireFichierAgent(fileNameAgent, pathDbAgent, linesCountAgent)),
                    FunctionRead.lireFichierListe(fileNameListe, pathDbListe, linesCountListe)
            );
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
