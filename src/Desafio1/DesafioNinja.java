package Desafio1;

public class DesafioNinja {    public static void main(String[] args) {

    String nameNinja1 = "Shikamaru";
    int age1 = 15;
    String mission1 = "Liderar a equipe de resgate";
    char level1 = 'D';
    boolean status1 = false;

    String nameNinja2 = "Rock Lee";
    int age2 = 14;
    String mission2 = "Exame Chunin";
    char level2 = 'C';
    boolean status2 = false;

    String nameNinja3 = "Gaara";
    int age3 = 14;
    String mission3 = "Ajudar na missão de resgate";
    char level3 = 'E';
    boolean status3 = true;

    if (age1 >= 15 && level1 == 'D') {
        System.out.println(" O ninja " + nameNinja1 + " conseguiu completar a missão");
    }
    if (age2 >= 15 && level2 == 'C') {
        System.out.println(" O ninja " + nameNinja2 + " conseguiu completar a missão");
    } else {
        System.out.println(" O ninja " + nameNinja2 + " não conseguiu completar a missão");
    }

    if (age3 >= 15 && level3 == 'D') {
        System.out.println(" O ninja " + nameNinja3 + " conseguiu completar a missão");
    } else if (level3 == 'C') {
        System.out.println("O ninja " + nameNinja3 + "conseguiu completar a missão");
    } else {
        System.out.println(" O ninja " + nameNinja3 + " não tem a idade e nem o nível necessários para completar a missão");
    }
}
}


