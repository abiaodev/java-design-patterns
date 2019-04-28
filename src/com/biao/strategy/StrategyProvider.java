package com.biao.strategy;

class StrategyProvider {
    private Strategy strategy;

    public StrategyProvider(Strategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void runStrategy(String name) {
        strategy.execute(name);
    }
}
