package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by 343617 on 2017/3/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={MyConfig.class})
public class MyTest01 {

    @Resource(name = "myCDPlayer")
    private ComDisc disc;

    @Test
    public void test01(){
        disc.play();
    }
}
