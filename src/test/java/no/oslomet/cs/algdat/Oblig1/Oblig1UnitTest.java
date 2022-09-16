package no.oslomet.cs.algdat.Oblig1;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Denne klassen kan du bruke til hjelp under utvikling av din oblig.
 * Lag små og enkle test-eksempler for å teste at metoden din fungerer som ønsket.
 */
class Oblig1UnitTest {

    @org.junit.jupiter.api.Test
    void maks() {
        assertEquals(true, false, "Implementer maks og denne testen");
    }

    @org.junit.jupiter.api.Test
    void ombyttinger() {
        assertEquals(true, false, "Implementer ombyttinger og denne testen");
    }

    @org.junit.jupiter.api.Test
    void antallUlikeSortert() {
        assertEquals(true, false, "Implementer delsortering og denne testen");
    }

    @org.junit.jupiter.api.Test
    void antallUlikeUsortert() {
        assertEquals(true, false, "Implementer antallUlikeUsortert og denne testen");
    }

    @org.junit.jupiter.api.Test
    void delsortering() {
        assertEquals(true, false, "Implementer delsortering og denne testen");
    }

    @org.junit.jupiter.api.Test
    void rotasjon() {
        int antallFeil = 0;

        //Oppgave 5
        char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        try {
            Oblig1.rotasjon(a);  // kaller metoden
        } catch (Exception e) {
            System.out.println("Resultat er ikke riktig");
            antallFeil++;
        }
        System.out.println("Oppgave 5 resultat:");
        System.out.println(a);

        //Oppgave 6
        char[] b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

        //Test 1
        Oblig1.rotasjon(b, 3);
        if (!Arrays.equals(b, b)) {
            System.out.println("Resultat er ikke riktig");
            antallFeil++;
        }
        System.out.println("Oppgave 6 - Test 1 resultat:");
        System.out.println(b);

        //Test 2
        Oblig1.rotasjon(b, -2);
        if (!Arrays.equals(b, b)) {
            System.out.println("Resultat er ikke riktig");
            antallFeil++;
        }
        System.out.println("Oppgave 6 - Test 2 resultat:");
        System.out.println(b);

        //Sjekker om det ble noen feil
        assertEquals(0, antallFeil, "");
    }

    @org.junit.jupiter.api.Test
    void flett() {
        assertEquals(true, false, "Implementer flett og denne testen");
    }

    @org.junit.jupiter.api.Test
    void indekssortering() {
        assertEquals(true, false, "Implementer indekssortering og denne testen");
    }

    @org.junit.jupiter.api.Test
    void tredjeMin() {
        assertEquals(true, false, "Implementer tredjeMin og denne testen");
    }

    @org.junit.jupiter.api.Test
    void bokstavNr() {
        assertEquals(true, false, "Implementer bokstavNr og denne testen");
    }

    @org.junit.jupiter.api.Test
    void inneholdt() {
        int antallFeil = 0;

        //Oppgave 10
        boolean c;
        c = Oblig1.inneholdt("ABBA", "RABARBRA");
        if (!c) {
            System.out.println("Oppgave 10: i) Svaret skal bli lik true her!");
            antallFeil++;
        }
        System.out.println("Oppgave 10 resultat:");
        System.out.println(c);

        //Sjekker om det ble noen feil
        assertEquals(0, antallFeil, "");
    }
}