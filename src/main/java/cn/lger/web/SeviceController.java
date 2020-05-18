package cn.lger.web;

import cn.lger.dao.ServiceAsscessDao;
import cn.lger.dao.ServiceItemDao;
import cn.lger.domain.ServiceAsscess;
import cn.lger.domain.ServiceItem;
import cn.lger.service.ServiceAsscessService;
import cn.lger.service.ServiceItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Controller
public class SeviceController {

    @Autowired
    ServiceItemService serviceItemService;

    @Autowired
    ServiceAsscessService serviceAsscessService;

    @GetMapping("/serviceItem")
    public String getServiceItem() {
        return "serviceItem";
    }

    @GetMapping("/serviceBack")
    public String getServiceBack() {
        return "serviceBack";
    }

    @GetMapping("/serviceOrder")
    public String getServiceOrder() {
        return "serviceOrder";
    }

    @GetMapping("/serviceFeedback")
    public String getServiceFeedback() {
        return "serviceFeedback";
    }


    @RequestMapping("/saveitem")
    @PutMapping
    @ResponseBody
    public String saveItem(String id, @RequestParam(value = "list[]") String[] list) {

        try {
            for (String item :
                    list) {
                ServiceItem serviceItem = new ServiceItem();
                serviceItem.setMemberID(id);
                serviceItem.setServiceItem(item);
                serviceItem.setCreatetime(new Date());
                serviceItemService.save(serviceItem);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "失败";
        }
        return "成功";
    }


    @RequestMapping("/queryItem")
    @PutMapping
    @ResponseBody
    public List<ServiceItem> queryItem(int id) {
        List<ServiceItem> result = new ArrayList<>();

        try {
            result = serviceItemService.findbyid(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    @RequestMapping("/saveAsscess")
    @PutMapping
    @ResponseBody
    public String saveAsscess(String level, String asscess) {
        try {
            ServiceAsscess serviceAsscess = new ServiceAsscess();
            serviceAsscess.setServiceLevel(level);
            serviceAsscess.setServiceAsscess(asscess);
            serviceAsscess.setCreatetime(new Date());
            serviceAsscessService.save(serviceAsscess);
        } catch (Exception e) {
            e.printStackTrace();
            return "shibai";
        }
        return "成功";
    }


    @RequestMapping("/pageAsscess")
    @PutMapping
    @ResponseBody
    public HashMap<String, Object> queryAsscess(String order,int offset,int limit,String search) {
        HashMap<String, Object> result = new HashMap<>();
        try {
            Pageable pageable = PageRequest.of(offset-1,limit);
            Page<ServiceAsscess> serviceAsscess = serviceAsscessService.getAll(pageable);
            int count = (int) serviceAsscess.getTotalElements();
            List<ServiceAsscess> list = serviceAsscess.getContent();
            result.put("total", count);
            result.put("rows", list);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


}
