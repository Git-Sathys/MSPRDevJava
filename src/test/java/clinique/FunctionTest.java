package clinique;

import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class FunctionTest {

    @Before
    public void setUp() {

    }

    @Test
    public void existsTest() {
        int result = clinique.Function.fileExist("file", "path");
        assertThat(result, equalTo(-1));
    }

    @Test
    public void getStaffTest() {
        String[] staff = {"staff1", "staff2"};
        String result = FunctionGet.getStaff(staff);
        String expected = "\t\t\t\t\t<li><a href=staff1.html>staff1</a></li>\n\t\t\t\t\t<li><a href=staff2.html>staff2</a></li>\n";
        assertThat(result, equalTo(expected));
    }

    @Test
    public void readFileStaffTest() {
        String pathDbStaff = "src/main/java/bd/";
        String fileNameStaff = "staff.txt";
        int linesCountStaff = Function.fileExist(fileNameStaff, pathDbStaff);
        String[] result = FunctionRead.readFileStaff(fileNameStaff, pathDbStaff, linesCountStaff);
        String[] expected = {"cberthier", "sconnor", "jmacclane", "afoley", "mriggs", "jwest", "sholmes", "jrouletabille"};
        assertThat(result, equalTo(expected));
    }

    @Test
    public void readFileAgentTest() {
        String pathDbAgent = "src/main/java/bd/ficheAgent/";
        String fileNameAgent = "cberthier" + ".txt";
        int linesCountAgent = Function.fileExist(fileNameAgent, pathDbAgent);
        String result = Objects.requireNonNull(FunctionRead.readFileAgent(fileNameAgent, pathDbAgent, linesCountAgent)).getName();
        assertThat(result, equalTo("Berthier"));
    }

    @Test
    public void readFileListeTest() {
        String pathDbListe = "src/main/java/bd/";
        String fileNameListe = "liste.txt";
        int linesCountListe = Function.fileExist(fileNameListe, pathDbListe);
        Liste[] result = FunctionRead.readFileListe(fileNameListe, pathDbListe, linesCountListe);
        assertThat(result.length, equalTo(10) );
    }
}
