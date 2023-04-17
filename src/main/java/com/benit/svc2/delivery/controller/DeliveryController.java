package com.benit.svc2.delivery.controller;

import com.benit.svc2.delivery.dto.DeliveryDTO;
import com.benit.svc2.delivery.service.DeliveryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;        // 서비스 빈(bean) 자동 주입

    /**
     * 배달(Delivery) 목록 제공 컨트롤러
     * @return
     */

    @GetMapping("/deliveries")
    public List<DeliveryDTO> deliveries() {

        //1. 배달 목록 가져오기
        var deliveryList = deliveryService.getDeliveries();

        //2. 로그출력
        deliveryList.forEach( deliveryDTO -> log.info("- {}", deliveryDTO) );

        //3. 리턴
        return deliveryList;
    }
}
