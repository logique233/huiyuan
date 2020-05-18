package cn.lger.domain;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class ServiceItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String memberID;

    private String serviceItem;

    @CreationTimestamp
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    private Date createtime;

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceItem() {
        return serviceItem;
    }

    public void setServiceItem(String serviceItem) {
        this.serviceItem = serviceItem;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "ServiceItem{" +
                "id=" + id +
                ", serviceItem='" + serviceItem + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}
