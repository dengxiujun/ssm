package com.ssm.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>标题: JUnitDaoBase.java</p>
 * <p>说明: </p>
 * <p>版本: Copyright (c) 2016年8月15日</p>
 * <p>公司: </p>
 * <p>创建: 2016年8月15日
 * @author DengXiuJun
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:springmvc.xml",
        "classpath:mybatisConfig.xml",
        "classpath:applicationContext*.xml"
})
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class JUnitDaoBase {

    @BeforeClass
    public static void setUp() {
        // init context environment
    }

    @AfterClass
    public static void tearDown() {
        // clean context environment
    }

}