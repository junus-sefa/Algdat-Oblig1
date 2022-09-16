package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {


    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        //throw new UnsupportedOperationException();
      //  public static int maks(int[] a){        // Metoden tar inn ett array som parameter.

          if (a.length == 0){
                throw new NoSuchElementException("Kan ikke bruke en tom tabell"); // Feilhåndtering dersom arrayets lengde er lik 0
            }
            for (int i = 0; i < a.length-1; i++){
                if (a[i] > a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
            return a[a.length-1];
        }

    public static int ombyttinger(int[] a) {
        //throw new UnsupportedOperationException();
        if(a.length == 0){ // hvis lengden på array == 0 return exception
            throw new NoSuchElementException("Arrayet er tomt");
        }
        int count = 0;
        for (int i = 0; i < a.length-1; i++){
            //Etter hver ombytting: count++
            if (a[i] > a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                count++;
            }
        }

        return count;
    }



    ///// Oppgave 2 //////////////////////////////////////
    //public static int antallUlikeSortert(int[] a) { throw new UnsupportedOperationException();}

    public static int antallUlikeSortert(int[] a) {
        //throw new UnsupportedOperationException();
        if(a.length < 1){   // Hvis lengden på array er mindre enn 0 return 0
            return 0;
        }
        int telling =1; // telling er 1 med tanke på at første telling er unik
        for(int i = 1; i < a.length; i++){ // i er satt til 1 ettersom a[i] sammenliknes med a[i-1]
            if( a[i] < a[i-1]){  //  Hvis ikke får man error index out ouf bounds
                throw new IllegalStateException("Talrekken er ikke i stigende rekkefølge");
            }
            if(a[i] != a[i-1]){ //hvis a[i] ikke er lik forrige tall: telling++
                telling++;
            }
        }
        return telling;
    }


    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        //throw new UnsupportedOperationException();

        // Hvis a er tom, returneres 0
        if (a.length < 1){
            return 0;
        }

        // Hvis a har lengde 1, returneres 1
        if (a.length == 1){
            return 1;
        }

        // Variabel for å telle antall ulike
        // Hvis tilfellene over ikke gjelder, må a ha lengde større enn 1
        // Dermed må a ha minst ett ulikt tall
        int antallUlike = 1;

        // Denne løkken vil peke til ett tall av gangen som skal testes om er lik de tidligere tallene i tabellen
        for (int i = 1; i < a.length; i++){
            int current_value = a[i];
            for (int j = 0; j < i; j++){
                if (a[j] == current_value){
                    break;
                }
                else {
                    // Sjekker om dette er siste iterasjon i for-løkken
                    if (j == i-1){
                        antallUlike++; //
                    }
                }
            }
        }
        return antallUlike;
    }

    ///// Oppgave 4 //////////////////////////////////////


   public static void delsortering(int[] a) {
        //throw new UnsupportedOperationException();

       // lager variabel left, som starter fra indeks 0
       // og right, som starter i enden av tabellen.
       int left = 0;
       int right = a.length-1;

       while (left < right){

           //Hvis left blir lik, eller større enn right, avsluttes løkken.

           //sjekker om det blir funnet et positivt oddetall,
           while (a[left] % 2 == 1 && left < right){
               left++;   //hvis et positivt oddetall blir funnet, går variabel, left, mot høyre til et partall blir funnet.
           }

           //sjekker om det blir funnet et negativt oddetall,
           while(a[left] % 2 == -1 && left < right){
               left++; //hvis et negativt oddetall blir funnet, går variabel, left, mot høyre til et partall blir funnet.
           }


           //sjekker om det blir funnet et partall
           while (a[right] % 2 == 0 && left < right){
               right--; // hvis et partall blir funnet, går variabel, right, mot venstre til et oddetall er funnet
           }

           //Bytter verdi dersom left er mindre enn right
           if (left < right){
               int temp = a[left];
               a[left] = a[right];
               a[right] = temp;
               left++;
               left--;
           }
       }
       if (right == a.length-1){
           left = left +1;
       }

       //Kaller metoden quicksort der parameter verdi er satt lik intervall for oddetall
       quickSort(a,0,left-1);
       //Kaller metoden quicksort der parameter verdi er satt lik intervall for partall
       quickSort(a,left,a.length-1);
    }

    static int partisjon(int[] array, int begin, int end) {
        int right = end;
        int left = begin;


        for (int i = begin; i < end; i++) {
            if (array[i] < array[right]) { // sjekker om nåværende verdi av array[i] er mindre enn siste verdi i  arrayet.
                //array[i] bytter om posisjon til verdien som left peker til.
                int temp = array[left];
                array[left] = array[i];
                array[i] = temp;
                left++; // left går én mot høyre
            }
        }

        //Siste verdi i arrayet settes i "midten" av tabellen
        int temp = array[right];
        array[right] = array[left];
        array[left] = temp;

        //verdien som blir plassert i midten er en skilleverdi og det er denne vi returnerer.
        //tall til venste for skilleverdien er mindre enn a[left] og tall til høyre er større.
        //Returnerer skilleverdi
        return left;
    }

    static void quickSort(int [] a,int begin,int end){
        if(end <= begin) return;
        int skilleVerdi = partisjon(a,begin,end);
        quickSort(a,begin,skilleVerdi-1);
        quickSort(a,skilleVerdi+1,end);
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        //throw new UnsupportedOperationException();
        int n = a.length;  //Legger lengde av arrayet i en variabel

        //Sjekker om lengden på arrayet er 0
        if (!(n == 0) && !(n == 1)){
            int rotasjoner = 1; //Setter ny verdi i rotasjon variabel
            char tempIndeks = a[0];  // tar vare på verdien

            //Lager en for-løkke for å rotere variabelene i arrayet
            for (int i = -rotasjoner, j = 0; i != 0; i -= rotasjoner){
                if (i < 0){ //Sjekker om i er mindre enn 0
                    i += n; //Isåfall setter vi at (antall rotasjoner) + (lengden på arrayet) = (antall rotasjoner (k))
                }
                a[j] = a[i]; //Kopierer indeks i til indeks j i array a
                j = i; //Oppdaterer indeks j
            }
            a[rotasjoner] = tempIndeks; // legger tilbake verdi i arrayet
        }
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        //throw new UnsupportedOperationException();
        int n = a.length;  //Legger lengde av arrayet i en variabel
        //Sjekker om lengden av arrayet er mindre enn 2
        if (n < 2){
            return;
        }
        //Sjekker om k har en restverdi av lengden på arrayet som er mindre enn 0
        if ( (k %= n) < 0 ){
            k += n; //Isåfall setter vi at (antall rotasjoner) + (lengden på arrayet) = (antall rotasjoner (k))
        }
        //Sjekker om antall rotasjoner er mindre eller lik lengden på array + 1/2
        if ( k <= (n+1)/2 ){
            char[] b = Arrays.copyOfRange(a, n - k, n); // Lager en hjelpetabell
            // Sjekker om n-k er mindre eller lik 0, for så å kopiere en spesifikk del av array a
            if (n - k >= 0) System.arraycopy(a, 0, a, k, n - k);
            System.arraycopy(b, 0, a, 0, k); // kopierer
        } else {
            char[] b = Arrays.copyOfRange(a, 0, n - k); // Lager en hjelpetabell
            // Sjekker om k er mindre eller lik 0, for så å kopiere en spesifikk del av array a
            if (k >= 0) System.arraycopy(a, n - k, a, 0, k);
            System.arraycopy(b, 0, a, k, n - k); // kopierer
        }
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
       // throw new UnsupportedOperationException();
        char [] S_arr = splitString(s);
        char [] T_arr = splitString(t);
        //Deklarer n slik:(hvis s>t saa er den s) else if(s<t saa er den t) else (den er t)
        int n = (S_arr.length> T_arr.length)? S_arr.length : (S_arr.length<T_arr.length)? T_arr.length : T_arr.length;

        char [] flettIChar = new char[S_arr.length + T_arr.length];
        int i = 0;
        while(i<n){
            if(i==0 && S_arr.length != 0 && T_arr.length!=0){
                flettIChar[i] = S_arr[i];
                flettIChar[i+1] = T_arr[i];
            }else if(i>= S_arr.length){
                int j = 2*i;
                int k = i;
                while(j<flettIChar.length){
                    flettIChar[j] = T_arr[k];
                    k++;
                    j++;
                }
                break;
            }else if(i>= T_arr.length){
                int j = 2*i;
                int k = i;
                while(j<flettIChar.length){
                    flettIChar[j] = S_arr[k];
                    k++;
                    j++;
                }
                break;
            } else{
                flettIChar[2*i] = S_arr[i];
                flettIChar[2*i+1] = T_arr[i];
            }
            i++;
        }

        StringBuilder flettet = new StringBuilder();
        for(char c:flettIChar){
            flettet.append(c);
        }
        return flettet.toString();
    }

    //hjelpemetode for 7a)
    static char[] splitString(String a){
        int n= a.length();
        char [] aSplit = new char[n];
        for(int i = 0; i<n;++i){
            aSplit[i] = a.charAt(i);
        }
        return aSplit;
    }



    /// 7b)
    public static String flett(String... s) {
        //throw new UnsupportedOperationException();
        int ls = 0;
        for (String value : s) {
        if (value.length() > ls) {
        ls = value.length();
            }
        }
        char [][] data = new char[s.length][ls];
        for(int i =0; i<s.length;++i){
        for(int j = 0; j<s[i].length();++j){
        data[i][j]=s[i].charAt(j);
            }
        }

        String resultat ="";
            for(int i = 0; i<ls;++i){
                for(int j = 0; j<s.length;++j){
                    if(data[j][i]!=0){
                resultat+=data[j][i];
                }
            }
        }
            //
        return resultat;
    }


    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        //throw new UnsupportedOperationException();
        int [] indekser = new int[a.length];
        int [] arr = a.clone();                         //Arrayet a kan ikke endre seg, derfor vi brukte en arr

        // Sortert arr arrayet ved bruk av insertion sort
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;                              //Indeks til tallet bak
            while(j >= 0 && current < arr[j]) {         //Saa lenge det finnes et tall mindre enn current, bytt plass
                arr[j+1] = arr[j];                      //Tallet bak blir verdien til indeks foran seg
                j--;                                    //Bryter while loopen
            }
            arr[j+1] = current;                         //Tallet foran blir verdien til indeks bak seg
        }
// Sammenligner de to arrayet og lagrer deres indeks
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == a[j]){
                    indekser[i] = j;
                    break;
                }
            }
        }
        // returnerer indekser
        return indekser;
    }


    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
       // throw new UnsupportedOperationException();

        if (a.length < 3){
            throw new NoSuchElementException("Tabellen inneholder færre enn tre elementer");
        }

        // Lager ett array med de tre første verdiene i tabell a
        int[] startTall = new int[3];

        // Fyller arrayet, startTall, med de tre første tallene
        System.arraycopy(a, 0, startTall, 0, 3);
        
        // Oppretter et array som inneholder posisjonen til mins, nest minst og
        // tredje minste verdi i tabell, startTall
        // Posisjonene blir funnet funnet ved å kalle indekssortering-Metoden
        int[] indeksSortert = indekssortering(startTall);

        // Oppretter hjelpevariabler som inneholder riktig verdi for minst, nest og tredje minste verdi
        int minstVerdi = startTall[indeksSortert[0]];
        int nestMinstVerdi = startTall[indeksSortert[1]];
        int tredjeMinstVerdi = startTall[indeksSortert[2]];

        // Oppretter hjelpevariabler som lagrer riktig posisjon til minst, nest og tredje minste verdi
        int m = indeksSortert[0];
        int nm = indeksSortert[1];
        int tm = indeksSortert[2];

        // for-løkke sjekker om det noen av verdiene i arrayet er mindre
        // For løkke starter på 3 siden de tidligere posisjonene allerede er sjekket
        for (int i = 3; i < a.length; i++){
            // Sjekker om verdien a[i] er mindre enn tredjeminst, nestminst eller minste verdi
            if (a[i] < tredjeMinstVerdi){
                if (a[i] < nestMinstVerdi){
                    if (a[i] < minstVerdi){
                        tredjeMinstVerdi = nestMinstVerdi;  //ny tredje minst
                        nestMinstVerdi = minstVerdi;        //ny nest minst
                        minstVerdi = a[i];                  //ny minste
                        tm = nm;
                        nm = m;
                        m = i;
                    }
                    else{
                        tredjeMinstVerdi = nestMinstVerdi;  //ny tredje minst
                        nestMinstVerdi = a[i];              //ny nest minst
                        tm = nm;
                        nm = i;
                    }
                }
                else {
                    tredjeMinstVerdi = a[i];    //ny tredje minst
                    tm = i;
                }
            }
        }

        //Returnerer en tabell med indeksen til de tre minste verdiene i tabell a
        return new int[]{m,nm,tm};
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static boolean inneholdt(String a, String b){
        //throw new UnsupportedOperationException();

        char[] c = a.toCharArray();    // Lager en ny tabell for så å inserte bokstavene i String a
        char[] d = b.toCharArray();    // Lager en ny tabell for så å inserte bokstavene i String b

        //Sjekker om String a er lengere enn String b
        if (c.length > d.length){
            return false; //Returnerer false
        }

        //Lager nye hjelpetabeller med lengden 256
        int[] A = new int[256], B = new int[256];

        //Kjører en for-løkke for hver bokstav i String a som allerede er satt inn i tabellen char[] c.
        for (char e : c){
            A[e]++;     // Teller opp bokstavene fra String a
        }

        //Kjører en for-løkke for hver bokstav i String b som allerede er satt inn i tabellen char[] d.
        for (char e : d){
            B[e]++;     // Teller opp bokstavene fra String b
        }

        //Kjører en for-løkke for "i" opp til-og-med 255
        for (int i = 0; i < 256; i++){
            if (A[i] > B[i]){ //Hvis antall i int[] A er høyere enn antall i int[] B
                return false;  //Returnerer false
            }
        }

        return true; //Returnerer true
    }


}  // Oblig1
