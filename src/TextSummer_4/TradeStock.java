package TextSummer_4;


import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TradeStock {
    private LocalDateTime traded_Datetime;
    private String trade_Name;
    private String trade_Side;
    private long trade_Quantity;
    private BigDecimal traded_Unit_Price;
    private LocalDateTime trade_Input_Datetime;

    public TradeStock(LocalDateTime traded_Datetime, String trade_Name, String trade_Side
            , long trade_Quantity, BigDecimal traded_Unit_Price, LocalDateTime trade_Input_Datetime) {
        this.traded_Datetime = traded_Datetime;
        this.trade_Name = trade_Name;
        this.trade_Side = trade_Side;
        this.trade_Quantity = trade_Quantity;
        this.traded_Unit_Price = traded_Unit_Price;
        this.trade_Input_Datetime = trade_Input_Datetime;
    }

    public LocalDateTime getTraded_Datetime() {
        return traded_Datetime;
    }

    public void setTraded_Datetime(LocalDateTime traded_Datetime) {
        this.traded_Datetime = traded_Datetime;
    }

    public String getTrade_Name() {
        return trade_Name;
    }

    public void setTrade_Name(String trade_Name) {
        this.trade_Name = trade_Name;
    }

    public String getTrade_Side() {
        return trade_Side;
    }

    public void setTrade_Side(String trade_Side) {
        this.trade_Side = trade_Side;
    }

    public long getTrade_Quantity() {
        return trade_Quantity;
    }

    public void setTrade_Quantity(long trade_Quantity) {
        this.trade_Quantity = trade_Quantity;
    }

    public BigDecimal getTraded_Unit_Price() {
        return traded_Unit_Price;
    }

    public void setTraded_Unit_Price(BigDecimal traded_Unit_Price) {
        this.traded_Unit_Price = traded_Unit_Price;
    }

    public LocalDateTime getTrade_Input_Datetime() {
        return trade_Input_Datetime;
    }

    public void setTrade_Input_Datetime(LocalDateTime trade_Input_Datetime) {
        this.trade_Input_Datetime = trade_Input_Datetime;
    }
}
