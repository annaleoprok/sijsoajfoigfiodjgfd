import java.util.Scanner;

class Sotrudniik {
    String fam,im,otch, doljnost ;
    int kolDet;
    Rebenok []reb=null;
}
class Rebenok{
    String imaR;
    int vozrastR;
}
public class RecSotr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.println("Введите количество сотрудников => ");
        int kol = sc.nextInt();
        sc.nextLine();
        Sotrudniik[] sotr = new Sotrudniik[kol];
        System.out.println("ВВедите информацию о каждом сотруднике:");
        for (int i = 0; i < sotr.length; i++) {
            sotr[i] = new Sotrudniik();
            System.out.print("ВВедите фамилию" + (i + 1) + "сотрудника=>");
            sotr[i].fam = sc.nextLine();

            System.out.print("ВВедите его имя =>");
            sotr[i].im = sc.nextLine();

            System.out.print("ВВедите его отчество =>");
            sotr[i].otch = sc.nextLine();

            System.out.print("ВВедите должность =>");
            sotr[i].doljnost = sc.nextLine();

            System.out.print("ВВедите количество детей =>");
            sotr[i].kolDet = sc.nextInt();
            sc.nextLine();

            if (sotr[i].kolDet != 0) {
                sotr[i].reb = new Rebenok[sotr[i].kolDet];
                System.out.println("Дети => ");
                for (int j = 0; j < sotr[i].reb.length; j++) {
                    sotr[i].reb[j] = new Rebenok();

                    System.out.print("Введите имя " + (i + 1) + " ребенка => ");
                    sotr[i].reb[j].imaR = sc.nextLine();

                    System.out.print("Введите его возраст => ");
                    sotr[i].reb[j].vozrastR = sc.nextInt();
                    sc.nextLine();
                }
            }
        }
    }
}
