public class Gnavpot {
        
    private String navn;

    public Gnavpot(String navn){
        this.navn = navn;
    }

    public void tilkald(String navn){
        if(navn == "Lystig"){
            System.out.println("Gnavpot og Lystig er igang med forårsrengøring");
            System.out.println("Brille vil gerne hjælpe ");
            return;
            
        }
        if(navn == "Søvnig"){
            System.out.println("Gnavpot og Søvnig ser en romantisk film i TVet");
            System.out.println("Lystig elsker film og vil gerne være med");
            return;
        }
        if(navn == "Brille"){
            System.out.println("Gnavpot og Brille skal til at lave mad");
            System.out.println("Søvnig syntes de larmer og komemr ud i køkkenet");
            return;
        }
    }

    public void efterTilkaldt(String navn){
        if(navn == "Søvnig"){
            System.out.println("Søvnig fortæller Brille han larmer når han rør i gryden");
            System.out.println("Brille syntes han skal slappe lidt af"); 
            return;
        }
        if(navn == "Lystig"){
            System.out.println("Lystig fortætter Søvnig om de romantiske film han sidst har set");
            System.out.println("Søvning bliver træt af alt den snak");
            return;
        }
        if(navn == "Brille"){
            System.out.println("Brille forsætter Lystig at han elsker at gøre rent og begynder at vaske vinduer");
            System.out.println("Lystig syntes ikke Bille gør det godt nok");
            return;
        }
    }

    public void forsvind(String navn){
        if(navn == "Søvnig"){
            System.out.println("Søvnig gør ind og tager en lur");
            return;
        }
        if(navn == "Lystig"){
            System.out.println("Lystig går da vinduerne var blevet vasket");
            return;
        }
        if(navn == "Brille"){
            System.out.println("Brille går da han syntes Søvnig skal bestemme alt");
            return;
        }
    }

    public void sidst(String navn){
        if(navn == "Søvnig"){
            System.out.println("Søvnig og Gnavpot laver mad færdig sammen");
            return;
        }
        if(navn == "Lystig"){
            System.out.println("Lystig og Gnavpot ser filmen færdig sammen");
            return;
        }
        if(navn == "Brille"){
            System.out.println("Brille og Gnavpot forsætter rengørenden sammen");
            return;
        }
    }
}
