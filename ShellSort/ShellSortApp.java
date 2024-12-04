package ShellSort;
public class ShellSortApp {
    public static void main(String[] args) {
        ShellSort theShell = new ShellSort(10); //kapasitesi 10 olan ShellSort isimli diziyi ShellSort metodu ile cagiriyoruz
        // diziye veri eklemek icin theShell degiskenini kullaniyoruz
        theShell.insert(66); //insert ile veri ekliyoruz
        theShell.insert(64);
        theShell.insert(29);
        theShell.insert(57);
        theShell.insert(10);
        theShell.insert(61);
        theShell.insert(9);
        theShell.insert(56);
        theShell.insert(74);
        theShell.insert(63);

        System.out.print("Siralanmadan once:");
        theShell.display(); //Siralanmamis diziyi ekrana yazdirilir

        theShell.ShellSort(); //diziyi siralar

        System.out.print("Siralandiktan sonra:");
        theShell.display(); //Siralanmis diziyi ekrana yazdirilir
    } }
