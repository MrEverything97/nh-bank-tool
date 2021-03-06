package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AFEX_IPH_COVERInfo_ID.class)
@Table(name = "AFEX_IPH_COVER")
@Data
public class AFEX_IPH_COVERInfo implements Serializable {
    @Id
    @Column(name = "REF_NO")
    private String refNo;
    @Id
    @Column(name = "SEQ")
    private BigDecimal seq;
    @Column(name = "TRAN_DATE")
    private Date tranDate;
    @Column(name = "DUE_DATE")
    private Date dueDate;
    @Column(name = "IP_CD")
    private String ipCd;
    @Column(name = "CCY")
    private String ccy;
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "TREF_NO")
    private String trefNo;
    @Column(name = "NEGO_BKCD")
    private String negoBkcd;
    @Column(name = "NEGO_BKNM")
    private String negoBknm;
    @Column(name = "REIM_BKCD")
    private String reimBkcd;
    @Column(name = "REIM_BKNM")
    private String reimBknm;
    @Column(name = "DRAWER")
    private String drawer;
    @Column(name = "TENOR_GB")
    private String tenorGb;
    @Column(name = "TENOR_DAY")
    private BigDecimal tenorDay;
    @Column(name = "TENOR_CODE")
    private String tenorCode;
    @Column(name = "HAJA_GB")
    private String hajaGb;
    @Column(name = "COMM_GB1")
    private String commGb1;
    @Column(name = "HAND_CCY")
    private String handCcy;
    @Column(name = "HAND_AMT")
    private BigDecimal handAmt;
    @Column(name = "COMM_GB2")
    private String commGb2;
    @Column(name = "CABLE_CCY")
    private String cableCcy;
    @Column(name = "CABLE_AMT")
    private BigDecimal cableAmt;
    @Column(name = "COMM_GB3")
    private String commGb3;
    @Column(name = "LIEU_CCY")
    private String lieuCcy;
    @Column(name = "LIEU_AMT")
    private BigDecimal lieuAmt;
    @Column(name = "COMM_GB4")
    private String commGb4;
    @Column(name = "ETC_CCY")
    private String etcCcy;
    @Column(name = "ETC_AMT")
    private BigDecimal etcAmt;
    @Column(name = "OVERDRAW_AMT")
    private BigDecimal overdrawAmt;
    @Column(name = "AC_NO")
    private String acNo;
    @Column(name = "LA10")
    private String la10;
    @Column(name = "LA20")
    private String la20;
    @Column(name = "LA11")
    private String la11;
    @Column(name = "LA21")
    private String la21;
    @Column(name = "LA12")
    private String la12;
    @Column(name = "LA22")
    private String la22;
    @Column(name = "LA13")
    private String la13;
    @Column(name = "LA23")
    private String la23;
    @Column(name = "TXT10")
    private String txt10;
    @Column(name = "TXT20")
    private String txt20;
    @Column(name = "TXT11")
    private String txt11;
    @Column(name = "TXT21")
    private String txt21;
    @Column(name = "TXT12")
    private String txt12;
    @Column(name = "TXT22")
    private String txt22;
    @Column(name = "TXT13")
    private String txt13;
    @Column(name = "TXT23")
    private String txt23;
    @Column(name = "TXT14")
    private String txt14;
    @Column(name = "TXT24")
    private String txt24;
    @Column(name = "TXT15")
    private String txt15;
    @Column(name = "TXT25")
    private String txt25;
    @Column(name = "TXT16")
    private String txt16;
    @Column(name = "TXT26")
    private String txt26;
    @Column(name = "TXT17")
    private String txt17;
    @Column(name = "TXT27")
    private String txt27;
    @Column(name = "TXT18")
    private String txt18;
    @Column(name = "TXT28")
    private String txt28;
    @Column(name = "TXT19")
    private String txt19;
    @Column(name = "TXT29")
    private String txt29;
    @Column(name = "TXT110")
    private String txt110;
    @Column(name = "TXT210")
    private String txt210;
    @Column(name = "TXT111")
    private String txt111;
    @Column(name = "TXT211")
    private String txt211;
    @Column(name = "TXT112")
    private String txt112;
    @Column(name = "TXT212")
    private String txt212;
    @Column(name = "TXT113")
    private String txt113;
    @Column(name = "TXT213")
    private String txt213;
    @Column(name = "TXT114")
    private String txt114;
    @Column(name = "TXT214")
    private String txt214;
    @Column(name = "TXT115")
    private String txt115;
    @Column(name = "TXT215")
    private String txt215;
    @Column(name = "TXT116")
    private String txt116;
    @Column(name = "TXT216")
    private String txt216;
    @Column(name = "TXT117")
    private String txt117;
    @Column(name = "TXT217")
    private String txt217;
    @Column(name = "TXT118")
    private String txt118;
    @Column(name = "TXT218")
    private String txt218;
    @Column(name = "VESSEL")
    private String vessel;
    @Column(name = "VOYAGE")
    private String voyage;
    @Column(name = "COMMODITY1")
    private String commodity1;
    @Column(name = "COMMODITY2")
    private String commodity2;
    @Column(name = "CONTRACT_NO")
    private String contractNo;
    @Column(name = "HAJA_CD1")
    private String hajaCd1;
    @Column(name = "HAJA_CD2")
    private String hajaCd2;
    @Column(name = "HAJA_CD3")
    private String hajaCd3;
    @Column(name = "HAJA_CD4")
    private String hajaCd4;
    @Column(name = "HAJA_CD5")
    private String hajaCd5;
    @Column(name = "HAJA_CD6")
    private String hajaCd6;
    @Column(name = "HAJA_CD7")
    private String hajaCd7;
    @Column(name = "HAJA_CD8")
    private String hajaCd8;
    @Column(name = "HAJA_CD9")
    private String hajaCd9;
    @Column(name = "HAJA_CD10")
    private String hajaCd10;
    @Column(name = "HAJA_CD11")
    private String hajaCd11;
    @Column(name = "HAJA_CD12")
    private String hajaCd12;
    @Column(name = "HAJA_CD13")
    private String hajaCd13;
    @Column(name = "HAJA_CD14")
    private String hajaCd14;
    @Column(name = "HAJA_CD15")
    private String hajaCd15;
    @Column(name = "HAJA_CD16")
    private String hajaCd16;
    @Column(name = "HAJA_CD17")
    private String hajaCd17;
    @Column(name = "HAJA_CD18")
    private String hajaCd18;
    @Column(name = "HAJA_CD19")
    private String hajaCd19;
    @Column(name = "HAJA_SAYU")
    private String hajaSayu;
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
    @Column(name = "LOAD_PORT_CTRY")
    private String loadPortCtry;
    @Column(name = "DISC_PORT_CTRY")
    private String discPortCtry;
    @Column(name = "ORGN_CTRY")
    private String orgnCtry;
    @Column(name = "SHIP_CTRY")
    private String shipCtry;
} 
