package Practice;

import java.math.BigDecimal;

public class Stock {
    private String ticker;
    private String name;
    private Market market;
    private BigDecimal sharedIssued;

    public Stock(String ticker, String name, Market market, BigDecimal sharedIssued) {
        this.ticker = ticker;
        this.name = name;
        this.market = market;
        this.sharedIssued = sharedIssued;
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

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public BigDecimal getSharedIssued() {
        return sharedIssued;
    }

    public void setSharedIssued(BigDecimal sharedIssued) {
        this.sharedIssued = sharedIssued;
    }
}
