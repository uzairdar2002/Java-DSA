package ObjectOrientedProgramming;

public class KunalKushwaha {
    public static void main(String[] args) {

        Hackers uzair = new Hackers("Uzair", "Penetration Tester", 95);

        System.out.println(uzair.name);
        System.out.println(uzair.Role);
        System.out.println(uzair.level);

    }
}

class Hackers {
    String name;
    String Role;
    int level;

    Hackers(String name, String Role, int level) {
        this.name = name;
        this.Role = Role;
        this.level = level;
    }
}
