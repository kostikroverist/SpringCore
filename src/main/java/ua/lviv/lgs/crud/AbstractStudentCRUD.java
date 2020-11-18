package ua.lviv.lgs.crud;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public interface AbstractStudentCRUD<T> {

    Optional<T> get(Integer id);
    Object readId(Integer id);
    List<T> getAll();
    void save(T t);
    void update(T t, String[]params);
    void delete(T t);
}
