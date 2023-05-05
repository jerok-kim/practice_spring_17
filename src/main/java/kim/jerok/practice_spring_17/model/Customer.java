package kim.jerok.practice_spring_17.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)  // 오직 hibernate를 위한 깃발
@Entity
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String tel;

    @Builder
    public Customer(Integer id, String name, String tel) {
        this.id = id;
        this.name = name;
        this.tel = tel;
    }
}
