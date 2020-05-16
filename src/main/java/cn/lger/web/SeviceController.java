package cn.lger.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SeviceController {

    @GetMapping("/serviceItem")
    public String getServiceItem(){
        return "serviceItem";
    }

    @GetMapping("/serviceBack")
    public String getServiceBack(){
        return "serviceBack";
    }

    @GetMapping("/serviceOrder")
    public String getServiceOrder(){
        return "serviceOrder";
    }

    @GetMapping("/serviceFeedback")
    public String getServiceFeedback(){
        return "serviceFeedback";
    }


}
