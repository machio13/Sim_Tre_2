package TextSummer_4;

import java.math.BigDecimal;

public class Stock {
    private String ticker;
    private String name;
    private MarketCollect market;
    private BigDecimal sharesIssued;

    public Stock(String ticker, String name, MarketCollect market, BigDecimal sharesIssued) {
        this.ticker = ticker;
        this.name = name;
        this.market = market;
        this.sharesIssued = sharesIssued;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MarketCollect getMarket() {
        return market;
    }

    public void setMarket(MarketCollect market) {
        this.market = market;
    }

    public BigDecimal getSharesIssued() {
        return sharesIssued;
    }

    public void setSharesIssued(BigDecimal sharesIssued) {
        this.sharesIssued = sharesIssued;
    }
}
