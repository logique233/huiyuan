package cn.lger.dao;

import cn.lger.domain.ServiceAsscess;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceAsscessDao extends JpaRepository<ServiceAsscess,String> {

    @Override
    List<ServiceAsscess> findAll();
}
