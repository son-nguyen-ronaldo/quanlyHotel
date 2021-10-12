package view;

import controller.Hotel;
import model.Oder;
import model.Room;
import model.User;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User son = new User("Trung Son", "1999","01");
        User phi = new User("Cao Phi", "1999","02");
        ArrayList<User> users = new ArrayList<>();
        users.add(son);
        users.add(phi);

        Room r1 = new Room("TT111", "VIP", 100);
        Room r2 = new Room("TT222", "FAKE", 500);
        Room r3 = new Room("TT333", "FAKE", 700);
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
        Hotel trungSon = new Hotel(users, rooms);
        Oder orderofPhi = new Oder();
        orderofPhi.setUser(phi);
        orderofPhi.setRoom(r2);
        orderofPhi.setCheckin(LocalDate.of(2021, 10, 5));
        orderofPhi.setCheckout(LocalDate.of(2021, 10, 10));
        //System.out.println(orderofPhi.getTotalPrice());
        ArrayList<Oder> orders = new ArrayList<>();
        orders.add(orderofPhi);

        trungSon.setOders(orders);
        //tinh so tien phong
        System.out.println("So tien phai tra la : ");
        System.out.println(trungSon.getAllTotal());


    }
}
