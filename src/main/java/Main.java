import clinique.Function;
import clinique.FunctionRead;
import clinique.GenerateHtml;

public class Main {
    public static void main(String[] args) {
        String pathDbStaff = "src/main/java/bd/";
        String fileNameStaff = "staff.txt";
        int linesCountStaff = Function.fileExist(fileNameStaff, pathDbStaff);

        String pathListeAgentHtml = "src/main/java/template/";
        GenerateHtml.generateListeAgentHtml(
                pathListeAgentHtml,
                FunctionRead.readFileStaff(fileNameStaff, pathDbStaff, linesCountStaff)
        );
    }
}