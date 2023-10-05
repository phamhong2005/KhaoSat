package view;

import Validate.Validate;
import manager.ProductManager;
import model.Product;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    ProductManager productManager = new ProductManager();

    public void showMenu() {

        int choice;
        do {
            System.out.println("===Menu===\n1.Thêm Sản Phẩm\n2.Sửa Sản Phẩm\n3.Xóa Sản Phẩm\n4.Hiển Thị Thông Tin Sản Phẩm\n5.Tìm Kiếm Thông Tin\n6.Tìm Kiếm Loại Sản Phẩm\n7.Tìm Kiếm Bằng ID");
            System.out.println("Nhập lựa chọn của bạn");
            choice = Validate.choice();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    showAll();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    searchProductType();
                    break;
                case 7:
                    searchID();
                    break;
            }
        } while (choice != 0);
    }

    public void add() {
        System.out.println("Nhập ID");
        int id = Validate.id();
        System.out.println("Nhập Tên Sản Phẩm");
        String name = Validate.name();
        System.out.println("Nhập Số Lượng Sản Phẩm");
        int quantity = Validate.quantity();
        System.out.println("Nhập Giá");
        int price = Validate.price();
        System.out.println("Nhập Loại Sản Phẩm");
        String productType = scanner.nextLine();
        Product product = new Product(id, name, quantity, price, productType);
        productManager.add(product);
        System.out.println("Thêm Thành Công");
    }

    public void update() {
        System.out.println("Nhập ID Bạn Muốn Sửa");
        int idedit = Validate.id();
        System.out.println("Nhập Tên Sản Phẩm");
        String name = Validate.name();
        System.out.println("Nhập Số Lượng Sản Phẩm");
        int quantity = Validate.quantity();
        System.out.println("Nhập Giá");
        int price = Validate.price();
        System.out.println("Nhập Loại Sản Phẩm");
        String productType = scanner.nextLine();
        Product product = new Product(idedit,name,quantity,price,productType);
        productManager.update(idedit,product);
        System.out.println("Sửa Thành Công");
    }
    public void showAll(){
        System.out.println(productManager.finAll());
    }
    public void delete(){
        System.out.println("Nhập ID Bạn Muốn Xóa");
        int id = Validate.id();
        productManager.remove(id);
        System.out.println("Xóa Thành Công");
    }
    public void search(){
        System.out.println("Nhập Tên Bạn Muốn Tìm");
        String name = scanner.nextLine();
        System.out.println(productManager.searchName(name));
    }
    public void searchProductType (){
        System.out.println("Nhập Loại Sản Phẩm Muốn Tìm");
       String productType = scanner.nextLine();
        System.out.println(productManager.searchProductType(productType));
    }
    public void searchID(){
        System.out.println("Nhập ID Bạn Muốn Tìm");
        int id = Validate.id();
        System.out.println(productManager.searchId(id));
    }
}
