class OperatorExample {
    public static void main(String[] args) {
        int i1 = 1;
        switch (i1) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println(3);
                break;
        }

        byte i2 = 0;
        switch (i2) {
            case 1:
                System.out.println("correct byte");
                break;
            default:
                System.out.println("incorrect byte");
                break;
        }

        short i3 = 1;
        switch (i3) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println(3);
                break;
        }

        char i4 = 'a';
        switch (i4) {
            case 'a':
                System.out.println('b');
                break;
            default:
                System.out.println('?');
                break;
        }

        enum num {
            one, two
        }
        ;
        num i5 = num.one;
        switch (i5) {
            case num.one:
                System.out.println(1);
                break;
            case num.two:
                System.out.println(2);
                break;
            default:
                System.out.println(3);
                break;
        }

        String i6 = "hello";
        switch (i6) {
            case "hello":
                System.out.println("hi");
                break;
            default:
                System.out.println("?");
                break;
        }
    }
}