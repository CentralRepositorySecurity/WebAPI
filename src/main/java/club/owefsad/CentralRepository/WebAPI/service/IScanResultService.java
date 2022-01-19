package club.owefsad.CentralRepository.WebAPI.service;

import club.owefsad.CentralRepository.WebAPI.entity.ScanResult;
import java.util.List;

/**
 * @author owefsad
 */
public interface IScanResultService {

    /**
     * @param record
     * @param page
     * @param pageSize
     * @return
     */
    List<ScanResult> list(ScanResult record, Integer page, Integer pageSize);

    Integer todayRecord();

    Integer totalRecord();

    Integer updateRecordState(ScanResult record);

}
