public class B {
    public static void main(String[] args) {
        String a = "LR";
        if (a == "lr") { //.equals - ==
            System.out.println("lr");
        } else if (a == "LR") { //.equals - ==
            System.out.println("LR");
        } else {
            System.out.println("False");
        }
    }
}