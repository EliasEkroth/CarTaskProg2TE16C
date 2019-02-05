# CarTaskProg2TE16C
Elias E, Linus O, Joel S

Laboration 1 <br>
Syftet med dessa laborationer är att ni ska lära er att använda koncept som arv, gränssnitt och overriding mer ingående. 
Ni ska även tänka på hur ni bygger upp och designar era klasser och även följa beprövade metoder.<br><br>

Allting ni gör under dessa laborationer ska ni göra i ett repository som ska finnas på GitHub. <br>
När ni skapat ett gemensamt repo maila mig länken till det så jag vet vilken av er som "äger" repot.<br>
Efter avrje deluppgift (A,B,C,D,E) SKA NI ha gjort minst en commit till ert repo.<br><br>

Uppgift A:<br>
Börja med att kopera/ladda ner följande Java-filer och kika lite i dem: Volvo740.java och Saab95.java. Just nu verkar klasserna ha ganska mycket gemensamt, eftersom båda representerar bilar.<br>
Skapa en arvshierarki där Volvo740 och Saab95 ingår som eliminerar all kod-duplicering och i görligaste mån följer open-closed-principen. Gör dessa ändringar utan att ändra på klassernas funktionalitet.<br>
I originalfilerna är alla metoder och variabler public, vilket exponerar allt till användaren. Ändra synligheten på de metoder och variabler som användaren inte behöver se eller känna till.<br>
Uppgift B:<br>
I denna uppgift fortsätter vi bygga på föregående genom att vi nu också implementerar ett interface kallat Movable.<br><br>

Skapa en fil Movable.java och ge interfacet följande metoder:<br>
void move()<br>
void turnLeft()<br>
void turnRight()<br>
Se till att era bilar implementerar interfacet Movable, med någon lämplig intern representation av deras riktning och position.<br>
Metoden move ska fungera så att beroende på riktning ökas (eller minskas) bilens x- eller y-koordinat med dess currentSpeed.<br><br>
Uppgift C:<br>
Använd Javadoc för att kommentera samtliga klasser och interfaces. Ni ska ha Javadoc för alla filer.<br>
Det ska minst finnas Javadoc för själva klassen och alla dess publika metoder plus konstruktorer.<br><br>
Uppgift D:<br>
Bilklassernas metoder har för närvarande inget sätt att kontrollera hur mycket farten kan öka eller sänkas.<br>
Skriv om metoder (och dokumentation) så att:<br><br>

gas() och break() bara accepterar värden i intervallet [0, 1],<br>
currentSpeed alltid ligger i intervallet [0, enginePower],<br>
Anrop till gas() inte kan resultera i att farten sänks.<br>
Anrop till break() inte kan resultera i att farten höjs.<br>
Lägg även till två stycken egna bilmodeller utöver Volvo740 och Saab95.<br><br>
Uppgift E:<br>
Skapa ett UML-diagram för er nuvarande design.<br>
Spara UML-diagrammet som en .html-fil i ert repo.<br>
Pusha allting till github.<br>
Extra uppgift för mer utmaning:<br>
Lägg till en enkel command line controller genom vilken ni kan skapa bilar; gasa och bromsa bilar; avgöra var bilarna befinner sig; etc.
