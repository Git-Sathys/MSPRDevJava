package clinique;


public class Main {
    public static void main(String[] args) {
        String pathDbStaff = "../../src/main/bd/";
        String fileNameStaff = "staff.txt";
        int linesCountStaff = Function.fileExist(fileNameStaff, pathDbStaff);

        String pathListeAgentHtml = "../../src/main/template/";
        GenerateHtml.generateListeAgentHtml(
                pathListeAgentHtml,
                FunctionRead.readFileStaff(fileNameStaff, pathDbStaff, linesCountStaff)
        );
    }
}