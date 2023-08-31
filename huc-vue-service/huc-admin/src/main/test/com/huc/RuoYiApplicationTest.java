package com.huc;

import com.alibaba.fastjson2.JSON;
import com.huc.business.service.ITTestInfoService;
import com.huc.business.vo.TTestInfoVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class hucApplicationTest {

    @Autowired
    private ITTestInfoService testInfoService;

    @Test
    public void test() {
    }
}
