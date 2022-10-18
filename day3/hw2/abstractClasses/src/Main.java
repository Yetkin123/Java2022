public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

        // Abstract sınıflar asla newlenemez. Hata verir.
        // GameCalculator gameCalculator = new GameCalculator();

        GameCalculator gameCalculator = new WomanGameCalculator();
    }
}