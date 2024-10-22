package TextSummer3;

import java.math.BigDecimal;

public class Stock {
    private String ticker;
    private String name;
    private MarketBrand market;
    private BigDecimal sharesIssued;

    public Stock(String ticker, String name, MarketBrand market, BigDecimal sharesIssued) {
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

    public MarketBrand getMarket() {
        return market;
    }

    public void setMarket(MarketBrand market) {
        this.market = market;
    }

    public BigDecimal getSharesIssued() {
        return sharesIssued;
    }

    public void setSharesIssued(BigDecimal sharesIssued) {
        this.sharesIssued = sharesIssued;
    }
}
