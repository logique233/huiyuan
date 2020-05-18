package cn.lger.service;

import cn.lger.dao.ServiceItemDao;
import cn.lger.domain.ServiceItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceItemService {
    @Autowired
    ServiceItemDao serviceItemDao;

    public void save(ServiceItem serviceItem) {
        serviceItemDao.save(serviceItem);
    }

    public List<ServiceItem> findbyid(String id) {
        return serviceItemDao.findByMemberID(id);
    }

}
