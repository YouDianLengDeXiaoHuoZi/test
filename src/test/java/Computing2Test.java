import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Computing2Test {

    @Before
    public void setUp() throws Exception {
        System.out.println("单元测试开始！");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("单元测试结束！");
    }

    @Test
    public void zhangsan() {
        Computing c = new Computing();
        assertEquals("张三是童工", c.zhangsan(17, "1000"));
        assertEquals("张三", c.zhangsan(20, "1000"));
    }

    @Test
    public void lisi() {
        Computing c = new Computing();
        assertEquals("李四已退休", c.lisi(61, "1000"));
        assertEquals("李四", c.lisi(20, "1000"));
    }
}