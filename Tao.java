public class Tao {
    //attributes or fields
    String pangalan;
    int edad;
    private String password;

     //constructor or inizialition
     public Tao() {
        this.pangalan = "Walang Pangalan";
        this.edad = 0;
        this.password = "defaultpassword";
        
     }

    //methods
     public void maglakad() {
        System.out.println(pangalan + " ay naglalakad.");
    }

    public void magsalita() {
        System.out.println(pangalan + " ay nagsasalita.");
    }


    public void setPassword(String password) {
        this.password = password;
    }
    public String getpassword() {
        return password;
    }
    
}

   