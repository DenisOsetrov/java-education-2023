package homework.hw_2.part2;

// Створити та описати наступну їєрархію
//PC-Laptop-Ultrabook
//PC-Ultrabook-Workstation
//Загальна кількість вкористаних класів - 4!

public class Main {
    public static void main(String[] args) {
Workstation workstation = new Workstation(
        "Lenovo",
        "Intel",
        4,
        16,
        512,
        true,
        14,
        8000,
        "Pro",
        200,
        "2100*1200",
        4,
        true);
        System.out.println(workstation);
            // Workstation(super=Ultrabook(super=Laptop(super=PC(company=Lenovo, processor=Intel, core=4, ram=16, ssd=512, video=true), inch=14, battery=8000, model=Pro), weight=200, screenExtension=2100*1200), videoCore=4, motherboard=true)

        Ultrabook ultrabook = new Ultrabook(
                "Sony",
                "Intel",
                6,
                8,
                256,
                true,
                15,
                6000,
                "Free",
                200,
                "1200*800");
        System.out.println(ultrabook);
        // Ultrabook(super=Laptop(super=PC(company=Sony, processor=Intel, core=6, ram=8, ssd=256, video=true), inch=15, battery=6000, model=Free), weight=200, screenExtension=1200*800)
    }
}
