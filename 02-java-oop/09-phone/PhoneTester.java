public class PhoneTester {
    public static void main(String[] args){
        Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Ring Ring Ring!");
        IPhone iphoneTen = new IPhone("X", 100, "AT&T", "Zing");

        s9.displayInfo();
        System.out.print(s9.ring());
        System.out.print(s9.unlock());

        iphoneTen.displayInfo();
        System.out.print(iphoneTen.ring());
        System.out.print(iphoneTen.unlock());
    }
}
