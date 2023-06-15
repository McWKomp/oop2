package mainPack.userPack;

import java.util.ArrayList;

public class userTask {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Vasya");
        user.setName("Kateryna");
        user.setPassword("12345678ss");
        user.setDateOfBirth("21.09.2002");

        Admin admin = new Admin();
        admin.add(user.getName());
    }
}

interface IUser{
    String getName();
    void setName(String newName);
}

class Admin implements IUser{

    ArrayList<String> arr = new ArrayList<>();

    private String adminName;

    @Override
    public String getName() {
        return adminName;
    }

    @Override
    public void setName(String adminName) {
        this.adminName = adminName;
        System.out.println("The new name of this user is "+this.adminName);
    }

    public void add(String user) {
        System.out.println("User "+'"'+user+'"'+" has been added");
        arr.add(user);
    }

    public void del(String user) {
        System.out.println("User "+'"'+user+'"'+" has been removed");
        arr.remove(user);
    }
}

class User implements IUser{
    private String userName;
    private String dateOfBirth;
    private String password;

    public String getPassword() {
        System.out.println(password);
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        System.out.println("The new password of this user is "+this.password);
    }



    public String getDateOfBirth() {
        System.out.println(dateOfBirth);
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        System.out.println("The new date of birth of this user is "+this.dateOfBirth);
    }

    @Override
    public String getName() {
        System.out.println(userName);
        return userName;
    }

    @Override
    public void setName(String userName) {
        this.userName = userName;
        System.out.println("The new name of this user is "+this.userName);
    }

}