
import com.deppon.foss.module.pickup.pricing.api.server.service.IProductService;
import com.deppon.foss.module.pickup.pricing.api.shared.domain.ProductEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 343617 on 2017/2/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/dubbo-spring-test.xml")
public class TestDemo01 {

    @Resource
    private IProductService productService;

    @Test
    public void test01() {
//        ProductEntity productById = productService.findProductById("123");
//        System.out.println(productById);
//        Date lastModifyTime = productService.getLastModifyTime();
//        System.out.println(lastModifyTime);
        List<ProductEntity> productEntities = productService.queryLevel2ProductInfo();
        for (ProductEntity productEntity : productEntities) {
            System.out.println(productEntity.getName());
        }
    }
}
