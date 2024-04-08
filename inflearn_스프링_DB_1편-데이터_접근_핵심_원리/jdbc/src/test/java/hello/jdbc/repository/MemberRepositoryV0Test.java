package hello.jdbc.repository;

import hello.jdbc.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

@Slf4j
public class MemberRepositoryV0Test {

    MemberRepositoryV0 repositoryV0 = new MemberRepositoryV0();

    @Test
    void crud() throws SQLException{
        Member member =new Member("memberV2", 10000);
        repositoryV0.save(member);

        //findById
        Member findMember = repositoryV0.findById(member.getMemberId());
        log.info("findMember={}",findMember);
        Assertions.assertThat(findMember).isEqualTo(member);
    }
}
