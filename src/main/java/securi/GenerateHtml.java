package securi;

import java.io.*;

public class GenerateHtml {
    private GenerateHtml() {

    }

    public static boolean generateAgentHtml(String pathDb, Agent agent, Liste[] liste) {
        String encoding = "UTF-8";
        String fileName = agent.getPseudo() + ".html";

        String[] items = Function.checkItems(agent.getList(), liste);
        try {
            String html =
            "<html lang=\"fr\">\n" +
                    "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
                    "    <title>Fiche Agent</title>\n" +
                    "    <link href=\"./css/template.css\" rel=\"stylesheet\">\n" +
                    "    <body>\n" +
                    "        <div>\n" +
                    "            <div style=\"display: flex; justify-content: space-evenly; width: 100%\">\n" +
                    "                <div class=\"display-flex-center\" style=\"align-items: center; width: 200px; height: 150px\">\n" +
                    "                    <h2>Nom : " +
                    agent.getName() +
                    "</h2>\n" +
                    "                </div>\n" +
                    "                <div class=\"display-flex-center\" style=\"width: 200px; height: 150px\">\n" +
                    "                    <img src=\"../bd/asset/securi.png\" alt=\"GO Securi\">\n" +
                    "                </div>\n" +
                    "                <div class=\"display-flex-center\" style=\"width: 200px; height: 150px\">\n" +
                    "                    <img width=\"300\" height=\"180\" src=\"../bd/ficheAgent/" +
                    agent.getPseudo() +
                    ".jpg\">\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "            <div>\n" +
                    "                <div class=\"display-flex-center\">\n" +
                    "                    <h3>Liste des accessoires disponibles pour la mission en cours :</h3>\n" +
                    "                </div>\n" +
                    "                <div style=\"display:flex; justify-content: center\">\n" +
                    "                    <div>\n" +
                    "                        <ul style=\"list-style: none; padding: 0\">\n" +
                    "                            <li class='margin'>Mousqueton </li>\n" +
                    "                            <li class='margin'>Gant d'intervention </li>\n" +
                    "                            <li class='margin'>Brassards de securite </li>\n" +
                    "                            <li class='margin'>Porte menottes </li>\n" +
                    "                            <li class='margin'>Bandeau agent cynophile </li>\n" +
                    "                            <li class='margin'>Talkies walkies </li>\n" +
                    "                            <li class='margin'>Lampe torche </li>\n" +
                    "                            <li class='margin'>Kit oreillette </li>\n" +
                    "                            <li class='margin'>Tasers </li>\n" +
                    "                            <li class='margin'>Bombes lacrymogenes </li>\n" +
                    "                        </ul>\n" +
                    "                    </div>\n" +
                    "                    <div>\n" +
                    "                        <ul style=\"list-style: none\">\n" +
                    "                            <li><input type=\"checkbox\" " +
                    items[0] +
                    "></li>\n" +
                    "                            <li><input type=\"checkbox\" " +
                    items[1] +
                    "></li>\n" +
                    "                            <li><input type=\"checkbox\" " +
                    items[2] +
                    "></li>\n" +
                    "                            <li><input type=\"checkbox\" " +
                    items[3] +
                    "></li>\n" +
                    "                            <li><input type=\"checkbox\" " +
                    items[4] +
                    "></li>\n" +
                    "                            <li><input type=\"checkbox\" " +
                    items[5] +
                    "></li>\n" +
                    "                            <li><input type=\"checkbox\" " +
                    items[6] +
                    "></li>\n" +
                    "                            <li><input type=\"checkbox\" " +
                    items[7] +
                    "></li>\n" +
                    "                            <li><input type=\"checkbox\" " +
                    items[8] +
                    "></li>\n" +
                    "                            <li><input type=\"checkbox\" " +
                    items[9] +
                    "></li>\n" +
                    "                        </ul>\n" +
                    "                    </div>\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "        </div>\n" +
                    "    </body>\n" +
                    "</html>\n" +
                    "\n";
            File file = new File(pathDb + fileName);
            PrintWriter writer = new PrintWriter(file, encoding);
            writer.println(html);
            writer.close();
            return true;
        } catch (FileNotFoundException | UnsupportedEncodingException ignored) {
            return false;
        }
    }

    public static boolean generateListeAgentHtml(String pathDb, String[] staff) {
        String encoding = "UTF-8";
        String fileName = "listeAgent.html";
        try {
            String html = "<html lang=\"fr\">\n" +
                    "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
                    "    <title>Liste des Agents</title>\n" +
                    "    <link href=\"./css/template.css\" rel=\"stylesheet\">\n" +
                    "    <body>\n" +
                    "        <div>\n" +
                    "            <h1 class=\"text-align-center\">Bienvenue sur l'application GO Securi</h1>\n" +
                    "            <div class=\"display-flex-center\">\n" +
                    "                <img src=\"./bd/asset/securi.png\" alt=\"GO Securi\">\n" +
                    "            </div>\n" +
                    "            <div class=\"display-flex-center\">\n" +
                    "                <h2>Liste des agents</h2>\n" +
                    "                <ul class=\"li-style-none\">\n" +
                                        FunctionGet.getStaff(staff) +
                    "                </ul>\n" +
                    "            </div>\n" +
                    "        </div>\n" +
                    "    </body>" +
                    "    <footer class=\"footer\">\n" +
                    "        <div>\n" +
                    "            Copiright @ 2022 -- Alessandra Quentin / Arnaud Remi / Baran Lola / Barchi Mehdi\n" +
                    "        </div>\n" +
                    "    </footer>\n" +
                    "</html>";
            File file = new File(pathDb + fileName);
            PrintWriter writer = new PrintWriter(file, encoding);
            writer.println(html);
            writer.close();
            return true;
        }
        catch (FileNotFoundException | UnsupportedEncodingException ignored) {
            return false;
        }
    }
}
