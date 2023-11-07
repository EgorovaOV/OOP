package lesson7;

//Composite (Компоновщик) - использует один класс для представления древовидной структуры
//Класс ComplexNumber представляет комплексное число
// и содержит методы для выполнения операций сложения, умножения и деления.

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return "real=" + real + ", imaginary=" + imaginary                 ;
    }

    // Геттеры и сеттеры для real и imaginary
}


