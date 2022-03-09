package securi;

import java.util.Objects;

public class MultiThreadingFunction implements Runnable {
    private final String agent;
    public MultiThreadingFunction(String agent)
    {
        this.agent = agent;
    }

    public void run() {
        String pathDbAgent = "src/main/java/bd/ficheAgent/";
        String pathAgentHtml = "src/main/java/template/";
        String pathDbListe = "src/main/java/bd/";
        String fileNameListe = "liste.txt";
        String fileNameAgent = this.agent + ".txt";
        int linesCountListe = Function.fileExist(fileNameListe, pathDbListe);
        int linesCountAgent = Function.fileExist(fileNameAgent, pathDbAgent);

        GenerateHtml.generateAgentHtml(
                pathAgentHtml,
                Objects.requireNonNull(FunctionRead.readFileAgent(fileNameAgent, pathDbAgent, linesCountAgent)),
                FunctionRead.readFileListe(fileNameListe, pathDbListe, linesCountListe)
        );
    }
}