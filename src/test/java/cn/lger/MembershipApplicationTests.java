package cn.lger;

import cn.lger.dao.CommodityDao;
import cn.lger.dao.ServiceAsscessDao;
import cn.lger.dao.ServiceItemDao;
import cn.lger.domain.Commodity;
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
	CommodityDao commodityDao;

	@Test
	public void test() {
		Commodity ddd = commodityDao.findCommodityByCommodityName("英国蛋糕");
		System.out.println("ddd = " + ddd);
	}

}
