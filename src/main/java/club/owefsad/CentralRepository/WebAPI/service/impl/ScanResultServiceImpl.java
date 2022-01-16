package club.owefsad.CentralRepository.WebAPI.service.impl;

import club.owefsad.CentralRepository.WebAPI.entity.ScanResult;
import club.owefsad.CentralRepository.WebAPI.mapper.ScanResultMapper;
import club.owefsad.CentralRepository.WebAPI.service.IScanResultService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScanResultServiceImpl implements IScanResultService {

    @Autowired
    private ScanResultMapper mapper;

    @Override
    public List<ScanResult> list(ScanResult record) {
        return mapper.list(record);
    }
}
