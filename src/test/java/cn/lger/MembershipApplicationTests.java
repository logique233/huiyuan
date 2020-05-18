package cn.lger;

import cn.lger.dao.ServiceAsscessDao;
import cn.lger.dao.ServiceItemDao;
import cn.lger.domain.ServiceAsscess;
import cn.lger.domain.ServiceItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MembershipApplicationTests {

	@Autowired
	ServiceItemDao serviceItemDao;

	@Autowired
	ServiceAsscessDao serviceAsscessDao;

	@Test
	public void contextLoads() {
        ServiceItem serviceItem = new ServiceItem();
        serviceItem.setId(123);
        serviceItem.setCreatetime(new Date());
        serviceItem.setServiceItem("usahdi");
        serviceItemDao.save(serviceItem);
	}


	@Test
	public void page() {
		Pageable pageable = PageRequest.of(0,5);
		Page<ServiceAsscess> serviceAsscess = serviceAsscessDao.findAll(pageable);
		List<ServiceAsscess> servicelist = serviceAsscess.getContent();
		for (ServiceAsscess li :
				servicelist) {
			System.out.println(li);

		}
	}

}
