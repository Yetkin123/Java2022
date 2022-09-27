public class Main {
    public static void main(String[] args) {
        KrediUI krediUI = new KrediUI();
                            // Polimorfizm
        krediUI.KrediHesapla(new AskerKrediManager());
    }
}