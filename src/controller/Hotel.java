package controller;

import model.Oder;
import model.Room;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    ArrayList<User> userList = new ArrayList<>();
    ArrayList<Room> roomList = new ArrayList<>();
    ArrayList<Oder> oders = new ArrayList<>();

    public void addNewRoom(Room room){
        roomList.add(room);
    }
  public  long getAllTotal(){
        long total=0;
      for (Oder order: oders
           ) {
          total+= order.getTotalPrice();
      }
        return  total;
  }

    public ArrayList<Oder> getOders() {
        return oders;
    }

    public void setOders(ArrayList<Oder> oders) {
        this.oders = oders;
    }

    public Hotel(ArrayList<User> userList, ArrayList<Room> roomList) {
        this.userList = userList;
        this.roomList = roomList;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }
}
