package lesson7;

// Strategy (Стратегия) - алгоритм стратегии может быть изменен во время выполнения программы.
// используется для разделения алгоритма выполнения операций от классов комплексных чисел.
// Интерфейс Calculator определяет метод calculate,
// который реализуют классы AdditionCalculator, MultiplicationCalculator и DivisionCalculator.
// Класс CalculatorService использует экземпляр нужного калькулятора для выполнения операции.

public interface Calculator {
    ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2);
    }

class AdditionCalculator implements Calculator {
    @Override
    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        return num1.add(num2);
    }
}

class MultiplicationCalculator implements Calculator {
    @Override
    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        return num1.multiply(num2);
    }
}

class DivisionCalculator implements Calculator {
    @Override
    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        return num1.divide(num2);
    }
}

class CalculatorService {
    private Calculator calculator;

    public CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }

    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        return calculator.calculate(num1, num2);
    }


}

