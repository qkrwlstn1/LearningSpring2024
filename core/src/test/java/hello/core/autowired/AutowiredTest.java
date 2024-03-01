package hello.core.autowired;

import hello.core.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class AutowiredTest {

    @Test
    void AutowiredOption() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);

    }

    static class TestBean{
        //Member가 빈으로 등록되어 있지 않기 때문에 빨간 줄이 그어졌다 하지만 빈에 등록돼있지 않은 경우를 처리해 주었기 때문에 컴파일 시 익셉션은 나오지 않는다
         @Autowired(required = false)
        public void setNoBean1(Member member){
            System.out.println("member1 = "+member);
        }
        @Autowired
        public void setNoBean2(@Nullable Member member){
            System.out.println("member2 = "+member);
        }
        @Autowired
        public void setNoBean3(Optional<Member> member){
            System.out.println("member3 = "+member);
        }
    }

}
