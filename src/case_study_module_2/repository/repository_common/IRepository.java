package case_study_module_2.repository.repository_common;


import java.util.List;

public interface IRepository<E> {
    List<E> showList();
    void addNew(E e);
    void edit();


}
