package clinique;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Function {

    private Function() {

    }

    static Liste[] getList(String[] liste) {
        Liste[] items = new Liste[liste.length];
        for(int i = 0; i < liste.length; i++) {
            String[] li = liste[i].split("    ");
            items[i] = new Liste(li[0], li[1]);
        }
        return items;
    }

    public static int fileExist(String file, String pathDb) {
        Path path = Paths.get(pathDb + file);
        if (Files.exists(path)) {
            int lineCount = 0;
            try (Stream<String> f = Files.lines(path)){
                lineCount = (int) f.count();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return lineCount;
        } else {
            return -1;
        }
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
