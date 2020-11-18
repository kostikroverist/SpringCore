package ua.lviv.lgs.springCore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.lviv.lgs.dao.StudentDAO;

@Configuration
public class CustomConfigure {

    @Bean(name = "studDAO")
    public StudentDAO getStudentDAO(){
        StudentDAO studentDAO = new StudentDAO();
        return  studentDAO;
    }
        @Bean (name = "consoleLoger")
    public ConsoleEventLogger getConsoleEventLogger(){
        return  new ConsoleEventLogger();
        }

}
