import java.util.ArrayList;
import java.util.Random;

public class Main{

    public static void main(String[] args) {

        Main m = new Main();
        Random random = new Random();
        int fupper = 3;
        int supper = 2;

        ArrayList<String> list = new ArrayList<>();
        Brille b = new Brille("brille");
        list.add("Brille");
        Søvnig s = new Søvnig("søvnig");
        list.add("Søvnig");
        Lystig l = new Lystig("lystig");
        list.add("Lystig");
        Gnavpot g = new Gnavpot("gnavpot");
        list.add("Gnavpot");

        ArrayList<String> historielist = new ArrayList<>();
        int førsteTal = random.nextInt(fupper); //m.getRandomNumber(0, 3);
        historielist.add(list.get(førsteTal));
        list.remove(førsteTal);

        int andetTal = random.nextInt(supper); //m.getRandomNumber(0, 2);
        historielist.add(list.get(andetTal));
        list.remove(andetTal);

        System.out.println("");
        System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + "]");
        System.out.println("");

        // Brille 
        if(historielist.get(0) == "Brille"){
            b.tilkald(historielist.get(1));
            if(historielist.get(1) == "Gnavpot"){
                historielist.add("Lystig");
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + ", " + historielist.get(2) + "]");
                System.out.println("");
                b.efterTilkaldt(historielist.get(2));
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + ", " + historielist.get(2) + "]");
                System.out.println("");
                b.forsvind(historielist.get(1));
                historielist.remove(1);
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + "]");
                System.out.println("");
                b.sidst(historielist.get(1));
                return;
            }
            if(historielist.get(1) == "Lystig"){
                historielist.add("Søvnig");
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + ", " + historielist.get(2) + "]");
                System.out.println("");
                b.efterTilkaldt(historielist.get(2));
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + ", " + historielist.get(2) + "]");
                System.out.println("");
                b.forsvind(historielist.get(1));
                historielist.remove(1);
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + "]");
                System.out.println("");
                b.sidst(historielist.get(1));
                return;
            }
            if(historielist.get(1) == "Søvnig"){
                historielist.add("Gnavpot");
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + ", " + historielist.get(2) + "]");
                System.out.println("");
                b.efterTilkaldt(historielist.get(2));
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + ", " + historielist.get(2) + "]");
                System.out.println("");
                b.forsvind(historielist.get(1));
                historielist.remove(1);
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + "]");
                System.out.println("");
                b.sidst(historielist.get(1));
                return;
            }
        }

        // Søvnig
        if(historielist.get(0) == "Søvnig"){
            s.tilkald(historielist.get(1));
            if(historielist.get(1) == "Gnavpot"){
                historielist.add("Brille");
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + ", " + historielist.get(2) + "]");
                System.out.println("");
                s.efterTilkaldt(historielist.get(2));
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + ", " + historielist.get(2) + "]");
                System.out.println("");
                s.forsvind(historielist.get(1));
                historielist.remove(1);
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + "]");
                System.out.println("");
                s.sidst(historielist.get(1));
                return;
            }
            if(historielist.get(1) == "Lystig"){
                historielist.add("Gnavpot");
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + ", " + historielist.get(2) + "]");
                System.out.println("");
                s.efterTilkaldt(historielist.get(2));
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + ", " + historielist.get(2) + "]");
                System.out.println("");
                s.forsvind(historielist.get(1));
                historielist.remove(1);
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + "]");
                System.out.println("");
                s.sidst(historielist.get(1));
                return;
            }
            if(historielist.get(1) == "Brille"){
                historielist.add("Lystig");
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + ", " + historielist.get(2) + "]");
                System.out.println("");
                s.efterTilkaldt(historielist.get(2));
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + ", " + historielist.get(2) + "]");
                System.out.println("");
                s.forsvind(historielist.get(1));
                historielist.remove(1);
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + "]");
                System.out.println("");
                s.sidst(historielist.get(1));
                return;
            }
        }

        // Lystig
        if(historielist.get(0) == "Lystig"){
            l.tilkald(historielist.get(1));
            if(historielist.get(1) == "Gnavpot"){
                historielist.add("Søvnig");
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + ", " + historielist.get(2) + "]");
                System.out.println("");
                l.efterTilkaldt(historielist.get(2));
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + ", " + historielist.get(2) + "]");
                System.out.println("");
                l.forsvind(historielist.get(1));
                historielist.remove(1);
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + "]");
                System.out.println("");
                l.sidst(historielist.get(1));
                return;
            }
            if(historielist.get(1) == "Søvnig"){
                historielist.add("Brille");
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + ", " + historielist.get(2) + "]");
                System.out.println("");
                l.efterTilkaldt(historielist.get(2));
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + ", " + historielist.get(2) + "]");
                System.out.println("");
                l.forsvind(historielist.get(1));
                historielist.remove(1);
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + "]");
                System.out.println("");
                l.sidst(historielist.get(1));
                return;
            }
            if(historielist.get(1) == "Brille"){
                historielist.add("Gnavpot");
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + ", " + historielist.get(2) + "]");
                System.out.println("");
                l.efterTilkaldt(historielist.get(2));
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + ", " + historielist.get(2) + "]");
                System.out.println("");
                l.forsvind(historielist.get(1));
                historielist.remove(1);
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + "]");
                System.out.println("");
                l.sidst(historielist.get(1));
                return;
            }
        }

        // Lystig
        if(historielist.get(0) == "Gnavpot"){
            g.tilkald(historielist.get(1));
            if(historielist.get(1) == "Brille"){
                historielist.add("Søvnig");
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + ", " + historielist.get(2) + "]");
                System.out.println("");
                g.efterTilkaldt(historielist.get(2));
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + ", " + historielist.get(2) + "]");
                System.out.println("");
                g.forsvind(historielist.get(1));
                historielist.remove(1);
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + "]");
                System.out.println("");
                g.sidst(historielist.get(1));
                return;
            }
            if(historielist.get(1) == "Søvnig"){
                historielist.add("Lystig");
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + ", " + historielist.get(2) + "]");
                System.out.println("");
                g.efterTilkaldt(historielist.get(2));
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + ", " + historielist.get(2) + "]");
                System.out.println("");
                g.forsvind(historielist.get(1));
                historielist.remove(1);
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + "]");
                System.out.println("");
                g.sidst(historielist.get(1));
                return;
            }
            if(historielist.get(1) == "Brille"){
                historielist.add("Søvnig");
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + ", " + historielist.get(2) + "]");
                System.out.println("");
                g.efterTilkaldt(historielist.get(2));
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + ", " + historielist.get(2) + "]");
                System.out.println("");
                g.forsvind(historielist.get(1));
                historielist.remove(1);
                System.out.println("");
                System.out.println("[" + historielist.get(0) + ", " + historielist.get(1) + "]");
                System.out.println("");
                g.sidst(historielist.get(1));
                return;
            }
        }





    }
}