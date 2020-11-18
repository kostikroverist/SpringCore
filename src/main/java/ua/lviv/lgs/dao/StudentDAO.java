package ua.lviv.lgs.dao;

import ua.lviv.lgs.crud.AbstractStudentCRUD;
import ua.lviv.lgs.domain.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class StudentDAO implements AbstractStudentCRUD<Student> {

    List<Student> studentList = new ArrayList<>();

    public  StudentDAO(){
        studentList.add(new Student( 1,"Adnrey",21));
        studentList.add(new Student( 2,"Oleg",30));
    }


    @Override
    public Optional<Student> get(Integer id) {
        return Optional.ofNullable(studentList.get((Integer) id));
    }

    public Object readId(Integer id) {
        Student student = null;
        try {
            ;
            for (Student p : studentList) {
                if (p.getId() == id) {
                    return p;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }


    @Override
    public List<Student> getAll() {
        return studentList;
    }

    @Override
    public void save(Student student)
    {
            studentList.add(student);
    }

    @Override
    public void update(Student student, String[]params) {

        student.setName(Objects.requireNonNull(
                params[0],"Name cannot be null"
        ));
        studentList.add(student);
    }

    @Override
    public void delete(Student student) {
    studentList.remove(student);
    }
}
