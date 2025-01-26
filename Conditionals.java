public class Conditionals {
    public static void main(String[] args) {
        int num =5;

        if (num > 0) {
            System.out.println("Postive number");
        } else if (num < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Other number");
        }
    }
}