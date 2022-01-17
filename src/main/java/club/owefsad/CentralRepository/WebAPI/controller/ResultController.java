package club.owefsad.CentralRepository.WebAPI.controller;

import club.owefsad.CentralRepository.WebAPI.common.api.CommonPage;
import club.owefsad.CentralRepository.WebAPI.common.api.CommonResult;
import club.owefsad.CentralRepository.WebAPI.entity.ScanResult;
import club.owefsad.CentralRepository.WebAPI.service.IScanResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author owefsad
 */
@RestController
@RequestMapping("/result")
public class ResultController {

    @Autowired
    private IScanResultService service;

    @GetMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<ScanResult>> list(ScanResult record, Integer page, Integer pageSize) {
        if (page == null) {
            page = 0;
        }
        if (pageSize == null || pageSize > 50 || pageSize <= 0) {
            pageSize = 50;
        }
        return CommonResult.success(CommonPage.restPage(service.list(record, page, pageSize)), "查询成功");
    }

    @PostMapping("/state/{id}/delete")
    @ResponseBody
    public String delete(@PathVariable("id") Integer id) {
        if (id == null) {

        }
        return "";
    }
}
