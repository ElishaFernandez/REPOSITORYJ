public class Tao {
    String pangalan;
    int edad;
    private String password;

    public String getPassword() {
        return password;
    }

    // constructor
    public Tao() {
        this.pangalan = "walang palangalan";
        this.edad = 0;
        this.password = "defaultpassword";
    }

    // method
    public void maglakad() {
        System.out.println(pangalan + " ay naglalakad.");
    }

    public void magsalita() {
        System.out.println(pangalan + " ay nagsasalita.");
    }

    public void setPassword(String password) {
        this.password = password;
    }

   public void getPassword(String password) {
        this.password = password;
    }
}
