package nhbank.core.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ADST_LNB_INTInfo_ID implements Serializable {
    private String refNo;
    private BigDecimal hisNo;
    private BigDecimal seqNo;
} 
