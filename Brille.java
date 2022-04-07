public class Brille {
    
    private String navn;

    public Brille(String navn){
        this.navn = navn;
    }

    public void tilkald(String navn){
        if(navn == "Gnavpot"){
            System.out.println("Brille og Gnavpot bliver uvenner");
            System.out.println("De vækker Lystig");
            return;
            
        }
        if(navn == "Lystig"){
            System.out.println("Brille og Lystig danser på borderne");
            System.out.println("Det vækker Søvnig");
            return;
        }
        if(navn == "Søvnig"){
            System.out.println("Brille og Søvnig begynder at læse en bog");
            System.out.println("Men Gnavpot syntes det larmer og kommer");
            return;
        }
    }

    public void efterTilkaldt(String navn){
        if(navn == "Lystig"){
            System.out.println("Lystig prøver at få dem til at blive venner igen ved at joke");
            System.out.println("Det gør kun Gnavpots humør endnu værre"); 
            return;
        }
        if(navn == "Gnavpot"){
            System.out.println("Gnavpot syntes at Søvnig læser så langsomt");
            System.out.println("Søvnig prøver at sætte tempoet op");
            return;
        }
        if(navn == "Søvnig"){
            System.out.println("Søvnig syntes at Lystig danser godt");
            System.out.println("Søvnig prøver at lære hvordan man dansker salsa");
            return;
        }
    }

    public void forsvind(String navn){
        if(navn == "Lystig"){
            System.out.println("Lystig bliver træt at at skulle undervise og gør på klub i stedt for");
            return;
        }
        if(navn == "Gnavpot"){
            System.out.println("Gnavpot bliver så sur at han går");
            return;
        }
        if(navn == "Søvnig"){
            System.out.println("Søvnig bliver ked af det og går i seng igen");
            return;
        }
    }

    public void sidst(String navn){
        if(navn == "Lystig"){
            System.out.println("Lystig og Brille fortælle joks hele natten");
            return;
        }
        if(navn == "Gnavpot"){
            System.out.println("Gnavpot og Brille læser bogen hurtigt færdig sammen");
            return;
        }
        if(navn == "Søvnig"){
            System.out.println("Søvnig og Brille danser fri dans derhjemme");
            return;
        }
    }
}