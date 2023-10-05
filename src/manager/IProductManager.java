package manager;

import java.util.ArrayList;

public interface IProductManager <E>{
    void add(E e);
    void update(int id , E e);
    void remove(int id);
    ArrayList<E> finAll();
    ArrayList<E> searchName(String name);
    ArrayList<E>searchId(int id);
    int findById(int id);
    ArrayList<E> searchProductType(String productType);

}
