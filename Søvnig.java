public class Søvnig {
        
    private String navn;

    public Søvnig(String navn){
        this.navn = navn;
    }

    public void tilkald(String navn){
        if(navn == "Gnavpot"){
            System.out.println("Søvnig og Gnavpot bager kage");
            System.out.println("Brille kan dufte kagen og vil gerne være med");
            return;
            
        }
        if(navn == "Lystig"){
            System.out.println("Søvnig og Lystig spiller fodbold");
            System.out.println("Gnavpot vil gerne være dommer og går uden for");
            return;
        }
        if(navn == "Brille"){
            System.out.println("Søvnig og Brille snakker om hvor de skal på ferie til sommer");
            System.out.println("Lystig vil gerne med på ferie og sætte sig sammen med dem");
            return;
        }
    }

    public void efterTilkaldt(String navn){
        if(navn == "Lystig"){
            System.out.println("Lystig fortæller Brille han gerne vil til Spanien p ferie");
            System.out.println("Brille vil meget heller til Island"); 
            return;
        }
        if(navn == "Gnavpot"){
            System.out.println("Gnavpot fortæller Lystig at han ikke spiller efter reglerne");
            System.out.println("Lystig er træt af Gnavpot altid skal bestemme");
            return;
        }
        if(navn == "Brille"){
            System.out.println("Brille læser opskriften op for Gnavpot");
            System.out.println("Gnavpot vil heller selv læse opskriften op");
            return;
        }
    }

    public void forsvind(String navn){
        if(navn == "Lystig"){
            System.out.println("Lystig går fra foddoldkampen og sætter sig inden for");
            return;
        }
        if(navn == "Gnavpot"){
            System.out.println("Gnavpot beslutter sig for selv at lave kage i morgen og går");
            return;
        }
        if(navn == "Brille"){
            System.out.println("Brille vil til Island og booker sig egen ferie");
            return;
        }
    }

    public void sidst(String navn){
        if(navn == "Lystig"){
            System.out.println("Lystig og Søvnig booker en tur sammen til Spanien");
            return;
        }
        if(navn == "Gnavpot"){
            System.out.println("Gnavpot og Søvnig spiller fodbold resten af eftermiddagen");
            return;
        }
        if(navn == "Brille"){
            System.out.println("Brille og Søvnig bager kagen færdig, men den smager ikke godt");
            return;
        }
    }
}
