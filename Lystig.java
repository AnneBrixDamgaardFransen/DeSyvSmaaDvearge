public class Lystig {
    
    private String navn;

    public Lystig(String navn){
        this.navn = navn;
    }

    public void tilkald(String navn){
        if(navn == "Gnavpot"){
            System.out.println("Lystig og Gnavpot diskutere klima politik");
            System.out.println("Søvnig syntes det lyder spændende og vil gerne være med");
            return;
            
        }
        if(navn == "Søvnig"){
            System.out.println("Lystig og Søvnig vil en tur på standen");
            System.out.println("Brille har ikke været på standen i år og vil gerne med");
            return;
        }
        if(navn == "Brille"){
            System.out.println("Lystig og Brille overvejer at farve deres negle");
            System.out.println("Gnavpot har aldrig prøvet det før og kommer ud i køkkenet");
            return;
        }
    }

    public void efterTilkaldt(String navn){
        if(navn == "Søvnig"){
            System.out.println("Søvnig fortæller Gnavpot at han er blevet vegetar");
            System.out.println("Gnavport siger man ikke må spise kylling når man er vegetar"); 
            return;
        }
        if(navn == "Gnavpot"){
            System.out.println("Gnavpot spørg Brille om han kan få selvlysende negle");
            System.out.println("Brille syntes det lyder lidt voldsomt");
            return;
        }
        if(navn == "Brille"){
            System.out.println("Brille forsætter Søvnig han gerne vil til en strand i Jylland");
            System.out.println("Søvnig syntes det er alt for langt væk når de bor på fyn");
            return;
        }
    }

    public void forsvind(String navn){
        if(navn == "Søvnig"){
            System.out.println("Søvnig har ikke lyst til at tage med til Jylland og dropper strandturen");
            return;
        }
        if(navn == "Gnavpot"){
            System.out.println("Gnavpot syntes Søvnig er useriøs og går i vrede");
            return;
        }
        if(navn == "Brille"){
            System.out.println("Brille går ind på sit værelse og spiller pc");
            return;
        }
    }

    public void sidst(String navn){
        if(navn == "Søvnig"){
            System.out.println("Søvnig og Lystig snakker videre om politik");
            return;
        }
        if(navn == "Gnavpot"){
            System.out.println("Gnavpot og Lystig ligger negelak");
            return;
        }
        if(navn == "Brille"){
            System.out.println("Brille og Lystig tager til Jylland men finder ingen gode strande");
            return;
        }
    }
}