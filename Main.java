package factoryMethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus opiskelija = new Opiskelija();
        AterioivaOtus rehtori = new Rehtori();
        opettaja.aterioi();
        System.out.println();
        opiskelija.aterioi();
        System.out.println();
        rehtori.aterioi();
    }
}
