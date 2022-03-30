import java.util.Locale;
/*
* Krzysztof Mieńkowski
* 09.03.2022
* 2pp
* Funkcja isPalnidrom zwraca wartosci true lub false
* Funkcja Przestaw zwraca String
 */
public class Main {
    public static boolean isPalindrom(String w1, String w2){
    int dlugosc1 = w1.length();
    int dlugosc2 = w2.length();
    if (dlugosc1 == dlugosc2){
        String Dosprawdzenia1 = w1.toLowerCase();
        String Dosprawdzenia2 = w2.toLowerCase();
        boolean sprawdzanie = Dosprawdzenia1.equals(Dosprawdzenia2);
        if(sprawdzanie = true){
            return true;

        } else {
            return false;
        }

    } else {
        System.out.println("Te wyrazy sa rozne");
    }


        return false;
    }

    public static String Przestaw(String wyraz){
        int n = 0;
        String Przestawiony = wyraz;
        if (n % 2 == 0);
        {

            for (int i = 0; i < wyraz.length(); i++) {
                Przestawiony.charAt(n) = Przestawiony.charAt(n-1);
                n++;

            }
        }
        return Przestawiony;
    }
    public static void main(String[] args) {

    System.out.println(isPalindrom("anna","anna"));
    System.out.println(Przestaw("anna"));


    }
}

