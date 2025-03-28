package Desafio1;

import java.sql.SQLOutput;

public class DesafioNinja {
    public static void main(String[] args) {

        String nameNinja1 = "Shikamaru";
        int age1 = 14;
        String mission1 = "Liderar a equipe de resgate";
        char level1 = 'D';
        String status1 = "Não Concluída";

        if (age1 < 15 ) {
            if (level1 == 'D' || level1 == 'C') {
                status1 = "Concluida";
            } else {
                status1 = "Não concluída, não tem o nível estipulado";
            }
        }

        System.out.println("Nome do ninja: " + nameNinja1);
        System.out.println("Idade do ninja: " + age1);
        System.out.println("Nome da missão: " + mission1);
        System.out.println("Nível da missão: " + level1);
        System.out.println("Status da missão:" + status1);


        System.out.println("____________________________________________________________________________");

        String nameNinja2 = "Rock Lee";
        int age2 = 14;
        String mission2 = "Exame Chunin";
        char level2 = 'E';
        String status2 = "Esperando aprovação";

        if (age1 < 15 ) {
            if (level2 == 'D' || level2 == 'C') {
                status2 = "Concluida";
            } else {
                status2 = "Não concluída, não tem o nível estipulado";
            }
        }

        System.out.println("Nome do ninja: " + nameNinja2);
        System.out.println("Idade do ninja: " + age2);
        System.out.println("Nome da missão: " + mission2);
        System.out.println("Nível da missão: " + level2);
        System.out.println("Status da missão:" + status2);

        System.out.println("____________________________________________________________________________");

        String nameNinja3 = "Gaara";
        int age3 = 16;
        String mission3 = "Ajudar na missão de resgate";
        char level3 = 'A';
        String status3 = "Não Concluída";

        if (age1 < 15 ) {
            if (level3 == 'D' || level3 == 'C') {
                status3 = "Concluida";
            } else {
                status3 = "Não concluída, o ninja somente é chamado para missões de alto nível";
            }
        }

        System.out.println("Nome do ninja: " + nameNinja3);
        System.out.println("Idade do ninja: " + age3);
        System.out.println("Nome da missão: " + mission3);
        System.out.println("Nível da missão: " + level2);
        System.out.println("Status da missão:" + status3);

    }
}



