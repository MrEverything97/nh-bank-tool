package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AFEX_ADH_AMENDInfo_ID.class)
@Table(name = "AFEX_ADH_AMEND")
@Data
public class AFEX_ADH_AMENDInfo implements Serializable {
    @Id
    @Column(name = "MAKE_IL")
    private Date makeIl;
    @Id
    @Column(name = "SEQ_NO")
    private BigDecimal seqNo;
    @Column(name = "LST_HIS_NO")
    private BigDecimal lstHisNo;
    @Column(name = "ADV_NO")
    private String advNo;
    @Column(name = "SEND_GB")
    private String sendGb;
    @Column(name = "LC_NO")
    private String lcNo;
    @Column(name = "OPEN_IL")
    private Date openIl;
    @Column(name = "AMD_CNT")
    private BigDecimal amdCnt;
    @Column(name = "OPEN_BKCD")
    private String openBkcd;
    @Column(name = "OPEN_BKNM1")
    private String openBknm1;
    @Column(name = "OPEN_BKNM2")
    private String openBknm2;
    @Column(name = "OPEN_BKNM3")
    private String openBknm3;
    @Column(name = "BENE_CD")
    private String beneCd;
    @Column(name = "BENE_NM1")
    private String beneNm1;
    @Column(name = "BENE_NM2")
    private String beneNm2;
    @Column(name = "BENE_NM3")
    private String beneNm3;
    @Column(name = "AMD_GB")
    private String amdGb;
    @Column(name = "GYOBU_GB")
    private String gyobuGb;
    @Column(name = "GYOBU_IL")
    private Date gyobuIl;
    @Column(name = "AMT_GB")
    private String amtGb;
    @Column(name = "AMD_CCY")
    private String amdCcy;
    @Column(name = "AMD_AMT")
    private BigDecimal amdAmt;
    @Column(name = "AF_CCY")
    private String afCcy;
    @Column(name = "AF_AMT")
    private BigDecimal afAmt;
    @Column(name = "EXP_IL")
    private Date expIl;
    @Column(name = "SHIP_IL")
    private Date shipIl;
    @Column(name = "AUTH_GB")
    private String authGb;
    @Column(name = "EDI_CHURI")
    private String ediChuri;
    @Column(name = "EDI_SEND")
    private String ediSend;
    @Column(name = "FAX_ADV")
    private String faxAdv;
    @Column(name = "FAX_SEND")
    private String faxSend;
    @Column(name = "TAIL")
    private String tail;
    @Column(name = "NOR_URG")
    private String norUrg;
    @Column(name = "SWIFT_MRN")
    private String swiftMrn;
    @Column(name = "MNG_NO")
    private String mngNo;
    @Column(name = "OP_NO")
    private String opNo;
    @Column(name = "TOT_SEQ")
    private BigDecimal totSeq;
    @Column(name = "LST_IL")
    private Date lstIl;
    @Column(name = "MT707_FNM")
    private String mt707Fnm;
    @Column(name = "RELAY")
    private String relay;
    @Column(name = "LST_TIME")
    private String lstTime;
    @Column(name = "TX_KEY")
    private String txKey;
    @Column(name = "MSG_TYPE")
    private String msgType;
    @Column(name = "EDI_ID")
    private String ediId;
    @Column(name = "COND_STS")
    private String condSts;
    @Column(name = "EDI_SUIN")
    private String ediSuin;
    @Column(name = "BOK_SEND")
    private String bokSend;
    @Column(name = "TONG_PRINT")
    private String tongPrint;
    @Column(name = "BR_NO")
    private String brNo;
    @Column(name = "BR_NM")
    private String brNm;
    @Column(name = "BR_CHARGE")
    private BigDecimal brCharge;
    @Column(name = "CHARGE_AMT")
    private BigDecimal chargeAmt;
    @Column(name = "CHARGE_GB")
    private String chargeGb;
    @Column(name = "CIX_NO")
    private String cixNo;
    @Column(name = "BUSEO_NO")
    private String buseoNo;
    @Column(name = "IBGM_MD")
    private String ibgmMd;
    @Column(name = "CHARGE_MD")
    private String chargeMd;
    @Column(name = "CHARGE_IL")
    private Date chargeIl;
    @Column(name = "MT707_FNM1")
    private String mt707Fnm1;
    @Column(name = "PRT_CNT")
    private BigDecimal prtCnt;
    @Column(name = "RE_ISSUE")
    private String reIssue;
    @Column(name = "MT707_FNM2")
    private String mt707Fnm2;
    @Column(name = "MT707_FNM3")
    private String mt707Fnm3;
    @Column(name = "MT707_FNM4")
    private String mt707Fnm4;
    @Column(name = "MT707_CNT")
    private BigDecimal mt707Cnt;
    @Column(name = "MT730_SEND")
    private String mt730Send;
    @Column(name = "MT730_DOC_ID")
    private String mt730DocId;
    @Column(name = "FIRST_IL")
    private Date firstIl;
    @Column(name = "MT710_SEND")
    private String mt710Send;
    @Column(name = "MT710_DOC_ID")
    private String mt710DocId;
    @Column(name = "CHARGE_CCY")
    private String chargeCcy;
    @Column(name = "OUR_CUST_GB")
    private String ourCustGb;
    @Column(name = "BENE_NM4")
    private String beneNm4;
    @Column(name = "MT707_DOC_ID")
    private String mt707DocId;
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
    @Column(name = "APPL_NM1")
    private String applNm1;
    @Column(name = "APPL_NM2")
    private String applNm2;
    @Column(name = "APPL_NM3")
    private String applNm3;
    @Column(name = "APPL_NM4")
    private String applNm4;
    @Column(name = "DRAW_BKCD")
    private String drawBkcd;
    @Column(name = "DRAW_BKNM1")
    private String drawBknm1;
    @Column(name = "DRAW_BKNM2")
    private String drawBknm2;
    @Column(name = "DRAW_BKNM3")
    private String drawBknm3;
    @Column(name = "REIM_BKCD")
    private String reimBkcd;
    @Column(name = "REIM_BKNM1")
    private String reimBknm1;
    @Column(name = "REIM_BKNM2")
    private String reimBknm2;
    @Column(name = "REIM_BKNM3")
    private String reimBknm3;
    @Column(name = "ADV_THRU_GB")
    private String advThruGb;
    @Column(name = "THRU_BKCD")
    private String thruBkcd;
    @Column(name = "THRU_BKNM1")
    private String thruBknm1;
    @Column(name = "THRU_BKNM2")
    private String thruBknm2;
    @Column(name = "THRU_BKNM3")
    private String thruBknm3;
    @Column(name = "CONFIRM_GB")
    private String confirmGb;
    @Column(name = "CNFR_FR_IL")
    private Date cnfrFrIl;
    @Column(name = "CNFR_TO_IL")
    private Date cnfrToIl;
    @Column(name = "CNFR_RT")
    private BigDecimal cnfrRt;
    @Column(name = "CNFM_BIC")
    private String cnfmBic;
    @Column(name = "CNFM_NM1")
    private String cnfmNm1;
    @Column(name = "CNFM_NM2")
    private String cnfmNm2;
    @Column(name = "CNFM_NM3")
    private String cnfmNm3;
    @Column(name = "MT708_FNM1")
    private String mt708Fnm1;
    @Column(name = "MT708_FNM2")
    private String mt708Fnm2;
    @Column(name = "MT708_FNM3")
    private String mt708Fnm3;
    @Column(name = "MT708_FNM4")
    private String mt708Fnm4;
    @Column(name = "MT708_CNT")
    private BigDecimal mt708Cnt;
} 