package per5_tugas_1;

import java.util.HashMap;
// import java.util.Map;

public class User {
    private final String nama;
    private final String role;
    private final String password;

    private static final HashMap<String, String> loginUser = new HashMap<>();

    // blank constructor
    public User() {
        this.nama = "";
        this.role = "";
        this.password = "";
    }

    // constructor
    public User(String nama, String role, String password) {
        this.nama = nama;
        this.role = role;
        this.password = password;
    }

    //method to access hashmap to another class
    public HashMap<String, String> getUserMap() {
        return loginUser;
    }

    // getter
    public String getNama() {
        return nama;
    }
    public String getPassword() {
        return password;
    }
    public String getRole() {
        return role;
    }

    public boolean isUserExist(User user) {
        if(loginUser.containsKey(user.getNama()) && loginUser.containsValue(user.getPassword())) {
            return true;
        } else {
            System.out.println("No user in the list");
        }
        return false;
    }

    public void register(User user) {
        loginUser.put(user.getNama(), user.getPassword());
    }

    public void login(User user) {
        if(isUserExist(user)) {
            System.out.println("Hello" + user.getNama());
        } else {
            System.out.println("No user with name: " + user.getNama());
        }
    }
}


