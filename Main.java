class Main {
    public static void main(String [] args){
        try{
            String poly=args[1];
            double racine=Double.parseDouble(args[0]);
            poly=poly.toUpperCase();
            String[]p1=poly.split("XXX");
            String[]p2=p1[1].split("XX");
            String[]p3=p2[1].split("X");
            if(p1[0].equals("") || p1[0].equals("+"))p1[0]="1";
            else if(p1[0].equals("-"))p1[0]="-1";
            if(p2[0].equals("") || p2[0].equals("+"))p2[0]="1";
            else if(p2[0].equals("-"))p2[0]="-1";
            if(p3[0].equals("") || p3[0].equals("+"))p3[0]="1";
            else if(p3[0].equals("-"))p3[0]="-1";
            double a=Double.parseDouble(p1[0]);
            double b=Double.parseDouble(p2[0]);
            double c=Double.parseDouble(p3[0]);
            double d=Double.parseDouble(p3[1]);
            if((Math.pow(racine,3)*a+Math.pow(racine,2)*b+racine*c+d)==0){
                b=b+(a*racine);
                c=c+(b*racine);
                System.out.print("l'equation "+poly+" ");
                degre2(a,b,c);
                System.out.print(racine+"\n");
            }
            else{
                System.out.print(racine+" n'est pas une racine du polynome entre\n");
            }
        }
        catch(NumberFormatException e){
            System.out.print("Entrer invalide\nentrer sous de la forme : racine aXXX+bXX+cX+d avec a,b,c,d appartenant à R\n");
        }
        catch(ArrayIndexOutOfBoundsException b){
                System.out.print("Entrer invalide\nentrer sous de la forme : racine aXXX+bXX+cX+d avec a,b,c,d appartenant à R\n");
        }
    }

    public static void degre2(double a,double b,double c){
        double x1,x2;
        double delta=(Math.pow(b,2))-(4*a*c);
        if(delta>0){
            x1=(-b-Math.sqrt(delta))/(2*a);
            x2=(-b+Math.sqrt(delta))/(2*a);
            System.out.print("admet trois solutions qui sont "+x1+" ; "+x2+" et ");
        }
        else if (delta==0){
            x1=-b/2*a;
            System.out.print("admet deux solution qui sont "+x1+" et ");
        }
        else System.out.print("admet une solution qui est ");
    }
}