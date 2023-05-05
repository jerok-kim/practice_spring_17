package kim.jerok.practice_spring_17.model;

import org.springframework.data.jpa.repository.JpaRepository;

// JPA의 기본 메서드 테스트할 필요 없다
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
