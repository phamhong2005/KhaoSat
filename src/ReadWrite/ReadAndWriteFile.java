package ReadWrite;

import model.Product;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWriteFile {
    File file = new File("data/products.csv");


    public void writeFile(ArrayList<Product> list) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (Product product : list) {
                line += product.getId() + "," + product.getName() + "," + product.getQuantity() + "," + product.getQuantity() + "," + product.getPrice() + "," + product.getProductType() + "\n";

            }
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Product> list() {
        ArrayList<Product> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                Product product = new Product(Integer.parseInt(str[0]), str[1], Integer.parseInt(str[2]), Integer.parseInt(str[3]), str[4]);
                list.add(product);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}
