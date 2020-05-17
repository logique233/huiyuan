package cn.lger.service;

import cn.lger.dao.ServiceAsscessDao;
import cn.lger.domain.ServiceAsscess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ServiceAsscessService {

    @Autowired
    ServiceAsscessDao serviceAsscessDao;

    public void save(ServiceAsscess serviceAsscess) {
        serviceAsscessDao.save(serviceAsscess);
    }

    public Page<ServiceAsscess> getAll(Pageable pageable) {
        return serviceAsscessDao.findAll(pageable);
    }

}
