package per5_tugas;

public class User {
    private String nama;
    private String role;

    // constructor
    public User(String nama, String role) {
        this.nama = nama;
        this.role = role;
    }

    // getter
    public String getNama() {
        return nama;
    }
    public String getRole() {
        return role;
    }

    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
