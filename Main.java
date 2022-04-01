package Main.java;

import javax.annotation.processing.SupportedSourceVersion;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

class Client {
    private String nume;
    private String prenume;
    private String cnp;
    private LocalDate dataImprumutarii_Returului;
    private Carte carteImprumutata_Returnata;

    // Getters and Setters

    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getCnp() {
        return cnp;
    }
    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public LocalDate getDataImprumutarii_Returului() {
        return dataImprumutarii_Returului;
    }
    public void setDataImprumutarii_Returului(LocalDate dataImprumutarii_Returului) {
        this.dataImprumutarii_Returului = dataImprumutarii_Returului;
    }

    public Carte getCarteImprumutata_Returnata() {return carteImprumutata_Returnata;}
    public void setCarteImprumutata_Returnata(Carte carteImprumutata_Returnata) {this.carteImprumutata_Returnata = carteImprumutata_Returnata;}

    Client(String nume, String prenume, String cnp, Carte carteImprumutata_Returnata){
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.dataImprumutarii_Returului = LocalDate.now();
        this.carteImprumutata_Returnata = carteImprumutata_Returnata;
    }
}


class Autor {
    private String nume;
    private String prenume;
    private String dataNasterii;
    private String dataDecesului;

    // Getters and Setters

    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getDataNasterii() {
        return dataNasterii;
    }
    public void setDataNasterii(String dataNasterii) {
        this.dataNasterii = dataNasterii;
    }

    public String getDataDecesului() {
        return dataDecesului;
    }
    public void setDataDecesului(String dataDecesului) {
        this.dataDecesului = dataDecesului;
    }

    Autor(String nume, String prenume, String dataNasterii, String dataDecesului){
        this.nume = nume;
        this.prenume = prenume;
        this.dataNasterii = dataNasterii;
        this.dataDecesului = dataDecesului;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", dataNasterii='" + dataNasterii + '\'' +
                ", dataDecesului='" + dataDecesului + '\'' +
                '}';
    }

}


class Carte {
    private String nume;
    static int NR_EXEMPLARE = 10;
    Autor a;

    // Getters and Setters

    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }

    public static int getNrExemplare() {return NR_EXEMPLARE;}
    public static void setNrExemplare(int nrExemplare) {NR_EXEMPLARE = nrExemplare;}

    public Autor getA() {
        return a;
    }
    public void setA(Autor a) {
        this.a = a;
    }

    Carte(String nume, Autor a){
        this.nume = nume;
        this.a = a;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "nume='" + nume + '\'' +
                ", a=" + a +
                '}';
    }
}

class Sectiune {
    private String nume;
    private Carte[] carti;

    // Getters and Setters

    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }

    public Carte[] getCarti() {
        return carti;
    }
    public void setCarti(Carte[] carti) {
        this.carti = carti;
    }

    Sectiune(String nume, Carte[] carti){
        this.nume = nume;
        this.carti = carti;
    }

    @Override
    public String toString() {
        return "Sectiune{" +
                "nume='" + nume + '\'' +
                ", carti=" + Arrays.toString(carti) +
                '}';
    }
}

class Angajat {
    private String nume;
    private String prenume;
    public static final int SALARIU_BAZA = 2000;

    // Getters and Setters

    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getSalariu(){
        return this.SALARIU_BAZA;
    }

    Angajat(String nume, String prenume){
        this.nume = nume;
        this.prenume = prenume;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", salariu=" + SALARIU_BAZA +
                '}';
    }
}

class Bodyguard extends Angajat{
    private String firmaSecuritate;

    Bodyguard(String nume, String prenume, String firmaSecuritate) {
        super(nume, prenume);
        this.firmaSecuritate = firmaSecuritate;
    }

    public int getSalariu() {
        return this.SALARIU_BAZA + 1500;
    }

    // Getters and Setters

    public String getFirmaSecuritate() {
        return firmaSecuritate;
    }
    public void setFirmaSecuritate(String firmaSecuritate) {
        this.firmaSecuritate = firmaSecuritate;
    }

    @Override
    public String toString() {
        return "Bodyguard" + "\n" +
                "firmaSecuritate: " + firmaSecuritate;
    }
}

class Bibliotecar extends Angajat{
    // grad = I/II/III/debutant
    private String grad;

    Bibliotecar(String nume, String prenume, String grad) {
        super(nume, prenume);
        this.grad = grad;
    }

    public int getSalariu() {
        return this.SALARIU_BAZA + 2000;
    }

    // Getters and Setters

    public String getGrad() {
        return grad;
    }
    public void setGrad(String grad) {
        this.grad = grad;
    }

    @Override
    public String toString() {
        return "Bibliotecar" + "\n" +
                "grad: " + grad;
    }
}

interface Interfata{
    void vizualizareAng(Angajat[] ang);

    Angajat[] adaugaAng(Angajat[] ang, Angajat a);

    Angajat[] citireDateAngajatNou(Scanner scanner, Angajat[] ang, ClasaServiciu cs);

    Angajat[] eliminaAng(Angajat[] ang, int idx);

    void vizualizareListe(Client[] clImpr, Client[] clRetur);

    void vizualizeazaAut(Autor[] aut);

    void vizualizeazaCar(Carte[] c);

    void vizualizeazaSect(Sectiune[] s);

    void vizualizeazaCarDupaAut(String nume, Carte[] c);

    void vizualizeazaCarDupaSec(String nume, Sectiune[] s);

    Client[] citireDateClientImpr(Scanner scanner, ClasaServiciu cs, Client[] clImpr, Carte[] c);

    Client[] citireDateClientRetur(Scanner scanner, ClasaServiciu cs, Client[] clRetur, Client[] clImpr, Carte[] c);

    boolean verificaNume(String numeCarte, Carte[] c);

    boolean verificaDisponibilitate(String numeCarte, Carte[] c);

    Carte gasesteCarte(String numeCarte, Carte[] c);

    Client[] adaugaClient(Client[] clArray, Client cl);

    boolean  verificaDate(Client[] clImpr, String cnp, String numeCarte);

}

class ClasaServiciu implements Interfata{

    public void vizualizareAng(Angajat[] ang){
        int idx = 0;
        for(int i=0; i<ang.length; i++) {
            idx = i+1;
            System.out.print(idx + ". " + ang[i].getNume() + " ");
            System.out.println(ang[i].getPrenume());
            int sal = ang[i].getSalariu();
            System.out.println("Salariu: " + sal);
            System.out.println(ang[i].toString());
        }
    }

    public Angajat[] citireDateAngajatNou(Scanner scanner, Angajat[] ang, ClasaServiciu cs){
        System.out.println("Adauga informatiile despre noul angajat");
        System.out.println("Nume: ");
        String nume = scanner.next();
        System.out.println("Prenume: ");
        String prenume = scanner.next();
        System.out.println("Apasa 1 pentru BIBLIOTECAR / 2 pentru BODYGUARD: ");
        int i = scanner.nextInt();
        if(i==1){
            System.out.println("Grad: ");
            String grad = scanner.next();
            Bibliotecar angNou = new Bibliotecar(nume,prenume,grad);
            ang = cs.adaugaAng(ang, angNou);
        }
        else {
            System.out.println("Firma securitate: ");
            String firmaSecuritate = scanner.next();
            Bodyguard angNou = new Bodyguard(nume, prenume, firmaSecuritate);
            ang = cs.adaugaAng(ang, angNou);
        }
        return ang;
    }

    public Angajat[] adaugaAng(Angajat[] ang, Angajat a){
        ang = Arrays.copyOf(ang, ang.length + 1);
        ang[ang.length - 1] = a;
        return ang;
    }

    public Angajat[] eliminaAng(Angajat[] ang, int idx){
        Angajat[] angAux = new Angajat[ang.length-1];
        int j = 0;
        for(int i=0; i< ang.length; i++){
            if(i != idx-1) angAux[j++] = ang[i];
        }
        return angAux;
    }

    public void vizualizareListe(Client[] clImpr, Client[] clRetur){
        System.out.println("Lista clientilor care au imprumutat carti: ");
        int idx1 = 0;
        for(int i=0; i<clImpr.length; i++){
            idx1++;
            System.out.println(idx1 + ". " + clImpr[i].getNume() + " " + clImpr[i].getPrenume());
            System.out.println("CNP: " + clImpr[i].getCnp());
            Carte cAux = clImpr[i].getCarteImprumutata_Returnata();
            System.out.println("Carte imprumutata:" + cAux.getNume());
            System.out.println("Data imprumutarii: " + clImpr[i].getDataImprumutarii_Returului());
            System.out.println();
        }
        System.out.println("Lista clientilor care au returnat carti: ");
        int idx2 = 0;
        for(int i=0; i<clRetur.length; i++){
            idx2++;
            System.out.println(idx2 + ". " + clRetur[i].getNume() + " " + clRetur[i].getPrenume());
            System.out.println("CNP: " + clRetur[i].getCnp());
            Carte cAux = clRetur[i].getCarteImprumutata_Returnata();
            System.out.println("Carte returnata:" + cAux.getNume());
            System.out.println("Data returului: " + clRetur[i].getDataImprumutarii_Returului());
            System.out.println();
        }
    }

    public void vizualizeazaAut(Autor[] aut){
        int idx = 0;
        for(int i=0; i<aut.length; i++) {
            idx = i+1;
            System.out.print(idx + ". " + aut[i].getPrenume() + " ");
            System.out.println(aut[i].getNume());
            System.out.println("Data nasterii: " + aut[i].getDataNasterii());
            System.out.println("Data decesului: " + aut[i].getDataDecesului());
        }
    }

    public void vizualizeazaCar(Carte[] c){
        int idx = 0;
        for(int i=0; i<c.length; i++) {
            idx = i+1;
            System.out.print(idx + ". " + c[i].getNume() + " de ");
            Autor autorAux = c[i].getA();
            System.out.println(autorAux.getPrenume() + " " + autorAux.getNume());
        }
    }

    public void vizualizeazaSect(Sectiune[] s){
        int idx = 0;
        for(int i=0; i<s.length; i++) {
            idx = i+1;
            System.out.println(idx + ". " + s[i].getNume());
        }
    }

    public void vizualizeazaCarDupaAut(String nume, Carte[] c){
        int idx = 0;
        int contor = 0;
        for(int i=0; i<c.length; i++){
            Autor autAux = c[i].getA();
            if(nume.equals(autAux.getNume())){
                idx++;
                System.out.println(idx + ". " + c[i].getNume());
                contor++;
            }
        }
        if(contor==0) System.out.println("Nu a fost gasit niciun rezultat pentru numele introdus");
    }

    public void vizualizeazaCarDupaSec(String nume, Sectiune[] s){
        int idx = 0;
        int contor = 0;
        for(int i=0; i<s.length; i++){
            if(nume.equals(s[i].getNume())){
                Carte[] cAux = s[i].getCarti();
                for(int j=0; j<cAux.length; j++){
                    idx++;
                    System.out.println(idx + ". " + cAux[j].getNume());
                }
                contor=1;
            }
        }
        if(contor==0) System.out.println("Nu a fost gasit niciun rezultat pentru numele introdus");
    }

    public Client[] citireDateClientImpr(Scanner scanner, ClasaServiciu cs, Client[] clImpr, Carte[] c){
        System.out.println("Introduceti datele personale: ");
        System.out.println("Nume: ");
        String nume = scanner.next();
        System.out.println("Prenume: ");
        String prenume = scanner.next();
        System.out.println("CNP: ");
        String cnp = scanner.next();
        LocalDate dataImprumutarii = LocalDate.now();
        System.out.println("Numele cartii: ");
        String numeCarte= scanner.nextLine();
        numeCarte+=scanner.nextLine();
        boolean verificareNume = cs.verificaNume(numeCarte, c);
        if(verificareNume) {
            boolean disponibila = cs.verificaDisponibilitate(numeCarte, c);
            if (disponibila) {
                Carte carteImprumutata = cs.gasesteCarte(numeCarte, c);
                Client cl = new Client(nume, prenume, cnp, carteImprumutata);
                int nr = carteImprumutata.getNrExemplare();
                nr--;
                carteImprumutata.setNrExemplare(nr);
                clImpr = cs.adaugaClient(clImpr, cl);
            } else System.out.println("Carte indisponibila");
        }
        else System.out.println("Nume invalid");
        return clImpr;
    }

    public Client[] citireDateClientRetur(Scanner scanner, ClasaServiciu cs, Client[] clRetur, Client[] clImpr, Carte[] c){
        System.out.println("Introduceti datele personale: ");
        System.out.println("Nume: ");
        String nume = scanner.next();
        System.out.println("Prenume: ");
        String prenume = scanner.next();
        System.out.println("CNP: ");
        String cnp = scanner.next();
        System.out.println("Numele cartii: ");
        String numeCarte= scanner.nextLine();
        numeCarte+=scanner.nextLine();
        boolean verificareNume = cs.verificaNume(numeCarte, c);
        if(verificareNume) {
            boolean verificareDate = cs.verificaDate(clImpr, cnp, numeCarte);
            if(verificareDate) {
                Carte carteReturnata = cs.gasesteCarte(numeCarte, c);
                Client cl = new Client(nume, prenume, cnp, carteReturnata);
                int nr = carteReturnata.getNrExemplare();
                nr++;
                carteReturnata.setNrExemplare(nr);
                clRetur = cs.adaugaClient(clRetur, cl);
            }
            else System.out.println("Nu exista in istoric imprumutarea cartii " + numeCarte + " facuta de catre clientul cu cnp-ul: " + cnp);
        }
        else System.out.println("Nume invalid");
        return clRetur;
    }

    public boolean verificaNume(String numeCarte, Carte[] c){
        for(int i=0; i<c.length; i++){
            if(numeCarte.equals(c[i].getNume())) return true;
        }
        return false;
    }

    public boolean verificaDisponibilitate(String numeCarte, Carte[] c){
        for(int i=0; i<c.length; i++){
            if(numeCarte.equals(c[i].getNume())){
                if(c[i].getNrExemplare()>0) return true;
            }
        }
        return false;
    }

    public  Carte gasesteCarte(String numeCarte, Carte[] c){
        for(int i=0; i<c.length; i++){
            if(numeCarte.equals(c[i].getNume())){
                Carte cAux = c[i];
                return cAux;
            }
        }
        Carte cAux2 = c[0];
        return c[0];
    }

    public Client[] adaugaClient(Client[] clArray, Client cl){
        clArray = Arrays.copyOf(clArray, clArray.length + 1);
        clArray[clArray.length - 1] = cl;
        return clArray;
    }

    public boolean  verificaDate(Client[] clImpr, String cnp, String numeCarte){
        for(int i=0; i< clImpr.length; i++){
            Carte caux = clImpr[i].getCarteImprumutata_Returnata();
            if(cnp.equals(clImpr[i].getCnp()) && numeCarte.equals(caux.getNume())) return true;
        }
        return false;
    }

}

public class Main {

    public static void main(String[] args) {
        Bibliotecar a1 = new Bibliotecar("Popescu", "Alexandru", "II");
        Bodyguard a2 = new Bodyguard("Vasilescu", "Robert", "BGS");
        Angajat[] ang = {a1,a2};

        Autor aut1 = new Autor("Rebreanu", "Liviu", "27-nov-1885", "1-sep-1944");
        Autor aut2 = new Autor("Dickens", "Charles", "7-feb-1812", "9-jun-1870");
        Autor aut3 = new Autor("Caragiale", "Ion Luca", "13-feb-1852", "9-jun-1912");
        Autor aut4 = new Autor("Shakespeare", "William", "26-apr-1564", "23-apr-1616");
        Autor[] aut = {aut1, aut2, aut3, aut4};

        Carte c1 = new Carte("Ion", aut1);
        Carte c2 = new Carte("Padurea Spanzuratilor", aut1);
        Carte c3 = new Carte("Amandoi", aut1);
        Carte c4 = new Carte("Marile Sperante", aut2);
        Carte c5 = new Carte("Colind de craciun", aut2);
        Carte c6 = new Carte("David Copperfield", aut2);
        Carte c7 = new Carte("O noapte furtunoasa", aut3);
        Carte c8 = new Carte("Napasta", aut3);
        Carte c9 = new Carte("O faclie de Paste", aut3);
        Carte c10 = new Carte("Imblanzirea scorpiei", aut4);
        Carte c11 = new Carte("Visul unei nopti de vara", aut4);
        Carte c12 = new Carte("Romeo si Julieta", aut4);
        Carte[] c = {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12};

        Carte[] carti1 = {c5,c6,c9};
        Carte[] carti2 = {c7,c10,c11};
        Carte[] carti3 = {c8,c12};
        Carte[] carti4 = {c4,c1,c2,c3};
        Sectiune s1 = new Sectiune("Nuvela", carti1);
        Sectiune s2 = new Sectiune("Comedie", carti2);
        Sectiune s3 = new Sectiune("Drama", carti3);
        Sectiune s4 = new Sectiune("Roman", carti4);
        Sectiune[] s = {s1,s2,s3,s4};

        Client[] clImpr = {};
        Client[] clRetur = {};

        ClasaServiciu cs = new ClasaServiciu();

        Scanner scanner;
        scanner = new Scanner(System.in);

        int com;
        int ok=1;

        while(ok==1){
            System.out.println("Apasa 1 pentru ADMINISTRATOR");
            System.out.println("Apasa 2 pentru CLIENT");
            System.out.println("Apasa 10 pentru EXIT");
            com = scanner.nextInt();

            switch(com){
                case 1:{
                    int ok1=1;
                    int com1;
                    while(ok1==1){
                        System.out.println("Apasa 1 pentru VIZUALIZARE ANGAJATI");
                        System.out.println("Apasa 2 pentru ADAUGARE ANGAJAT");
                        System.out.println("Apasa 3 pentru CONCEDIERE ANGAJAT");
                        System.out.println("Apasa 4 pentru VIZUALIZARE LISTA CARTI IMPRUMUTATE/RETURNATE");
                        System.out.println("Apasa 10 pentru LOG OUT ADMINISTRATOR");
                        com1 = scanner.nextInt();
                        switch(com1){
                            case 1:{
                                cs.vizualizareAng(ang);
                                break;
                            }
                            case 2:{
                                ang = cs.citireDateAngajatNou(scanner, ang, cs);
                                break;
                            }
                            case 3:{
                                int l = ang.length;
                                System.out.println("Alege un index intre 1 si " + l + " pentru a concedia angajatul cu indexul respectiv");
                                int idx = scanner.nextInt();
                                ang = cs.eliminaAng(ang, idx);
                                break;
                            }
                            case 4:{
                                cs.vizualizareListe(clImpr, clRetur);
                                break;
                            }
                            case 10:{
                                ok1=0;
                                break;
                            }
                            default:{
                                System.out.println("COMANDA INCORECTA");
                                break;
                            }
                        }
                    }
                    break;
                }
                case 2:{
                    int ok2=1;
                    int com2;
                    while(ok2==1){
                        System.out.println("Apasa 1 pentru VIZUALIZARE CARTI");
                        System.out.println("Apasa 2 pentru VIZUALIZARE AUTORI");
                        System.out.println("Apasa 3 pentru VIZUALIZARE SECTIUNI");
                        System.out.println("Apasa 4 pentru VIZUALIZARE CARTI DUPA AUTOR");
                        System.out.println("Apasa 5 pentru VIZUALIZARE CARTI DUPA SECTIUNE");
                        System.out.println("Apasa 6 pentru IMPRUMUTARE CARTE");
                        System.out.println("Apasa 7 pentru RETURNARE CARTE");
                        System.out.println("Apasa 10 pentru LOG OUT CLIENT");
                        com2 = scanner.nextInt();
                        switch(com2){
                            case 1:{
                                cs.vizualizeazaCar(c);
                                break;
                            }
                            case 2:{
                                cs.vizualizeazaAut(aut);
                                break;
                            }
                            case 3:{
                                cs.vizualizeazaSect(s);
                                break;
                            }
                            case 4:{
                                System.out.println("Introduceti numele autorului: ");
                                String nume = scanner.next();
                                cs.vizualizeazaCarDupaAut(nume,c);
                                break;
                            }
                            case 5:{
                                System.out.println("Introduceti numele sectiunii: ");
                                String nume = scanner.next();
                                cs.vizualizeazaCarDupaSec(nume,s);
                                break;
                            }
                            case 6:{
                                clImpr = cs.citireDateClientImpr(scanner, cs, clImpr, c);
                                break;
                            }
                            case 7:{
                                clRetur = cs.citireDateClientRetur(scanner, cs, clRetur, clImpr, c);
                                break;
                            }
                            case 10:{
                                ok2=0;
                                break;
                            }
                            default:{
                                System.out.println("COMANDA INCORECTA");
                                break;
                            }
                        }
                    }
                    break;
                }
                case 10:{
                    ok=0;
                    break;
                }
                default:{
                    System.out.println("COMANDA INCORECTA");
                    break;
                }

            }
        }
    }
}
