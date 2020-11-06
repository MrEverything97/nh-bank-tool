package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ADST_LNB_BASE_DTO {
    private String REF_NO;
    private String IKIS_STS;
    private String BK_GB;
    private String CIX_NO;
    private String BUSEO_NO;
    private String COM_ID;
    private String COM_NM;
    private Date OPEN_IL;
    private Date TOT_EXP_IL;
    private Date REAL_EXP_IL;
    private Date FST_EXP_IL;
    private String LON_CCY;
    private BigDecimal FST_LON_AMT;
    private BigDecimal LON_JAN;
    private String REPAY_GB;
    private String SCH_GB;
    private String TERM_GB;
    private String ACCRUAL_GB;
    private String ACT_GB;
    private BigDecimal GUCH_TERM;
    private BigDecimal REPAY_TERM;
    private BigDecimal REPAY_GAP;
    private String REPAY_GAP_GB;
    private BigDecimal GRACE_DAYS;
    private BigDecimal REPAY_CNT;
    private Date FST_REPAY_IL;
    private Date LST_REPAY_IL;
    private Date NX_REPAY_IL;
    private Date LST_ISU_IL;
    private Date LST_IIB_IL;
    private Date NX_ISU_IL;
    private Date NX_ROLL_IL;
    private Date LST_BILL_IL;
    private Date NX_BILL_IL;
    private BigDecimal LST_RT;
    private BigDecimal MISU_AMT;
    private BigDecimal MISU_SEQ;
    private BigDecimal MKJ_AMT;
    private BigDecimal MKJ_SEQ;
    private BigDecimal REPAY_ADJ_SEQ;
    private BigDecimal REPAY_NX_SEQ;
    private BigDecimal INT_ADJ_SEQ;
    private BigDecimal INT_NX_SEQ;
    private String PRN_YC_GB;
    private Date PRN_YC_IL;
    private String INT_YC_GB;
    private Date INT_YC_IL;
    private BigDecimal YC_GUN;
    private BigDecimal TIMES_PAST_DUE_CNT;
    private BigDecimal REG_PAY_AMT;
    private String NON_EQ_GB;
    private BigDecimal NON_EQ_AMT;
    private String RATE_CCY;
    private String FIX_FLT_GB;
    private String SPREAD_GB;
    private BigDecimal SPREAD_RT;
    private String RATE_CHG_YN;
    private BigDecimal ROLL_GAP;
    private String ROLL_GAP_GB;
    private String LATE_CHG_YN;
    private BigDecimal LATE_CHG_RT;
    private BigDecimal PAST_DUE_RT;
    private BigDecimal ACCRUAL_RT;
    private String CAP_RT_YN;
    private BigDecimal CAP_RT_LIFE;
    private BigDecimal CAP_RT_PRD;
    private String FLOOR_RT_YN;
    private BigDecimal FLOOR_RT_LIFE;
    private BigDecimal FLOOR_RT_PRD;
    private String ADV_ARR_GB;
    private String SINGLE_BOTH_TYPE;
    private String ACCR_TYPE;
    private String BSNS_DAY_RULE;
    private BigDecimal INT_GAP;
    private String INT_GAP_GB;
    private String INT_ADJ_YN;
    private BigDecimal ALL_IN_YIELD;
    private String HD_SNG_NO;
    private String FEE_YN;
    private BigDecimal APPLI_FEE;
    private BigDecimal ORIGI_FEE;
    private BigDecimal RENEW_FEE;
    private BigDecimal BROKA_FEE;
    private BigDecimal OTHER_FEE;
    private String SND_DOC_NO;
    private String THR_RCV_DEPO_CCY;
    private String THR_RCV_DEPO_BIC;
    private String EVID_NO;
    private String EVID_CCY;
    private BigDecimal EVID_AMT;
    private BigDecimal USD_CVT_AMT;
    private BigDecimal BBS_CVT_AMT;
    private String AUTO_DEBIT_YN;
    private BigDecimal LOSS_AMT;
    private String RESTRUCTURING_YN;
    private Date FST_IB_IL;
    private Date LST_DEAL_IL;
    private Date LST_IB_IL;
    private String OP_NO;
    private String OWNER_NO;
    private String RMPB_NO;
    private String IBF_GB;
    private String BL_NO;
    private Date LG_OPEN_IL;
    private BigDecimal NXT_RT;
    private String NXT_SCH_YN;
    private String NEW_SCH_YN;
    private Date MSG_LST_ISU_IL;
    private String AGR_REF_NO;
    private BigDecimal AGR_SEQ_NO;
    private String LONG_SHORT_TYPE;
    private String FLAT_SLIDING;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;
    private String PARTIAL_YN;
    private Date PARTIAL_EXPI_DT;
    private BigDecimal PARTIAL_AMT;
    private BigDecimal PARTIAL_JAN;
    private String LN_PRPS_CD;

    public ADST_LNB_BASE_DTO() {
    }
} 