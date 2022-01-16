package club.owefsad.CentralRepository.WebAPI.controller;

import club.owefsad.CentralRepository.WebAPI.entity.ScanResult;
import club.owefsad.CentralRepository.WebAPI.service.IScanResultService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/result")
public class ResultController {

    @Autowired
    private IScanResultService service;

    @GetMapping("/list")
    @ResponseBody
    public List<ScanResult> list(ScanResult record) {
        return service.list(record);
    }
}
