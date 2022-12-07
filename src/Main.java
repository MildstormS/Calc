public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);

        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);

    }
}

// При выполнении int c = calc.devide.apply(a, b); выбрасывает исключение  - деление на ноль.
// Чтобы программа завершилась без ошибки можно использовать:
// 1. BinaryOperator<Integer> devide = (x, y) ->  y != 0 ? x/y : 0;
// либо
// 2. BinaryOperator<Integer> devide = (x, y) -> {
//          if (y == 0)
//                return 0;
//            else
//                return x/y;
//    };
