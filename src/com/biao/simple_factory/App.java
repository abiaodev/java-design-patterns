package com.biao.simple_factory;

/**
 * 简单工厂模式
 */
class App {
    public static void main(String[] arg) {
        Operator operator;

        operator = OperatorFactory.createOperator(OperatorFactory.OPERATOR_ONE);
        operator.runOperator("add");
        operator = OperatorFactory.createOperator(OperatorFactory.OPERATOR_TWO);
        operator.runOperator("add");
    }
}
