package hello.core.autowired;

import hello.core.AutoAppConfig;
import hello.core.discount.DiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;

public class AllBeanTest {

    @Test
    void findAllBean(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class, DiscountService.class);
        DiscountService discountService = ac.getBean(DiscountService.class);
        Member member = new Member(1L, "userA", Grade.VIP);
//        int discountPrice = discountService.discount(member, 10000, "fixDiscountPolicy");
//        Assertions.assertThat(discountService).isInstanceOf(DiscountService.class);
//        Assertions.assertThat(discountPrice).isEqualTo(1000);

    }

    static class DiscountService{
        private final Map<String, DiscountPolicy> policyMap;
        private final List<DiscountPolicy> policyes;

        public DiscountService(Map<String, DiscountPolicy> policyMap, List<DiscountPolicy> policyes) {
            this.policyMap = policyMap;
            this.policyes = policyes;
            System.out.println("policyMap = " + policyMap);
            System.out.println("policyes = " + policyes);

        }
//        public DiscountPolicy discount(Member member, int price, String disccountCode){
//            DiscountPolicy discountPolicy = policyMap.get(disccountCode);
//        }
    }

}
