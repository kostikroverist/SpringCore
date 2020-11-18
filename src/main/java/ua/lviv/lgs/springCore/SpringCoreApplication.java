package ua.lviv.lgs.springCore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ua.lviv.lgs.dao.StudentDAO;
import ua.lviv.lgs.domain.Student;

@SpringBootApplication
public class SpringCoreApplication {


    public static void main(String[] args) {
        Student student2 = new Student( 6,"Misha",2123);
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringCoreApplication.class,args);

        StudentDAO studentDAO =(StudentDAO) ctx.getBean("studDAO");
        ConsoleEventLogger console = (ConsoleEventLogger)ctx.getBean("consoleLoger");


        studentDAO.save(new Student(3,"Angelina",12));
        studentDAO.save(new Student( 4,"Adny",2123));
        studentDAO.save(new Student( 5,"Slavko",2123));
        studentDAO.save(new Student( 6,"Misha",2123));
        console.logEvent(studentDAO.get(1).toString());
        studentDAO.update(student2,new String[]{"Jaring"});
        studentDAO.delete(student2);
        console.logEvent(studentDAO.getAll().toString());
        console.logEvent(studentDAO.readId(5).toString());

    }

}
