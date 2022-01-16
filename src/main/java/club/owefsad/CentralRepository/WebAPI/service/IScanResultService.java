package club.owefsad.CentralRepository.WebAPI.service;

import club.owefsad.CentralRepository.WebAPI.entity.ScanResult;
import java.util.List;

public interface IScanResultService {

    List<ScanResult> list(ScanResult record);
}
