package clinique;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Objects;

public class MultiThreadingFunction implements Runnable {
    private final String[] staff;
    public MultiThreadingFunction(String[] staff)
    {
        this.staff = staff;
    }

    public void run() {
        String pathDbAgent = "src/main/java/bd/ficheAgent/";
        String pathAgentHtml = "src/main/java/template/";

        String pathDbListe = "src/main/java/bd/";
        String fileNameListe = "liste.txt";
        int linesCountListe = Function.fileExist(fileNameListe, pathDbListe);
        Arrays.sort(this.staff);

        for (String agent: this.staff) {
            String fileNameAgent = agent + ".txt";
            int linesCountAgent = Function.fileExist(fileNameAgent, pathDbAgent);
            GenerateHtml.generateAgentHtml(
                    pathAgentHtml,
                    Objects.requireNonNull(FunctionRead.readFileAgent(fileNameAgent, pathDbAgent, linesCountAgent)),
                    FunctionRead.readFileListe(fileNameListe, pathDbListe, linesCountListe)
            );
        }
    }
}