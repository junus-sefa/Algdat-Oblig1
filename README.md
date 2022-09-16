[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-f059dc9a6f8d3a56e377f745f24479a46679e63a5d9fe6f495e02850cd0d8118.svg)](https://classroom.github.com/online_ide?assignment_repo_id=446705&assignment_repo_type=GroupAssignmentRepo)
# Obligatorisk oppgave 1 i Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastrukturer. 
Oppgaven er levert av følgende studenter:
* Junus Sefa, S344055, s344055@oslomet.no
* Meron Kidane, S354594, s354594@oslomet.no
* Louis Shrestha, s354384, s354384@oslomet.no
* Jon Presthus, s350188 s350188@oslomet.no
* Abdulahi Mohammad Farah, s333746, s333746@oslomet.no

# Arbeidsfordeling

I oppgaven har vi hatt følgende arbeidsfordeling:
* Jon har hatt hovedansvar for oppgave 1, 2 og prøvde 4.
* Sefa har hatt hovedansvar for oppgave 5, 6 og 10.
* Louis har hatt hovedansvar for oppgave 3, 4 og 9.
* Meron har hatt hovedansvar for oppg  7, 8 og sammarbeidet på oppgave 4 med Louis. 
* Abdulahi har samarbeidet med Sefa på oppgave 10, og prøvde oppgave 8.

# Oppgavebeskrivelse
<h3>Oppgave 1</h3>
I oppgave 1 ble det brukt en for løkke til å sammenlikne og bytte plass til tallet med største verdi.
I tilfelle tabellen er tom blir det kastet en noSuchElementExepotion. Når sammenlikningene er ferdige blir det returnert
det største tallet.

For å telle ombyttingene ble det lagt til en ny variabel som teller antall ombyttinger som skjer i for loopen.
og  istendenfor største verdi blir tellingen returnert.

<h3>Oppgave 2</h3>

For å telle antall unike tall i oppgave 3 må vi først sjekke om lengden på arrayet er mindre enn 1. hvis det er tilfellet returneres 0.
Deretter instansieres count variablen.
I for loopen sjekkes det om neste verdi er mindre en forrige verdi. Hvis det er tilfelle kastes en exeption
Det sjekkes også om neste tall er større en forrige tall.
hvis det er sant øker count med 1.
Til slutt returneres count

<h3>Oppgave 3</h3>

For å finne antall forskjellige verdier i tabell a, sjekkes det først om tabell a er tom eller om a har lengde 1. Hvis a er tom returneres 0 og hvis
tabellen har lengde 1, kan det kun være én verdi. Hvis dette ikke er tilfellet for tabellen, må a inneholde minst
én ulik verdi. Vi oppretter en variabel som teller antall ulike og setter den lik 1. Deretter tester en  for-løkke om nåværende verdi til a, er 
lik en av de tidligere verdiene. Hvis ikke,
så økes antall ulike med 1.

<h3>Oppgave 4</h3>
For å sortere tabellen i oddetall og partall, bruker vi en while-løkke, og
to pekere left og right. Left settes lik 0, og right settes lik siste indeks i arrayet.
I while-løkken starter vi fra indeks 0 (left) i tabellen og går mot høyre helt til
et partall er funnet. Hvis det blir funnet et partall, går tabellen fra 
siste indeks (right) i tabellen og mot venstre i forsøk om å finne et oddetall.
Hvis det blir funnet et oddetall, bytter vi plass på verdiene. Vi lager en rekursiv metode,
quicksort som kaller en metode, partisjon. Partisjons-metoden sorterer tallene ut i fra
en skilleverdi. Quicksort tar imot tabell a, en start verdi og en slutt verdi. Quicksort vil
fortsette å kalle partisjons metoden helt til sluttverdien er mindre enn startverdien.

<h3>Oppgave 5</h3>
For å rotere elementene i tabellen i oppgave 5 brukte vi en "for-løkke" som bytter indeksen
til hver variabel i arrayet med +1, til høyre, og hvor siste variabel i tabellen blir satt først i arrayet.
I tillegg gjorde vi det slik at om arrayet er tomt eller med kun
en variabel, vil IKKE dette slå ut en feilkode, men rotasjonen vil da ikke endre noe.
<br><b>**Testen for oppgave 5 er kjørt opp mot flere ganger, og den <u>slår ikke ut</u> noen feilmeldinger.</b>

<h3>Oppgave 6</h3>
I denne oppgaven skulle det være mulig å rotere variablene både fremover og bakover. Derfor var det nødvendig å lage en hjelpetabell underveis i scriptet, for å tilrettelegge for de ulike typer rotasjoner. Vi bruker igjen en for-løkke for å rotere variablene i arrayet, og i tillegg tok vi i bruk "Arrays.copyOfRange" for å kopiere det angitte område av (array a) inn i den nye (hjelpetabellen b).
Samt gjorde vi det slik at om arrayet er tomt, eller med kun en variabel, vil IKKE dette slå ut en feilkode, men rotasjonen vil da ikke endre noe. Vi ble fornøyd med hvor effektiv metoden ble.
<br><b>**Testen for oppgave 6 er kjørt opp mot flere ganger, og den <u>slår ikke ut</u> noen feilmeldinger.</b>

<h3>Oppgave 7</h3>
I oppgave 7a skal det flette sammen tegnstrengene s og t, slik at resultat blir en tegnstreng der annehvert tegn kommer fra s og fra t. men dersom s og t har ulike lengde, blir lagt inn bakerst og her skal ikke kaste untakk for tomme tegnstrengene. tilslutt returneres resultatet.

men i oppgaven 7 b skal hentes fra første rekka av hver tegnstrengene, fortseter det andre rekka av hver tegnstregene, og forttter slik til det blir tom tabell og returnerer resultatet tilslutt. 
<h3>Oppgave 8</h3>
I oppgave 8 skulle sortere en tabell med indekser til verdien i tabellen a der ikke skal endres. 
Derfor har vi ikke endret arrayet og brukte arr istedet. først brukte vi insertion sort for å sortere arra arrayet, slik 
at den nåverande tallet bytter plass, hvis det finnes mindre tall og tallet bak blir verdien til indeks foran seg også bryter whil loopen, 
da blir tallet foran blir verdien til indeks bak seg og forsetter slik. Deretter sammenligner de arrayet og lager deres indeks og tilslutt returerer indeks. 
<h3>Oppgave 9</h3>
Oppgave 9 er løst ved å bruke tre hjelpe variabler for tredje minst,
nest minst og minste verdi, og tre hjelpevariabler for de tre indeks posisjonene.
For at variablene skal inneholde korrekt start verdi, kalles en funksjon,
indekssortering. Deretter trengs det en løkke som skal gå i gjennom hvert enkelt
tall fra og med indeks 3. Det testes om verdien til nåværende indeks av tabell a, er
mindre enn tredje minst, nest minst eller minste verdi. Hvis dette er tilfelle, oppdateres
verdiene og indeksen.

<h3>Oppgave 10</h3>
Denne oppgaven var en del mer omfattende enn de andre oppgavene. Vi måtte først omgjøre de to 
Stringene a & b til array's. For å lettere kunne dele opp og analysere hver bokstav i Stringene. Deretter passet vi på at String a ikke var noe lengere enn String b, isåfall skulle scriptet returnere en false, for oppgaven sier at String a ikke kan være større enn String b for String a skal være inneholdt i String b.<br>
Deretter lagde vi to hjelpetabeller A og B, hvor hver inneholdt en størrelse på 256. Så lagde vi to for-løkker for å telle opp antall bokstaver fra de to ulike Stringene inn i deres hjelpetabeller A og B.
Deretter satte vi inn en kode for å sjekke om størrelsen på Array A er høyere enn Array B, isåfall hadde det ikke vært mulig at String a er innholdt i String b, og derfor skal scriptet returnere en false.
<br><b>**Testen for oppgave 10 er kjørt opp mot flere ganger, og den <u>slår ikke ut</u> noen feilmeldinger.</b>
