package club.owefsad.CentralRepository.WebAPI.service.impl;

import club.owefsad.CentralRepository.WebAPI.entity.ScanResult;
import club.owefsad.CentralRepository.WebAPI.mapper.ScanResultMapper;
import club.owefsad.CentralRepository.WebAPI.service.IScanResultService;
import com.github.pagehelper.PageHelper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author owefsad
 */
@Service
public class ScanResultServiceImpl implements IScanResultService {

    @Autowired
    private ScanResultMapper mapper;

    @Override
    public List<ScanResult> list(ScanResult record, Integer page, Integer pageSize) {
        PageHelper.startPage(page, pageSize);
        return mapper.list(record);
    }

    @Override
    public Integer todayRecord() {
        return mapper.todayRecord();
    }

    @Override
    public Integer totalRecord() {
        return mapper.totalRecord();
    }

    @Override
    public Integer updateRecordState(ScanResult record) {
        record.setUpdateTime(System.currentTimeMillis());
        return mapper.updateRecordState(record);
    }
}
