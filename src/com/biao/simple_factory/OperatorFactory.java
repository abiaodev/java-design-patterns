package com.biao.simple_factory;

class OperatorFactory {
    public static final String OPERATOR_ONE = "_OPERATOR_ONE_";
    public static final String OPERATOR_TWO = "_OPERATOR_TWO_";

    public static Operator createOperator(String operator) {
        switch (operator) {
            case OPERATOR_ONE:
                return new OperatorOne();
            case OPERATOR_TWO:
                return new OperatorTwo();
            default:
                return null;
        }
    }
}
