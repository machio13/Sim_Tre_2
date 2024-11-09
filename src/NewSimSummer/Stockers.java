package NewSimSummer;

import java.math.BigDecimal;

public class Stockers {
    private String ticker;
    private String name;
    private ExchangeMarket market;
    private BigDecimal sharesIssued;

    public Stockers(String ticker, String name, ExchangeMarket market, BigDecimal sharesIssued) {
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

    public ExchangeMarket getMarket() {
        return market;
    }

    public void setMarket(ExchangeMarket market) {
        this.market = market;
    }

    public BigDecimal getSharesIssued() {
        return sharesIssued;
    }

    public void setSharesIssued(BigDecimal sharesIssued) {
        this.sharesIssued = sharesIssued;
    }
}
