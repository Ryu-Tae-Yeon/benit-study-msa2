package com.benit.svc2.delivery.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class DeliveryDTO {

    String companyName;     //배달업체명
    String company_tel;     //전화번호
    String courier;         //배달원
    String courier_tel;     //배달원_연락처
    String requestStore;    //요청업체
    String shippingAddress; //배송지
    String orderer;         //주문자
    String orderer_tel;     //주문자_연락처
    String status;          //배송상태 (0:픽업전, 1:배송중, 2:배송완료)

}
