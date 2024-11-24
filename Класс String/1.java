class StringMethods {
    public static void main(String[] args) {
        String s1 = "hello", s2 = "world";

        System.out.println(s1.concat(s2)); // слияние строк
        System.out.println(s1.equals(s2)); // сравнение строк
        System.out.println(s1.matches("h+.+")); // проверка строки на соответствие регулярному выражению
        System.out.println(s1.length()); // определение длины строки
        System.out.println(s1.indexOf('e')); // определение позиции символа в строке
        System.out.println(s1.toUpperCase()); // преобразование всех символов вызывающей строки в верхний регистр
        System.out.println(s1.toLowerCase()); // преобразование всех символов вызывающей строки в нижний регистр
        System.out.println(s1.replace('l', 'w')); // замена в строке всех вхождений первого символа вторым символом
        System.out.println(s1.isEmpty()); // возвращает true, если длина строки равна 0
        System.out.println(s1.isBlank()); // возвращает true, если строка пуста или содержит только пробельные символы
    }
}