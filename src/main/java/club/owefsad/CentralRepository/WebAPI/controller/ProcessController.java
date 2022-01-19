package club.owefsad.CentralRepository.WebAPI.controller;

import club.owefsad.CentralRepository.WebAPI.common.api.CommonResult;
import club.owefsad.CentralRepository.WebAPI.service.IScanProcessService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/process")
public class ProcessController {

    @Autowired
    private IScanProcessService service;

    @GetMapping("/total")
    @ResponseBody
    public CommonResult<Map<String, Object>> count() {
        Integer counts = service.counts();
        Map<String, Object> result = new HashMap<>();
        result.put("title", "任务总量");
        result.put("value", counts);
        return CommonResult.success(result);
    }

    @GetMapping("/count/{state}")
    @ResponseBody
    public String countByState(@PathVariable("state") String state) {
        int counts = service.countByState(state);
        return "" + counts;
    }


}
