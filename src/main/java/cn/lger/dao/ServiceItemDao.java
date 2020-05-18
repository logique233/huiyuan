package cn.lger.dao;

import cn.lger.domain.ServiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceItemDao extends JpaRepository<ServiceItem, String> {

    List<ServiceItem> findById(Integer id);


    List<ServiceItem> findByMemberID(Integer id);


}
