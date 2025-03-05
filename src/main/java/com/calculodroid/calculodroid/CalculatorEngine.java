package com.calculodroid.calculodroid;

public class CalculatorEngine {
    //Atributos
    private double value; //Primeiro valor aplicado
    private double lastValue; //Segundo valor aplicado
    private double resultValue;//Resultado da aplicação
    private char operator; //Aperação aritmética selecionada

    /**
     * Método adição:
     * usa a operação adição para somar os valores.
     */
    public void addition() {
        binaryOperation('+');

    }

    /**
     * Método subtrair:
     * usa a operação de subtração para diminuir os valores.
     */
    public void subtraction() {
        binaryOperation('-');
    }

    /**
     * Método Multiplicar:
     * usa a operação de multiplicação para multiplicar os valores.
     */
    public void multiplication() {
        binaryOperation('*');
    }

    /**
     * Método Dividir:
     * usa a operação de divisão para dividir os valores.
     */
    public void division() {
        binaryOperation('/');
    }

    /**
     * Método calcular:
     * calcula com a operação selecionada com os valores digitado.
     */
    public void calculate() {
        if (this.operator == '+')
            this.resultValue = (this.resultValue + this.lastValue) + this.value;

        if (this.operator == '-')
            this.resultValue = (this.resultValue + this.lastValue) - this.value;

        if (this.operator == '*')
            this.resultValue = (this.resultValue + this.lastValue) * this.value;

        if (this.operator == '/')
            this.resultValue = (this.resultValue + this.lastValue) / this.value;

        System.out.println("value:" + this.value);
        System.out.println("lastValue:" + this.lastValue);
        System.out.println("resultValue:" + this.resultValue);
        this.lastValue =0;
    }

    /**
     * Método operators:
     * O modo de adicionar o operador antes do operando, requer que a operação
     * especificada seja armazenada para ser aplicada após a entrada do segundo
     * operando.
     * Para este propósito, definimos outra variável de instância operator, que
     * registra a ação a ser associada à próxima operação de computação.
     *
     * @param op
     */
    private void binaryOperation(char op) {
        this.lastValue = this.value;
        this.value = 0;
        if (this.resultValue != 0) {
            this.lastValue = this.resultValue;
            this.resultValue =0;
        }
        this.operator = op;
        System.out.println("value:" + this.value);
        System.out.println("lastValue:" + this.lastValue);
        System.out.println("resultValue:" + this.resultValue);
    }

    /**
     * Método digit:
     * Acumula dígitos digitados por meio do teclado numérico. Um novo dígito
     * desloca os dígitos existentes na variável de instância de valor uma casa para a
     * esquerda. Essa manipulação é realizada pela multiplicação por 10 e seguida
     * pela adição do último dígito.
     *
     * @param x
     */
    public void digit(int x) {
        this.value = this.value * 10 + x;
    }

    /**
     * Método backspace:
     *
     * @return o valor com ultimo digito apagado.
     */
    public double backSpace() {
        this.value = (this.value / 10) - (this.value / 10 - (int) this.value / 10);
        return this.value;
    }


    /**
     * Método clear:
     * Limpa os valores digitados anteriomente para o valor padrão = 0.
     */
    public void clear() {
        this.value = 0;
        this.lastValue = 0;
        this.resultValue = 0;
    }

    /**
     * Método getResultValue (inteiro):
     *
     * @return valor inteiro digitado.
     */
    public int getResultValue() {
        return (int) this.resultValue;
    }

    /**
     * Método getResultValue (real):
     *
     * @return valor real digitado.
     */
    public double getResultValueDouble() {
        return this.resultValue;
    }

    /**
     * Método Valor secundário (inteiro):
     *
     * @return último valor inteiro digitado.
     */
    public int getLastValue() {
        return (int) this.lastValue;
    }

    /**
     * Método Valor secundário (real):
     *
     * @return último valor real digitado.
     */
    public double getLastValueDouble() {
        return this.lastValue;
    }

    public int getValue() {
        return (int) this.value;
    }

    public double getValueDouble() {
        return this.value;
    }

}
