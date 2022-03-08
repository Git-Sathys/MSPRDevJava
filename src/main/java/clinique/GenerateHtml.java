package clinique;

import java.io.*;

public class GenerateHtml {
    private GenerateHtml() {

    }

    public static void generateAgentHtml(String pathDb, Agent agent, Liste[] liste) {
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
                            "        <div style=\"display: flex; justify-content: space-between;width: 100%;\">\n" +
                            "            <div style=\"justify-content: flex-start\">\n" +
                            "                <ul style=\"list-style: none\">\n" +
                            "                    <li>Nom : " +
                            agent.getName() +
                            "</li>\n" +
                            "                </ul>\n" +
                            "            </div>\n" +
                            "            <div style=\"justify-content: flex-end; width: 400px; height: 250px\">\n" +
                            "                <img width=\"400\" height=\"250\" src=\"../bd/ficheAgent/" +
                            agent.getPseudo() +
                            ".jpg\">\n" +
                            "            </div>\n" +
                            "        </div>\n" +
                            "        <div>\n" +
                            "            <div style=\"display:flex; justify-content: center\">\n" +
                            "                <div>\n" +
                            "                    <ul style=\"list-style: none\">\n" +
                            "                        <li class='margin'>Mousqueton </li>\n" +
                            "                        <li class='margin'>Gant d'intervention </li>\n" +
                            "                        <li class='margin'>Brassards de sécurité </li>\n" +
                            "                        <li class='margin'>Porte menottes </li>\n" +
                            "                        <li class='margin'>Bandeau agent cynophile </li>\n" +
                            "                        <li class='margin'>Talkies walkies </li>\n" +
                            "                        <li class='margin'>Lampe torche </li>\n" +
                            "                        <li class='margin'>Kit oreillette </li>\n" +
                            "                        <li class='margin'>Tasers </li>\n" +
                            "                        <li class='margin'>Bombes lacrymogenes </li>\n" +
                            "                    </ul>\n" +
                            "                </div>\n" +
                            "                <div>\n" +
                            "                    <ul style=\"list-style: none\">\n" +
                            "                        <li><input type=\"checkbox\" " +
                            items[0] +
                            "></li>\n" +
                            "                        <li><input type=\"checkbox\" " +
                            items[1] +
                            "></li>\n" +
                            "                        <li><input type=\"checkbox\" " +
                            items[2] +
                            "></li>\n" +
                            "                        <li><input type=\"checkbox\" " +
                            items[3] +
                            "></li>\n" +
                            "                        <li><input type=\"checkbox\" " +
                            items[4] +
                            "></li>\n" +
                            "                        <li><input type=\"checkbox\" " +
                            items[5] +
                            "></li>\n" +
                            "                        <li><input type=\"checkbox\" " +
                            items[6] +
                            "></li>\n" +
                            "                        <li><input type=\"checkbox\" " +
                            items[7] +
                            "></li>\n" +
                            "                        <li><input type=\"checkbox\" " +
                            items[8] +
                            "></li>\n" +
                            "                        <li><input type=\"checkbox\" " +
                            items[9] +
                            "></li>\n" +
                            "                    </ul>\n" +
                            "                </div>\n" +
                            "            </div>\n" +
                            "        </div>\n" +
                            "    </body>\n" +
                            "</html>\n";
            File file = new File(pathDb + fileName);
            PrintWriter writer = new PrintWriter(file, encoding);
            writer.println(html);
            writer.close();
        } catch (FileNotFoundException | UnsupportedEncodingException ignored) {

        }
    }

    public static void generateListeAgentHtml(String pathDb, String[] staff) {
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
                    "                <img src=\"../bd/asset/securi.png\" alt=\"GO Securi\">\n" +
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
                    "            Copiright @ 2022 -- Alessandra Quentin / Arnaud Rémi / Baran Lola / Barchi Mehdi\n" +
                    "        </div>\n" +
                    "    </footer>\n" +
                    "</html>";
            File file = new File(pathDb + fileName);
            PrintWriter writer = new PrintWriter(file, encoding);
            writer.println(html);
            writer.close();
        }
        catch (FileNotFoundException | UnsupportedEncodingException ignored) {

        }
    }
}
