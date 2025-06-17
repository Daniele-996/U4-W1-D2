package esOne;

public class Main {
    public static void main(String[] args) {
        String stringaOne = "ciao bello";
        String stringaTwo = "ciao bello come stai";
        String stringaThree = "ciao bello come stai oggi??";
        System.out.println(stringaPariDispari( stringaOne));
        System.out.println(stringaPariDispari( stringaTwo));
        System.out.println(stringaPariDispari( stringaThree));

        int anno800 = 800;
        int anno1545 = 1545;
        int anno2000 = 2000;
        int annoDomini = 2025;
        System.out.println(annoBisestile(anno800));
        System.out.println(annoBisestile(anno1545));
        System.out.println(annoBisestile(anno2000));
        System.out.println(annoBisestile(annoDomini));

    }
    public static boolean stringaPariDispari(String abcd){
        return abcd.length() % 2 == 0;
    }
    public static boolean annoBisestile(int year){
        return (year % 4 == 0 &&(year % 100 == 0 && year % 400 == 0));
    }
}
