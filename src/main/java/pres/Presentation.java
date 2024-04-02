package pres;

import Metier.IMetierImpl;
import ext.DaoImpl2;

public class Presentation {
    public static void main(String[] args){
        DaoImpl2 dao = new DaoImpl2();
        IMetierImpl Metier=new IMetierImpl(dao);
        //Metier.setDao(dao);
        System.out.println("resultat="+Metier.calcul());
    }
}
