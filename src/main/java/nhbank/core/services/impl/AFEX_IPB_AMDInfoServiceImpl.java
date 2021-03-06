package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_IPB_AMDInfo;
import nhbank.core.repositories.AFEX_IPB_AMDInfoRepository;
import nhbank.core.services.AFEX_IPB_AMDInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import nhbank.core.util.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

import nhbank.core.util.DateUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class AFEX_IPB_AMDInfoServiceImpl implements AFEX_IPB_AMDInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_IPB_AMDInfoRepository afex_ipb_amdInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_IPB_AMD");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_IPB_AMDInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_IPB_AMD.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_IPB_AMD.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_IPB_AMDInfo obj = new AFEX_IPB_AMDInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setSeq(new BigDecimal(lineArray[1]));
                    obj.setSts(lineArray[2]);
                    obj.setAcIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                    obj.setGisIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                    obj.setLstIbIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                    obj.setCcy(lineArray[6]);
                    obj.setIdAmt(new BigDecimal(lineArray[7]));
                    obj.setHisNo(new BigDecimal(lineArray[8]));
                    obj.setAmdCd(lineArray[9]);
                    obj.setBeCcy(lineArray[10]);
                    obj.setAfCcy(lineArray[11]);
                    obj.setBeAmt(new BigDecimal(lineArray[12]));
                    obj.setAfAmt(new BigDecimal(lineArray[13]));
                    obj.setBeExpIl((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                    obj.setAfExpIl((lineArray[15].equals("")) ? null : formatter.parse(lineArray[15]));
                    obj.setBojJukYul(new BigDecimal(lineArray[16]));
                    obj.setTcDsamt(new BigDecimal(lineArray[17]));
                    obj.setReReGb(lineArray[18]);
                    obj.setBeMore(lineArray[19]);
                    obj.setBeLess(lineArray[20]);
                    obj.setAfMore(lineArray[21]);
                    obj.setAfLess(lineArray[22]);
                    obj.setBeTcLisuIl((lineArray[23].equals("")) ? null : formatter.parse(lineArray[23]));
                    obj.setRegEmpNo(lineArray[24]);
                    obj.setRegDt((lineArray[25].equals("")) ? null : formatter.parse(lineArray[25]));
                    obj.setRegTm(lineArray[26]);
                    obj.setUpdEmpNo(lineArray[27]);
                    obj.setUpdDt((lineArray[28].equals("")) ? null : formatter.parse(lineArray[28]));
                    obj.setUpdTm(lineArray[29]);
                    if (isExist(obj.getRefNo(), obj.getSeq())) {
                        afex_ipb_amdInfoRepository.save(obj);
                    } else {
                        objList.add(obj);
                    }
                }
                br.close();
                if (!objList.isEmpty())
                    insertAll(objList);
                checkUpdate.setStatus("Done");
                checkUpdateRepository.save(checkUpdate);
                FileUtils.moveFile(dataPath, uploadPath, file.getName());
                FileUtils.deleteFile(file);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            checkUpdate.setStatus("File format error");
            checkUpdateRepository.save(checkUpdate);
            assert br != null;
            br.close();
        }
    }

    @Override
    public void insertAll(List<AFEX_IPB_AMDInfo> objList) {
        afex_ipb_amdInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal seq) {
        return afex_ipb_amdInfoRepository.existsByRefNoAndSeq(refNo, seq);
    }
}
