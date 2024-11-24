class BaseClass {
    int field;

    BaseClass(int field) {
        this.field = field;
    }

    public void greet() {
        System.out.println("Hi, number " + this.field);
    }
}

class ChildClass extends BaseClass {
    int anotherField;

    ChildClass(int field, int anotherField) {
        super(field); // обращение к конструктору суперкласса
        this.anotherField = anotherField;

        System.out.println("your number is " + super.field); // доступ к полю суперкласса
        super.greet(); // доступ к методу суперкласса
    }
}

class Main {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass(1, 2); // your number is 1
                                               // Hi, number 1
    }
}