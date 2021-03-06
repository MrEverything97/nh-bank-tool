package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(ADST_LNB_BASEInfo_ID.class)
@Table(name = "ADST_LNB_BASE")
@Data
public class ADST_LNB_BASEInfo implements Serializable {
    @Id
    @Column(name = "REF_NO")
    private String refNo;
    @Column(name = "IKIS_STS")
    private String ikisSts;
    @Column(name = "BK_GB")
    private String bkGb;
    @Column(name = "CIX_NO")
    private String cixNo;
    @Column(name = "BUSEO_NO")
    private String buseoNo;
    @Column(name = "COM_ID")
    private String comId;
    @Column(name = "COM_NM")
    private String comNm;
    @Column(name = "OPEN_IL")
    private Date openIl;
    @Column(name = "TOT_EXP_IL")
    private Date totExpIl;
    @Column(name = "REAL_EXP_IL")
    private Date realExpIl;
    @Column(name = "FST_EXP_IL")
    private Date fstExpIl;
    @Column(name = "LON_CCY")
    private String lonCcy;
    @Column(name = "FST_LON_AMT")
    private BigDecimal fstLonAmt;
    @Column(name = "LON_JAN")
    private BigDecimal lonJan;
    @Column(name = "REPAY_GB")
    private String repayGb;
    @Column(name = "SCH_GB")
    private String schGb;
    @Column(name = "TERM_GB")
    private String termGb;
    @Column(name = "ACCRUAL_GB")
    private String accrualGb;
    @Column(name = "ACT_GB")
    private String actGb;
    @Column(name = "GUCH_TERM")
    private BigDecimal guchTerm;
    @Column(name = "REPAY_TERM")
    private BigDecimal repayTerm;
    @Column(name = "REPAY_GAP")
    private BigDecimal repayGap;
    @Column(name = "REPAY_GAP_GB")
    private String repayGapGb;
    @Column(name = "GRACE_DAYS")
    private BigDecimal graceDays;
    @Column(name = "REPAY_CNT")
    private BigDecimal repayCnt;
    @Column(name = "FST_REPAY_IL")
    private Date fstRepayIl;
    @Column(name = "LST_REPAY_IL")
    private Date lstRepayIl;
    @Column(name = "NX_REPAY_IL")
    private Date nxRepayIl;
    @Column(name = "LST_ISU_IL")
    private Date lstIsuIl;
    @Column(name = "LST_IIB_IL")
    private Date lstIibIl;
    @Column(name = "NX_ISU_IL")
    private Date nxIsuIl;
    @Column(name = "NX_ROLL_IL")
    private Date nxRollIl;
    @Column(name = "LST_BILL_IL")
    private Date lstBillIl;
    @Column(name = "NX_BILL_IL")
    private Date nxBillIl;
    @Column(name = "LST_RT")
    private BigDecimal lstRt;
    @Column(name = "MISU_AMT")
    private BigDecimal misuAmt;
    @Column(name = "MISU_SEQ")
    private BigDecimal misuSeq;
    @Column(name = "MKJ_AMT")
    private BigDecimal mkjAmt;
    @Column(name = "MKJ_SEQ")
    private BigDecimal mkjSeq;
    @Column(name = "REPAY_ADJ_SEQ")
    private BigDecimal repayAdjSeq;
    @Column(name = "REPAY_NX_SEQ")
    private BigDecimal repayNxSeq;
    @Column(name = "INT_ADJ_SEQ")
    private BigDecimal intAdjSeq;
    @Column(name = "INT_NX_SEQ")
    private BigDecimal intNxSeq;
    @Column(name = "PRN_YC_GB")
    private String prnYcGb;
    @Column(name = "PRN_YC_IL")
    private Date prnYcIl;
    @Column(name = "INT_YC_GB")
    private String intYcGb;
    @Column(name = "INT_YC_IL")
    private Date intYcIl;
    @Column(name = "YC_GUN")
    private BigDecimal ycGun;
    @Column(name = "TIMES_PAST_DUE_CNT")
    private BigDecimal timesPastDueCnt;
    @Column(name = "REG_PAY_AMT")
    private BigDecimal regPayAmt;
    @Column(name = "NON_EQ_GB")
    private String nonEqGb;
    @Column(name = "NON_EQ_AMT")
    private BigDecimal nonEqAmt;
    @Column(name = "RATE_CCY")
    private String rateCcy;
    @Column(name = "FIX_FLT_GB")
    private String fixFltGb;
    @Column(name = "SPREAD_GB")
    private String spreadGb;
    @Column(name = "SPREAD_RT")
    private BigDecimal spreadRt;
    @Column(name = "RATE_CHG_YN")
    private String rateChgYn;
    @Column(name = "ROLL_GAP")
    private BigDecimal rollGap;
    @Column(name = "ROLL_GAP_GB")
    private String rollGapGb;
    @Column(name = "LATE_CHG_YN")
    private String lateChgYn;
    @Column(name = "LATE_CHG_RT")
    private BigDecimal lateChgRt;
    @Column(name = "PAST_DUE_RT")
    private BigDecimal pastDueRt;
    @Column(name = "ACCRUAL_RT")
    private BigDecimal accrualRt;
    @Column(name = "CAP_RT_YN")
    private String capRtYn;
    @Column(name = "CAP_RT_LIFE")
    private BigDecimal capRtLife;
    @Column(name = "CAP_RT_PRD")
    private BigDecimal capRtPrd;
    @Column(name = "FLOOR_RT_YN")
    private String floorRtYn;
    @Column(name = "FLOOR_RT_LIFE")
    private BigDecimal floorRtLife;
    @Column(name = "FLOOR_RT_PRD")
    private BigDecimal floorRtPrd;
    @Column(name = "ADV_ARR_GB")
    private String advArrGb;
    @Column(name = "SINGLE_BOTH_TYPE")
    private String singleBothType;
    @Column(name = "ACCR_TYPE")
    private String accrType;
    @Column(name = "BSNS_DAY_RULE")
    private String bsnsDayRule;
    @Column(name = "INT_GAP")
    private BigDecimal intGap;
    @Column(name = "INT_GAP_GB")
    private String intGapGb;
    @Column(name = "INT_ADJ_YN")
    private String intAdjYn;
    @Column(name = "ALL_IN_YIELD")
    private BigDecimal allInYield;
    @Column(name = "HD_SNG_NO")
    private String hdSngNo;
    @Column(name = "FEE_YN")
    private String feeYn;
    @Column(name = "APPLI_FEE")
    private BigDecimal appliFee;
    @Column(name = "ORIGI_FEE")
    private BigDecimal origiFee;
    @Column(name = "RENEW_FEE")
    private BigDecimal renewFee;
    @Column(name = "BROKA_FEE")
    private BigDecimal brokaFee;
    @Column(name = "OTHER_FEE")
    private BigDecimal otherFee;
    @Column(name = "SND_DOC_NO")
    private String sndDocNo;
    @Column(name = "THR_RCV_DEPO_CCY")
    private String thrRcvDepoCcy;
    @Column(name = "THR_RCV_DEPO_BIC")
    private String thrRcvDepoBic;
    @Column(name = "EVID_NO")
    private String evidNo;
    @Column(name = "EVID_CCY")
    private String evidCcy;
    @Column(name = "EVID_AMT")
    private BigDecimal evidAmt;
    @Column(name = "USD_CVT_AMT")
    private BigDecimal usdCvtAmt;
    @Column(name = "BBS_CVT_AMT")
    private BigDecimal bbsCvtAmt;
    @Column(name = "AUTO_DEBIT_YN")
    private String autoDebitYn;
    @Column(name = "LOSS_AMT")
    private BigDecimal lossAmt;
    @Column(name = "RESTRUCTURING_YN")
    private String restructuringYn;
    @Column(name = "FST_IB_IL")
    private Date fstIbIl;
    @Column(name = "LST_DEAL_IL")
    private Date lstDealIl;
    @Column(name = "LST_IB_IL")
    private Date lstIbIl;
    @Column(name = "OP_NO")
    private String opNo;
    @Column(name = "OWNER_NO")
    private String ownerNo;
    @Column(name = "RMPB_NO")
    private String rmpbNo;
    @Column(name = "IBF_GB")
    private String ibfGb;
    @Column(name = "BL_NO")
    private String blNo;
    @Column(name = "LG_OPEN_IL")
    private Date lgOpenIl;
    @Column(name = "NXT_RT")
    private BigDecimal nxtRt;
    @Column(name = "NXT_SCH_YN")
    private String nxtSchYn;
    @Column(name = "NEW_SCH_YN")
    private String newSchYn;
    @Column(name = "MSG_LST_ISU_IL")
    private Date msgLstIsuIl;
    @Column(name = "AGR_REF_NO")
    private String agrRefNo;
    @Column(name = "AGR_SEQ_NO")
    private BigDecimal agrSeqNo;
    @Column(name = "LONG_SHORT_TYPE")
    private String longShortType;
    @Column(name = "FLAT_SLIDING")
    private String flatSliding;
    @Column(name = "REG_EMP_NO")
    private String regEmpNo;
    @Column(name = "REG_DT")
    private Date regDt;
    @Column(name = "REG_TM")
    private String regTm;
    @Column(name = "UPD_EMP_NO")
    private String updEmpNo;
    @Column(name = "UPD_DT")
    private Date updDt;
    @Column(name = "UPD_TM")
    private String updTm;
    @Column(name = "PARTIAL_YN")
    private String partialYn;
    @Column(name = "PARTIAL_EXPI_DT")
    private Date partialExpiDt;
    @Column(name = "PARTIAL_AMT")
    private BigDecimal partialAmt;
    @Column(name = "PARTIAL_JAN")
    private BigDecimal partialJan;
    @Column(name = "LN_PRPS_CD")
    private String lnPrpsCd;
} 
