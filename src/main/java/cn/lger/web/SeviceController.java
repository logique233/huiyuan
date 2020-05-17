package cn.lger.web;

import cn.lger.dao.ServiceAsscessDao;
import cn.lger.dao.ServiceItemDao;
import cn.lger.domain.ServiceItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class SeviceController {

    @Autowired
    ServiceItemDao serviceItemDao;

    @Autowired
    ServiceAsscessDao serviceAsscessDao;

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


    @RequestMapping("/saveitem")
    @PutMapping
    @ResponseBody
    public String saveItem(String id, List<String> list) {
        try {
            for (String item :
                    list) {
                ServiceItem serviceItem = new ServiceItem();
                serviceItem.setServiceItem(item);
                serviceItem.setCreatetime(new Date());
                serviceItemDao.save(serviceItem);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "失败";
        }
        return "成功";
    }

}
