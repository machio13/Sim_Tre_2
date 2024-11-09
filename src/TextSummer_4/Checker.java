package TextSummer_4;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public abstract class Checker {

    abstract int limitName();

    public final String isNameLimitName(String name) {
        if (name.length() > limitName()) {
            return (name.substring(0, limitName() - 3) + "...");
        }else {
            return name;
        }
    }

    public final String isFormatUnitPrice(BigDecimal unitPrice) {
        DecimalFormat priceFormater = new DecimalFormat("#,###.##");
        return priceFormater.format(unitPrice);
    }

    public final String isFormatQuantity(long price) {
        BigDecimal bigDecimal = new BigDecimal(price);
        DecimalFormat priceFormater = new DecimalFormat("#,###");
        return priceFormater.format(bigDecimal);
    }

    public final String isFormatPrice(BigDecimal price) {
        DecimalFormat priceFormater = new DecimalFormat("#,###");
        return priceFormater.format(price);
    }
}
