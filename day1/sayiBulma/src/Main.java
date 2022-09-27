public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 6;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if(varMi) {
            System.out.println("Sayı mevcuttur");
        } else {
            System.out.println("Sayı mevcut değildir");
        }

        /*
        boolean listedeVar = false;

        for (int i = 0; i < sayilar.length; i++) {
            if(aranacak == sayilar[i]) {
                listedeVar = true;
            }
        }

        // System.out.println(listedeVar);

        if(listedeVar) {
            System.out.println(aranacak + " listede var");
        } else {
            System.out.println(aranacak + " listede yok");
        }
        */
    }
}