class StringBuilderExamples {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("hello"); // добавление к содержимому объекта строкового представления аргумента
        System.out.println(builder.length()); // определение длины содержимого объекта
        System.out.println(builder.capacity()); // возвращение текущего размера буфера
        System.out.println(builder.reverse()); // обращение содержимого объекта
        builder.insert(0, "oooooo"); // вставка строки в указанную позицию
        builder.deleteCharAt(5); // удаление символа
        builder.delete(5, 7); /// удаление подстроки
        System.out.println(builder.charAt(0)); // возвращает символ по указанному индексу
        System.out.println(builder.substring(3)); // возвращает подстроку, начиная с указанного индекса
        System.out.println(builder.indexOf("ooo")); // определение позиции подстроки в строке
    }
}