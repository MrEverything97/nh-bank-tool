package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class AFEX_XPH_TRAInfo_ID implements Serializable {
    private String refNo;
    private String traGb;
    private BigDecimal hisNo;
    private BigDecimal seqNo;
} 
