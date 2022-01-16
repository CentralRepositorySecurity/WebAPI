package club.owefsad.CentralRepository.WebAPI.controller;

import club.owefsad.CentralRepository.WebAPI.service.IScanProcessService;
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

    @GetMapping("/count")
    @ResponseBody
    public String count() {
        int counts = service.counts();
        return "";
    }

    @GetMapping("/count/{state}")
    @ResponseBody
    public String countByState(@PathVariable("state") String state) {
        int counts = service.countByState(state);
        return "";
    }


}
