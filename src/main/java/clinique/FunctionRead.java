package clinique;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FunctionRead {
    public static String[] readFileStaff(String file, String pathDb, int linesCount) {
        try {
            String line;
            String[] staff = new String[linesCount];
            BufferedReader reader = new BufferedReader(new FileReader(pathDb + file));
            while ((line = reader.readLine()) != null) {
                staff[0] = line;
                for (int i = 1; i < linesCount; i++) {
                    staff[i] = reader.readLine();
                }
            }
            return staff;
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static Liste[] readFileListe(String file, String pathDb, int linesCount) {
        try {
            String line;
            String[] liste = new String[linesCount];
            BufferedReader reader = new BufferedReader(new FileReader(pathDb + file));
            while ((line = reader.readLine()) != null) {
                liste[0] = line;
                for (int i = 1; i < linesCount; i++) {
                    liste[i] = reader.readLine();
                }
            }
            return Function.getList(liste);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return new Liste[0];
    }

    public static Agent readFileAgent(String file, String pathDb, int linesCount) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathDb + file));
            String name = reader.readLine();
            String firstname = reader.readLine();
            String job = reader.readLine();
            String password = reader.readLine();
            reader.readLine();

            linesCount -= 5;
            String[] stuff = new String[linesCount];
            for (int i = 0; i < linesCount; i++) {
                stuff[i] = reader.readLine();
            }
            return new Agent(name, firstname, job, password, stuff);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
