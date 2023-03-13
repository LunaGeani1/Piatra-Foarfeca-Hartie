import java.util.Scanner;

public class ProiectPiatra {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Buna ziua! Doriti sa jucati?");
        String raspuns=scan.nextLine();
        switch(raspuns){
          case "Da":{
            System.out.println("Super! alege dintre 'Piatra' 'Foarfeca' 'Hartie' !");
            String alegere=scan.nextLine();
            System.out.println("Alegerea ta este: "+alegere);
            String alegereCalculator = alegereCalculator();
            System.out.println("Alecere calculator : "+alegereCalculator);
        String rezultat=rezultat(alegere, alegereCalculator);
        System.out.println(rezultat);
          };break;
          case "Nu":System.out.println("Atunci de ce m-ai deranjat!");break;
          default:System.out.println("Alegere incorecta !");
        }


        
    scan.close();}

    public static String alegereCalculator(){  
        double numarAleatoriu=Math.random()*3;
        int integer = (int)numarAleatoriu;

        switch(integer){
case 1:return "Piatra";
case 2:return "Foarfeca";
case 3:return "Hartie";
default:return " ";
        }
    }

    public static String rezultat(String alegere, String alegereCalculator){
        String rezultat="";
        if(alegere.equals(alegereCalculator)){
           rezultat="Egalitate";
        }else if(alegere.equals("Piatra") && alegereCalculator.equals("Foarfeca" )){
           rezultat="Tu ai castigat";
        }else if(alegere.equals("Hartie") && alegereCalculator.equals("Foarfeca")){
           rezultat="Calculatorul castiga";
        }else if( alegere.equals("Foarfeca") && alegereCalculator.equals("Piatra")){
            rezultat="Calculatorul a castigat";
        }else if(alegere.equals("Foarfeca") && alegereCalculator.equals("Hartie")){
            rezultat="Tu ai castigat";
        }else if(alegere.equals("Hartie") && alegereCalculator.equals("Piatra")){
          rezultat="Tu ai castigat";
        }else if(alegere.equals("Piatra") && alegereCalculator.equals("Hartie")){
            rezultat="Calculatorul castiga!";
        }else{
            rezultat="alegere incorecta";
            System.exit(0);
        }
        return rezultat;

    }

    
}