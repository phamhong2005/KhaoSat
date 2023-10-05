package Validate;

import javax.sound.midi.MidiDevice;
import javax.swing.*;
import javax.swing.plaf.synth.SynthTreeUI;
import java.util.Scanner;

public class Validate {
    public static int id() {
        Scanner scanner = new Scanner(System.in);
        String regex = "[0-9]{3}";
        String id;
        do {
            id = scanner.nextLine();
            if (id.matches(regex)) {
                break;
            }
            System.out.println("Yêu Cau Ban Nhap Lai");
        } while (true);
        return Integer.parseInt(id);
    }

    public static int choice() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Yêu Cầu Bạn Nhap Đúng");
            }
        } while (true);
        return choice;
    }

    public static String name() {
        Scanner scanner = new Scanner(System.in);
        String regex = "[a-zA-Z]{4,}$";
        String name;
        do {
            name = scanner.nextLine();
            if (name.matches(regex)) {
                break;
            }
            System.out.println("Yêu Cau Ban Nhap Dung");
        } while (true);
        return name;
    }

    public static int price() {
        Scanner scanner = new Scanner(System.in);
        String regex = "[1-9]{1,3}";
        String price;
        do {

                price = scanner.nextLine();
                if (price.matches(regex)) {
                    break;
                }
                System.out.println("Yêu Cầu Bạn Nhập Đúng");
        } while (true);
        return Integer.parseInt(price);
    }

    public static int quantity() {
        Scanner scanner = new Scanner(System.in);
        String regex = "[0-9]{1,2}$";
        String quantity;
        do {
            quantity = scanner.nextLine();
            if (quantity.matches(regex)) {
                break;
            }
            System.out.println("Yêu Cầu Bạn Nhập Đúng");
        } while (true);
        return Integer.parseInt(quantity);
    }
}
