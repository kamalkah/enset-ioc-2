package ext;

import dao.IDao;

public class DaoImplVWS  implements IDao {
    @Override
    public double getData() {
        System.out.println("vresion web service");

        return 90;
    }
}
