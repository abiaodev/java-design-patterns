package com.biao.strategy;

/**
 * 策略模式
 */
class App {
    public static void main(String[] arg) {
        StrategyProvider strategyProvider = new StrategyProvider(new StrategyOne());
        strategyProvider.runStrategy("add");
        strategyProvider.changeStrategy(new StrategyTwo());
        strategyProvider.runStrategy("add");
    }
}
