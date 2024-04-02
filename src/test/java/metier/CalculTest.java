package metier;

import Metier.Calcul;
import org.junit.Test;
import org.springframework.util.Assert;

public class CalculTest {
    private Calcul calcul;
    @Test
    public void testSomme(){
        calcul=new Calcul();
        double a=5;
        double b=9;
        double expected=14;
        double res=calcul.somme(a,b);
        Assert.isTrue(res==expected);
    }
}
