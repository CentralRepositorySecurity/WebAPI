package club.owefsad.CentralRepository.WebAPI.service.impl;

import club.owefsad.CentralRepository.WebAPI.mapper.ScanProcessMapper;
import club.owefsad.CentralRepository.WebAPI.service.IScanProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScanProcessServiceImpl implements IScanProcessService {

    @Autowired
    private ScanProcessMapper scanProcessMapper;

    @Override
    public int counts() {
        return scanProcessMapper.counts();
    }

    @Override
    public int countByState(String state) {
        return scanProcessMapper.countByState(state);
    }
}
