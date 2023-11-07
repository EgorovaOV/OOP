package lesson7;

public class Main {
    public static void main(String[] args) {
        // Создание комплексных чисел
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(4, 5);

        System.out.println("Первое комплексное число " + num1.toString());
        System.out.println("Второе комплексное число " + num2.toString());

        // Создание калькулятора и сервиса
        Calculator additionCalculator = new AdditionCalculator();
        CalculatorService calculatorService = new CalculatorService(additionCalculator);

        // Выполнение операции сложения
        ComplexNumber result = calculatorService.calculate(num1, num2);

        // Вывод результата
        System.out.println("Результат сложения: " + result.getReal() + " + " + result.getImaginary() + "i");


        // Создание калькулятора и сервиса для умножения
        Calculator multiplicationCalculator = new MultiplicationCalculator();
        calculatorService = new CalculatorService(multiplicationCalculator);

        // Выполнение операции умножения
        result = calculatorService.calculate(num1, num2);

        // Вывод результата
        System.out.println("Результат умножения: " + result.getReal() + " + " + result.getImaginary() + "i");

        // Создание калькулятора и сервиса для деления
        Calculator divisionCalculator = new DivisionCalculator();
        calculatorService = new CalculatorService(divisionCalculator);

        // Выполнение операции деления
        result = calculatorService.calculate(num1, num2);

        // Вывод результата
        System.out.println("Результат деления: " + result.getReal() + " + " + result.getImaginary() + "i");
    }
}

