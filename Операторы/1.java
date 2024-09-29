class OperatorsExamples {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 0, d = 3, e = -1024; // Присваивание
        Boolean trueVal = true, falseVal = false;
        String s1 = "hello", s2 = " world";

        a += b; // a = a + b = 1 + 2 = 3
        a -= b; // a = a - b = 3 - 2 = 1
        a *= b; // a = a * b = 1 * 2 = 2
        a /= b; // a = a / b = 2 / 2 = 1
        a %= b; // a = a % b = 1 % 2 = 1

        s1 += s2; // s1 = s1 + s2 = "hello world"

        System.out.println(a > b ? "a больше b" : "a меньше b"); // a меньше b

        System.out.println(trueVal || falseVal); // true

        System.out.println(trueVal && falseVal); // false

        System.out.println(a | b); // 01 | 10 = 11 (= 3 in dec)

        System.out.println(a ^ d); // 01 xor 11 = 10 (= 2 in dec)

        System.out.println(a & b); // 01 & 10 = 0

        System.out.println(a == b); // false

        System.out.println(a > b); // false
        System.out.println(a >= b); // false
        System.out.println(a < b); // true
        System.out.println(a <= b); // true

        System.out.println(d >> 1); // 3 >> 1 = 11 >> 1 = 1
        System.out.println(e >>> 1); // -1024 >>> 1 = 11111111111111111111110000000000 >>> 1 =
                                     // 01111111111111111111111000000000 (= 2147483136 in dec)
        System.out.println(a << 1); // 1 << 1 = 1 << 1 = 10 (= 2 in dec)

        System.out.println(a + b); // 1 + 2 = 3
        System.out.println(a - b); // 1 - 2 = -1
        System.out.println(a * b); // 1 * 2 = 2
        System.out.println(a / b); // 1 / 2 = 0
        System.out.println(a % b); // 1 % 2 = 1

        System.out.println(a++); // 1 (но теперь a = 2)
        a = 1;
        System.out.println(++a); // 2
        a = 1;
        System.out.println(a--); // 1 (но теперь a = 0)
        a = 1;
        System.out.println(--a); // 0
        a = 1;

        System.out.println(!trueVal); // false
        System.out.println(~d); // ~00000000000000000000000000000011 = 11111111111111111111111111111100 (= -4 in
                                // dec)
        System.out.println(2 * (2 + 2)); // 2 * (2 + 2) = 2 * 4 = 8
    }
}