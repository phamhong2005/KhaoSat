package manager;

import ReadWrite.ReadAndWriteFile;
import model.Product;

import javax.sound.midi.MidiDevice;
import java.io.File;
import java.util.ArrayList;

public class ProductManager implements IProductManager<Product> {
    ArrayList<Product> list;
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

    public ProductManager() {
        list = readAndWriteFile.list();
    }

    @Override
    public void add(Product product) {
        list.add(product);
        readAndWriteFile.writeFile(list);
    }

    @Override
    public void update(int id, Product product) {
        int index = findById(id);
        list.set(index, product);
        readAndWriteFile.writeFile(list);
    }

    @Override
    public void remove(int id) {
        int index = findById(id);
        list.remove(index);
        readAndWriteFile.writeFile(list);
    }

    @Override
    public ArrayList<Product> finAll() {
        return list;
    }

    @Override
    public ArrayList<Product> searchName(String name) {
        ArrayList<Product> list1 = new ArrayList<>();
        for (Product product : list) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                list1.add(product);
            }
        }
        return list1;
    }

    @Override
    public ArrayList<Product> searchId(int id) {
        ArrayList<Product> list1 = new ArrayList<>();
        for (Product product: list) {
            if (product.getId()==id){
                list1.add(product);
            }
        }
        return list1;
    }

    @Override
    public int findById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ArrayList<Product> searchProductType(String productType) {
        ArrayList<Product> list1 = new ArrayList<>();
        for (Product product:list) {
           if (product.getProductType().toLowerCase().contains(productType.toLowerCase())){
               list1.add(product);
           }
        }
        return list1;
    }
}

