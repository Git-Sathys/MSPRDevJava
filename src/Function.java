import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
public class Function {

    public static void afficherAgent(Agent agent) {
        System.out.println(agent.getName());
        System.out.println(agent.getFirstname());
        System.out.println(agent.getJob());
        System.out.println(agent.getPassword());
        System.out.println(Arrays.toString(agent.getList()));
    }

    private static void afficherStaff(String[] staff) {
        for (String s : staff) {
            System.out.println(s);
        }
    }

    static Liste[] afficherListe(String[] liste) {
        Liste[] items = new Liste[liste.length];
        for(int i = 0; i < liste.length; i++) {
            String[] li = liste[i].split("    ");
            items[i] = new Liste(li[0], li[1]);
//            System.out.println(items[i].mapData());
        }
        return items;
    }

    public static int fichierExist(String file, String pathDb) {
        Path path = Paths.get(pathDb + file);
        if (Files.exists(path)) {
            int lineCount = 0;
            try {
                lineCount = (int) Files.lines(path).count();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            return lineCount;
        } else {
            return -1;
        }
    }

    public static String creerFichier(String fileName, String pathDb) {
        String encoding = "UTF-8";
        try{
            File file = new File(pathDb + fileName);
            PrintWriter writer = new PrintWriter(file, encoding);
            writer.println("The first line");
            writer.println("The second line");
            writer.close();
            return fileName;
        }
        catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
    }

    public static String[] checkItems(String[] listeAgent, Liste[] liste) {
        String[] items = new String[liste.length];
        for (int i = 0; i < liste.length; i++) {
            for (String s : listeAgent) {
                if (s.equals(liste[i].getName())) {
                    items[i] = "checked";
                    break;
                } else {
                    items[i] = "";
                }
            }
        }
        return items;
    }
}
