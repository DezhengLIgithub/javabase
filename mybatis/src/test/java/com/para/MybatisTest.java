package com.para;

import com.para.Util.DateUtil;
import com.para.entity.User;
import com.para.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


public class MybatisTest {

    SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        inputStream.close();
    }


    @Test
    public void testInsert() {
        SqlSession session = sqlSessionFactory.openSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = new User();
        user.setAccount("zheng_de_li@163.com");
        user.setEmail("zheng_de_li@163.com");
        user.setTenantId(-1l);
        user.setDescription("测试用户");
        user.setMobile("15201541822");
        user.setPassword("123456");
        user.setUsername("para");
        long now = System.currentTimeMillis();
        user.setLastLoginTime(now);
        user.setCreateTime(now);
        user.setUpdateTime(now);
        int result = userMapper.insertSelective(user);
        session.commit();
        System.out.println(result);
    }

    @Test
    public void testGet() {

    }


}
