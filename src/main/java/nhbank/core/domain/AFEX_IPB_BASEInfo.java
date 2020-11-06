package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AFEX_IPB_BASEInfo_ID.class)
@Table(name = "AFEX_IPB_BASE")
@Data
public class AFEX_IPB_BASEInfo implements Serializable {
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
    @Column(name = "IP_CCY")
    private String ipCcy;
    @Column(name = "IP_JAN")
    private BigDecimal ipJan;
    @Column(name = "GT_JAN")
    private BigDecimal gtJan;
    @Column(name = "LGS_JAN")
    private BigDecimal lgsJan;
    @Column(name = "LGU_JAN")
    private BigDecimal lguJan;
    @Column(name = "BLD_JAN")
    private BigDecimal bldJan;
    @Column(name = "INS_JAN")
    private BigDecimal insJan;
    @Column(name = "BOJ_JAN")
    private BigDecimal bojJan;
    @Column(name = "BOJ_JAN1")
    private BigDecimal bojJan1;
    @Column(name = "BOJ_JAN2")
    private BigDecimal bojJan2;
    @Column(name = "BOJ_BJAN")
    private BigDecimal bojBjan;
    @Column(name = "BOJ_BJAN1")
    private BigDecimal bojBjan1;
    @Column(name = "BOJ_BJAN2")
    private BigDecimal bojBjan2;
    @Column(name = "COR_JAN")
    private BigDecimal corJan;
    @Column(name = "DJB_BJAN")
    private BigDecimal djbBjan;
    @Column(name = "BLD_SEQ")
    private BigDecimal bldSeq;
    @Column(name = "AMD_SEQ")
    private BigDecimal amdSeq;
    @Column(name = "LGM_SEQ")
    private BigDecimal lgmSeq;
    @Column(name = "IKIS_SEQ")
    private BigDecimal ikisSeq;
    @Column(name = "IKIS_HIS_NO")
    private BigDecimal ikisHisNo;
    @Column(name = "COR_SEQ")
    private BigDecimal corSeq;
    @Column(name = "DJB_SEQ")
    private BigDecimal djbSeq;
    @Column(name = "BOJ_SEQ")
    private BigDecimal bojSeq;
    @Column(name = "JAJ_SEQ")
    private BigDecimal jajSeq;
    @Column(name = "ITM_SEQ")
    private BigDecimal itmSeq;
    @Column(name = "OPEN_IL")
    private Date openIl;
    @Column(name = "GIS_IL")
    private Date gisIl;
    @Column(name = "LST_IL")
    private Date lstIl;
    @Column(name = "LST_IB_IL")
    private Date lstIbIl;
    @Column(name = "OPEN_CCY")
    private String openCcy;
    @Column(name = "OPEN_AMT")
    private BigDecimal openAmt;
    @Column(name = "IP_CD")
    private String ipCd;
    @Column(name = "BUN_GB")
    private String bunGb;
    @Column(name = "MILT_GB")
    private String miltGb;
    @Column(name = "EXP_IL")
    private Date expIl;
    @Column(name = "BOJ_JUK_YUL")
    private BigDecimal bojJukYul;
    @Column(name = "PRICE_CD")
    private String priceCd;
    @Column(name = "HS_CD")
    private String hsCd;
    @Column(name = "HS_NM")
    private String hsNm;
    @Column(name = "ORIG_CTRY")
    private String origCtry;
    @Column(name = "SD_CTRY")
    private String sdCtry;
    @Column(name = "TERM_GB")
    private String termGb;
    @Column(name = "TERM")
    private BigDecimal term;
    @Column(name = "HD_SNG_NO")
    private String hdSngNo;
    @Column(name = "CAN_ACC_GB")
    private String canAccGb;
    @Column(name = "PO_NO")
    private String poNo;
    @Column(name = "UNSONG_GB")
    private String unsongGb;
    @Column(name = "TC_FRT_GB")
    private String tcFrtGb;
    @Column(name = "TC_FRT")
    private BigDecimal tcFrt;
    @Column(name = "TC_LISU_IL")
    private Date tcLisuIl;
    @Column(name = "TC_DSAMT")
    private BigDecimal tcDsamt;
    @Column(name = "TC_HRT")
    private BigDecimal tcHrt;
    @Column(name = "TC_TERM_GB")
    private String tcTermGb;
    @Column(name = "TC_RCV_GB")
    private String tcRcvGb;
    @Column(name = "SL_CD")
    private String slCd;
    @Column(name = "SL_YO_CD")
    private String slYoCd;
    @Column(name = "SET_BKCD")
    private String setBkcd;
    @Column(name = "ACPT_BKCD")
    private String acptBkcd;
    @Column(name = "CONF_BKCD")
    private String confBkcd;
    @Column(name = "RE_OP_GB")
    private String reOpGb;
    @Column(name = "REOP_BKCD")
    private String reopBkcd;
    @Column(name = "RE_FRT_YUL")
    private BigDecimal reFrtYul;
    @Column(name = "RE_RE_GB")
    private String reReGb;
    @Column(name = "RE_RE_GB1")
    private String reReGb1;
    @Column(name = "OP_NO")
    private String opNo;
    @Column(name = "OWNER_NO")
    private String ownerNo;
    @Column(name = "PBRM_NO")
    private String pbrmNo;
    @Column(name = "COR_FRT")
    private BigDecimal corFrt;
    @Column(name = "SPRD_FRT")
    private BigDecimal sprdFrt;
    @Column(name = "LC_NO")
    private String lcNo;
    @Column(name = "AMT_MORE")
    private String amtMore;
    @Column(name = "AMT_LESS")
    private String amtLess;
    @Column(name = "REVOLVE_GB")
    private String revolveGb;
    @Column(name = "PARTSHIP_GB")
    private String partshipGb;
    @Column(name = "GYOM")
    private String gyom;
    @Column(name = "COM_ID")
    private String comId;
    @Column(name = "IBF_GB")
    private String ibfGb;
    @Column(name = "TC_MISU_CNT")
    private BigDecimal tcMisuCnt;
    @Column(name = "TC_FRT2")
    private BigDecimal tcFrt2;
    @Column(name = "TC_DSAMT2")
    private BigDecimal tcDsamt2;
    @Column(name = "BENI_CTRY")
    private String beniCtry;
    @Column(name = "BOSE_GB")
    private String boseGb;
    @Column(name = "BENI_NM")
    private String beniNm;
    @Column(name = "TOL_JAN")
    private BigDecimal tolJan;
    @Column(name = "TOL_USE")
    private BigDecimal tolUse;
    @Column(name = "SKBDN_YN")
    private String skbdnYn;
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
} 