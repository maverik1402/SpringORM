package app.test;

import app.dao.LocalDAO;
import app.dao.ServicioDAO;
import app.model.Local;
import app.model.Servicio;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTestLocal {

    public static void main(String[] args) {
        AppTestLocal.getAll();
    }

    public static void getAll() {

        ApplicationContext context = new ClassPathXmlApplicationContext("database.xml");

        LocalDAO localDAO = (LocalDAO) context.getBean("localDAO");
        List<Local> locales = localDAO.list();
        for (Local local : locales) {
            System.out.println(local.getDescripcion() + " " + local.getDireccion());
        }

    }
}
