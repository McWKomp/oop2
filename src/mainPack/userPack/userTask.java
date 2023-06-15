package mainPack.userPack;

import java.util.ArrayList;

public class userTask {
    public static void main(String[] args) {

        User user = new User();
        user.setName("Vasya");
        user.getName();
        user.setName("Katerina");
        user.getName();

        Admin admin = new Admin();
        admin.add(user.name());




    }
}

interface IUser{
    void getName();
    void setName(String newName);
}

class Admin implements IUser{

    ArrayList<String> arr = new ArrayList<>();

    @Override
    public void getName() {
    }

    @Override
    public void setName(String newName) {

    }

    public void add(String user) {
        System.out.println("User "+'"'+user+'"'+" has been added");
        arr.add(user);
    }

    public void del(ArrayList<User> arr) {

    }
}

class User implements IUser{
    private String name;
    @Override
    public void getName() {
        System.out.println("The name of this user is "+this.name);
    }

    @Override
    public void setName(String newName) {
        this.name = newName;
        System.out.println("The new name of this user is "+this.name);
    }

    public String name(){
        return name;
    }
}