package behavioural.strategy.q3;

public interface TradingIndicatorStrategy {
    TradingStrategyType supportsType();

    Double calculateIndicator(Stock stock);
}
