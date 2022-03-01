import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Objects;


public class Main {
    public static void main(String[] args) {
        String pathDbStaff = "src/bd/";
        String fileNameStaff = "staff.txt";
        int linesCountStaff = Function.fichierExist(fileNameStaff, pathDbStaff);

        String pathListeAgentHtml = "src/template/";
        GenerateHtml.generateListeAgentHtml(
                pathListeAgentHtml,
                FunctionRead.lireFichierStaff(fileNameStaff, pathDbStaff, linesCountStaff)
        );
    }
}