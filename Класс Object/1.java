class EqualsExampleClass {
    public int field;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        EqualsExampleClass castedObj = (EqualsExampleClass) obj;
        return (this.field == castedObj.field);
    }
}

class Main {
    public static void main(String[] args) {
        EqualsExampleClass obj = new EqualsExampleClass();
        EqualsExampleClass obj1 = new EqualsExampleClass();

        System.out.println(obj.equals(obj1));
    }
}