package com.benit.svc2.delivery.service;

import com.benit.svc2.delivery.dao.DeliveryDao;
import com.benit.svc2.delivery.dto.DeliveryDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class DeliveryServiceImpl implements DeliveryService {

    //DAO 빈 생성자 주입
    private final DeliveryDao deliveryDao;

    /**
     * 배달 목록 가져오기
     */

    @Override
    public List<DeliveryDTO> getDeliveries() {

        //DAO 호출 테스트
        log.info("[DeliveryDao.getNowDate()] => {}", deliveryDao.getNowDate());

        List<DeliveryDTO> resultList = new ArrayList<>();

        resultList.add(
                DeliveryDTO.builder()
                        .companyName("배달의민족")
                        .company_tel("070-1212-3434")
                        .courier("최배달")
                        .courier_tel("010-5959-8282")
                        .requestStore("BHC치킨 여의도점")
                        .shippingAddress("서울시 영등포구 여의나루로 76")
                        .orderer("홍길동")
                        .orderer_tel("010-1234-5678")
                        .status("0")
                        .build()
        );

        resultList.add(
                DeliveryDTO.builder()
                        .companyName("요기요")
                        .company_tel("080-2354-5977")
                        .courier("홍반장")
                        .courier_tel("010-5858-8282")
                        .requestStore("원할머니 보쌈 여의도점")
                        .shippingAddress("서울시 영등포구 여의나루로 76")
                        .orderer("홍길동")
                        .orderer_tel("010-1234-5678")
                        .status("1")
                        .build()
        );

        resultList.add(
                DeliveryDTO.builder()
                            .companyName("쿠팡이츠")
                            .company_tel("080-1111-3247")
                            .courier("쿠팡맨")
                            .courier_tel("010-9898-9898")
                            .requestStore("Subway 여의도점")
                            .shippingAddress("서울시 영등포구 여의나루로 76")
                            .orderer("홍길동")
                            .orderer_tel("010-1234-5678")
                            .status("2")
                        .build()
        );

        log.info("배달 목록 : {}", resultList);

        return resultList;
    }
}
