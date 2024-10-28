package TextSummer3;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TradeStock {
    private LocalDateTime traded_Datetime;
    private String trade_Name;
    private String trade_side;
    private long trade_quantity;
    private BigDecimal trade_Unit_Price;
    private LocalDateTime trade_input_Datetime;

    public TradeStock(LocalDateTime traded_Datetime, String tradeName, String side, long quantity, BigDecimal trade_Unit_Price, LocalDateTime inputDatetime) {
        this.traded_Datetime = traded_Datetime;
        this.trade_Name = tradeName;
        this.trade_side = side;
        this.trade_quantity = quantity;
        this.trade_Unit_Price = trade_Unit_Price;
        this.trade_input_Datetime = inputDatetime;
    }

    public LocalDateTime getTraded_Datetime() {
        return traded_Datetime;
    }

    public String getTrade_Name() {
        return trade_Name;
    }

    public String getTrade_side() {
        return trade_side;
    }

    public long getTrade_quantity() {
        return trade_quantity;
    }

    public BigDecimal getTrade_Unit_Price() {
        return trade_Unit_Price;
    }

    public LocalDateTime getTrade_input_Datetime() {
        return trade_input_Datetime;
    }
}
