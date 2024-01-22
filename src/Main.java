public class Main {
    public static void main(String[] args) {
        checkAndOperate(1, 3);
        checkAndOperate(0, 6);
        checkAndOperate(3, 5);
    }

    // Функция для проверки и выполнения операции над переменными a и b
    public static void checkAndOperate(int a, int b) {
        if (a <= 1 && b >= 3) {
            System.out.println("Сумма переменных: " + (a + b));
        } else {
            System.out.println("Разность переменных: " + (a - b));
        }
    }
}