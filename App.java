public class App {
   
    
    public static void main(String[] args) {
        Tao lalaki = new Tao();
        Anak anak = new Anak();
        lalaki.pangalan = "Christian";
        lalaki.edad = 25;
        System.out.println("Pangalan: " + lalaki.pangalan);
        System.out.println("Edad: " + lalaki.edad);
        System.out.println("Ang iyong password ay: " + lalaki.getPassword());
        lalaki.maglakad();
        lalaki.magsalita();
        System.out.println("Password: " + lalaki.getPassword());
        anak.maglakad();
        anak.magsalita();
        System.out.println("Password: " + anak.getPassword());

    }
}
