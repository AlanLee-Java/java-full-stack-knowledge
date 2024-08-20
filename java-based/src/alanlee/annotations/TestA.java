package alanlee.annotations;

import java.util.ArrayList;
import java.util.List;

/**
 * Java内置注解
 *
 * @author AlanLee
 * @date 2024-08-20
 */
public class TestA {

    public void test() {

    }

}

class B extends TestA {

    /**
     * 重写父类的test方法
     */
    @Override
    public void test() {
    }

    /**
     * 被弃用的方法
     */
    @Deprecated
    public void oldMethod() {
    }

    /**
     * 忽略告警
     *
     * @return
     */
    @SuppressWarnings("rawtypes")
    public List processList() {
        List list = new ArrayList();
        return list;
    }

}