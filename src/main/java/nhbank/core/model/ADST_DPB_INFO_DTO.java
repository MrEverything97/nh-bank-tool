package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ADST_DPB_INFO_DTO {
    private String ACCT_NO;
    private String OPN_SAYU_CD;
    private String OPN_SRC_CD;
    private String CLS_SAYU_CD;
    private String OPN_GB;
    private String CLS_GB;
    private String DORMANT_YN;
    private String BL_YN;
    private String EMP_PAY_ACCT_YN;
    private String LON_INT_CAL_GB;
    private String ROLL_OVER_CD;
    private String RO_BASE_DT_CD;
    private String ADMIN_FEE_EXMP_YN;
    private String CLS_FEE_EXMP_YN;
    private String CLS_INT_PAY_YN;
    private String SD_ACCT_NO;
    private String PBOOK_GB;
    private String PBOOK_CD;
    private BigDecimal PBOOK_LINE;
    private BigDecimal PBOOK_SEQ;
    private BigDecimal PWD_ERR_CNT;
    private String OP_NO;
    private String OWNER_NO;
    private String PBRM_NO;
    private String PBOOK_LOSS_GB;
    private String STOP_WITH_GB;
    private String STOP_WITH2_GB;
    private String STOP_DEP_GB;
    private String COLT_GB;
    private String WARN_LTTR_CD;
    private String WARN_CK_NO;
    private String LST_WARN_CK_NO;
    private Date WARN_REG_DT;
    private Date LST_WARN_REG_DT;
    private String IK_ING;
    private String PBOOK_USE_GB;
    private String LON_ACCT_GB;
    private String HOIJUN;
    private String INT_MOVE_GB;
    private String CLS_MOVE_GB;
    private String DPT_NEGO_RT_GB;
    private String FIX_FLT_GB;
    private String VOSTRO_GB;
    private String JOINT_REL_CD;
    private String JOINT_CIX_NO;
    private String ACCT_REMARK;
    private Date LST_IB_IL;
    private String LST_TIME;
    private Date SELF_MNG_IL;
    private String IBF_GB;
    private BigDecimal LMT_MAX_AMT;
    private String PBOOK_NO;
    private String EB_USE_GB;
    private String NET_CLS_POSS_YN;
    private String NET_PAY_POSS_YN;
    private String BANK_DV_CD;
    private String TRF_PSBK_REPRT_YN;
    private String SIGN_FILE_NM;
    private String BI_PRD_CD;
    private String BI_MSRM_CTGR;
    private String BI_ACCT_PRPT;
    private String PRCP_WITH_METH_CD;
    private String INT_WITH_METH_CD;
    private String PRCP_ACCT_NO;
    private String INT_ACCT_NO;
    private BigDecimal PRCP_TMPL_CD;
    private BigDecimal INT_TMPL_CD;
    private String CERT_NO;
    private String SEND_ADDR_DV;
    private String COM_BIT;
    private BigDecimal AMT1;
    private BigDecimal AMT2;
    private BigDecimal AMT3;
    private BigDecimal AMT4;
    private BigDecimal AMT5;
    private BigDecimal AMT6;
    private BigDecimal AMT7;
    private BigDecimal AMT8;
    private BigDecimal AMT9;
    private BigDecimal AMT10;
    private String CD1;
    private String CD2;
    private String CD3;
    private String CD4;
    private String CD5;
    private String CD6;
    private String CD7;
    private String CD8;
    private String CD9;
    private String CD10;
    private BigDecimal RT1;
    private BigDecimal RT2;
    private BigDecimal RT3;
    private BigDecimal RT4;
    private BigDecimal RT5;
    private Date DT1;
    private Date DT2;
    private Date DT3;
    private Date DT4;
    private Date DT5;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;
    private String PWD_LOSS_GB;

    public ADST_DPB_INFO_DTO() {
    }
} 
