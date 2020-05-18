package cn.lger.domain;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class ServiceAsscess {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String serviceLevel;

    private String serviceAsscess;

    @CreationTimestamp
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public String getServiceAsscess() {
        return serviceAsscess;
    }

    public void setServiceAsscess(String serviceAsscess) {
        this.serviceAsscess = serviceAsscess;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "ServiceAsscessDao{" +
                "id=" + id +
                ", serviceLevel='" + serviceLevel + '\'' +
                ", serviceAsscess='" + serviceAsscess + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}
