package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class AFEX_RTB_HISInfo_ID implements Serializable {
    private String refNo;
    private BigDecimal hisNo;
} 