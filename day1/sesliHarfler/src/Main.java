public class Main {
    public static void main(String[] args) {
        char harf = 'I';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
        }

        /*
        if(harf == 'E' || harf == 'İ' || harf == 'Ö' || harf == 'Ü') {
            System.out.println(harf + " ince sesli harftir");
        } else if (harf == 'A' || harf == 'I' || harf == 'O' || harf == 'U') {
            System.out.println(harf + " kalın sesli harftir");
        } else {
            System.out.println(harf + " sessiz harftir");
        }
         */
    }
}