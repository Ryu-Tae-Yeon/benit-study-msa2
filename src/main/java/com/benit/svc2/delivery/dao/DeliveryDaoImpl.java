package com.benit.svc2.delivery.dao;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class DeliveryDaoImpl implements DeliveryDao{

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    /**
     * DB로부터 현재시간 가져오기
     * @return
     */
    public String getNowDate() {

        String now = sqlSessionTemplate.selectOne("query.delivery.getNowDate");
        log.info(" DB서버에서 조회한 현재시각 : {}", now);

        return now;
    }
}
