enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekend() {
        return this.ordinal() > 4;
    }
}

class Main {
    public static void main(String[] args) {
        Day day = Day.SUNDAY;
        System.out.println(day.isWeekend()); // true
    }
}