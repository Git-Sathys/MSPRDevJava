package clinique;

import java.util.Arrays;
import java.util.Objects;

public class MultiThreadingFunction implements Runnable {
    private final String[] staff;
    public MultiThreadingFunction(String[] staff)
    {
        this.staff = staff;
    }

    public void run() {
        try {
            String pathDbAgent = "../../src/main/bd/ficheAgent/";
            String pathAgentHtml = "../../src/main/template/";

            String pathDbListe = "../../src/main/bd/";
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
        catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }
}