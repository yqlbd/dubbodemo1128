package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by 343617 on 2017/3/13.
 * 实现接口的类
 */

@Component("myCDPlayer")
public class MyCDPlayer implements ComDisc {
    @Override
    public void play() {
        System.out.println("CD is play now!");
    }
}
