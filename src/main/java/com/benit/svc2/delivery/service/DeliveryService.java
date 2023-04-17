package com.benit.svc2.delivery.service;

import com.benit.svc2.delivery.dto.DeliveryDTO;

import java.util.List;

public interface DeliveryService {

    /**
     * 배달 목록 가져오기
     * @return
     */

    public List<DeliveryDTO> getDeliveries();
}
