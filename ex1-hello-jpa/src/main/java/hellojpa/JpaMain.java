package hellojpa;

import jakarta.persistence.*;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Member member = new Member();
        member.setUsername("V1");
        em.persist(member);
        tx.commit();

        em.close();
        emf.close();
    }
}
