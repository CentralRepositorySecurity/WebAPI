package club.owefsad.CentralRepository.WebAPI.controller;

import club.owefsad.CentralRepository.WebAPI.common.api.CommonPage;
import club.owefsad.CentralRepository.WebAPI.common.api.CommonResult;
import club.owefsad.CentralRepository.WebAPI.entity.ScanResult;
import club.owefsad.CentralRepository.WebAPI.service.IScanResultService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("todayRecord")
    @ResponseBody
    public CommonResult<Map<String, Object>> todayRecord() {
        Integer todayRecordCount = service.todayRecord();
        Integer totalRecordCount = service.totalRecord();
        Map<String, Object> newRecord = new HashMap<>();
        newRecord.put("title", "今日新增");
        newRecord.put("today", todayRecordCount);
        newRecord.put("total", totalRecordCount);
        newRecord.put("rate", String.format("%.2f", todayRecordCount / (totalRecordCount * 1.0)));
        return CommonResult.success(newRecord);
    }

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

    @PostMapping("/state")
    @ResponseBody
    public CommonResult<String> delete(@RequestBody ScanResult record) {
        if (record.getId() == null && record.getState() != null) {
            return CommonResult.validateFailed("数据不能为空");
        }
        Integer state = service.updateRecordState(record);
        if (state == 1) {
            return CommonResult.success("数据" + record.getId() + "的状态修改为：" + record.getState());
        } else {
            return CommonResult.failed("状态修改失败");
        }
    }
}
