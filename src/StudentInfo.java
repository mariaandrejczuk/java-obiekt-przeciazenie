public class StudentInfo {
    char[] imie;
    char[] nazwisko;
    int wiek;
    char[] email;
    int indeks;

    StudentInfo(char[] imie, char[] nazwisko, int wiek, char[] email, int indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.email = email;
        this.indeks = indeks;
    }

    StudentInfo(char[] imie, char[] nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    void displayShort () {
        System.out.println();
        System.out.print("Imię: ");
        for (char im : imie) {
            System.out.print(im);

        }
        System.out.println();
        System.out.print("Nazwisko: ");
        for (char nz : nazwisko) {
            System.out.print(nz);
        }
        System.out.println();
        System.out.println();
    }

    void displayLong(){
        System.out.println();
        System.out.print("Imię: ");
        for(char im : imie){
            System.out.print(im);
        }
        System.out.println();
        System.out.print("Nazwisko: ");
        for (char nz : nazwisko) {
            System.out.print(nz);
        }
        System.out.println();
        System.out.print("Wiek: "+wiek);
        System.out.print("");

        System.out.println();
        System.out.print("Email: ");
        for (char em : email) {
            System.out.print(em);
        }
        System.out.println();
        System.out.print("Nr indeksu: "+indeks);
        System.out.print("");
        System.out.println("");
    }
}