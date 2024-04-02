package Metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class IMetierImpl implements IMetier {
    //Couplage faible

    private IDao dao;

    public IMetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }
    /*
    injecter dans la variable dao  un objet d'une classe
    qui implemente linterface IDao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
