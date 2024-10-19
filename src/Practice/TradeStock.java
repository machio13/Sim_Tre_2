package Practice;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TradeStock {
    private LocalDateTime tradedDatetime;
    private String tradeName;
    private String side;
    private long quantity;
    private BigDecimal tradeUnitPrice;
    private LocalDateTime inputDatetime;

    public TradeStock(LocalDateTime tradedDatetime, String tradeName, String side, long quantity, BigDecimal tradeUnitPrice, LocalDateTime inputDatetime) {
        this.tradedDatetime = tradedDatetime;
        this.tradeName = tradeName;
        this.side = side;
        this.quantity = quantity;
        this.tradeUnitPrice = tradeUnitPrice;
        this.inputDatetime = inputDatetime;
    }

    public LocalDateTime getTradedDatetime() {
        return tradedDatetime;
    }

    public String getTradeName() {
        return tradeName;
    }

    public String getSide() {
        return side;
    }

    public long getQuantity() {
        return quantity;
    }

    public BigDecimal getTradeUnitPrice() {
        return tradeUnitPrice;
    }

    public LocalDateTime getInputDatetime() {
        return inputDatetime;
    }
}
