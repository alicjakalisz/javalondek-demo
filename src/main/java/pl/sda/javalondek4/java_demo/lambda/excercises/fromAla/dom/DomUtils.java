package pl.sda.javalondek4.java_demo.lambda.excercises.fromAla.dom;


import java.util.Optional;

//Zadanie
//1). Zróbcie prostą kompozycję:
//- obiekt dom
//- zawiera obiekt kuchnia
//- w kuchni znajduje sie płyta indukcyjne
//- w płycie znajduje się wyświetlacz
//- na wyświetlaczu jest teks
//dodajcie metodę która dla danego domu zwróci tekst wyświetlany na płycie indukcyjnej
//użyjcie lambd
// metoda ma być w pełni bezpieczna i nie rzucać NullPointerException:)
public class DomUtils {

    public static void main(String[] args) {

        //test: happy path
        Tekst tekstNr1 = new Tekst("Tu jest jakis tekst :)");
        Wyswietlacz wyswietlacz = new Wyswietlacz(tekstNr1);
        PlytaIndukcyjna plytaIndukcyjna = new PlytaIndukcyjna(wyswietlacz);
        Kuchnia kuchnia = new Kuchnia(plytaIndukcyjna);
        Dom dom = new Dom(kuchnia);
        String trescTekstuNr1 = getTekst(dom);
        System.out.println(trescTekstuNr1);


        // test: kuchnia bez plyty indukcyjnej
        Kuchnia pustaKuchnia = new Kuchnia(null);
        Dom domZPustaKuchnia = new Dom(pustaKuchnia);
        String trescTekstu2 = getTekst(domZPustaKuchnia);
        System.out.println(trescTekstu2);

    }

    public static String getTekst(Dom dom) {

        return Optional.ofNullable(dom)
                .map(d -> d.getKuchnia())
                .map(kuchnia -> kuchnia.getPlytaIndukcyjna())
                .map(plytaIndukcyjna -> plytaIndukcyjna.getWyswietlacz())
                .map(wyswietlacz -> wyswietlacz.getTekst())
                .map(tekst -> tekst.getTekst())
                .orElse("Nie ma zadnej tresci");
    }

}

class Dom {

    private Kuchnia kuchnia;

    public Dom(Kuchnia kuchnia) {
        this.kuchnia = kuchnia;
    }

    public Kuchnia getKuchnia() {
        return kuchnia;
    }


}

class Kuchnia {

    private PlytaIndukcyjna plytaIndukcyjna;

    public Kuchnia(PlytaIndukcyjna plytaIndukcyjna) {
        this.plytaIndukcyjna = plytaIndukcyjna;
    }

    public PlytaIndukcyjna getPlytaIndukcyjna() {
        return plytaIndukcyjna;
    }
}

class PlytaIndukcyjna {

    private Wyswietlacz wyswietlacz;

    public PlytaIndukcyjna(Wyswietlacz wyswietlacz) {
        this.wyswietlacz = wyswietlacz;
    }

    public Wyswietlacz getWyswietlacz() {
        return wyswietlacz;
    }
}

class Wyswietlacz {

    private Tekst tekst;

    public Wyswietlacz(Tekst tekst) {
        this.tekst = tekst;
    }

    public Tekst getTekst() {
        return tekst;
    }
}

class Tekst {
    private String tekst;

    public Tekst(String tekst) {
        this.tekst = tekst;
    }

    public String getTekst() {
        return tekst;
    }
}