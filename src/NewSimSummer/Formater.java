package NewSimSummer;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public abstract class Formater {

    abstract int cutNum();

    public String isBigDecimalFormat(BigDecimal sharesIssued) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        return decimalFormat.format(sharesIssued);
    }

    public String isCutName (String name) {
        if (name.length() > cutNum()) {
            return (name.substring(0, cutNum() - 3) + "...");
        }else {
            return name;
        }
    }

}
