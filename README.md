## [최주호] 스프링 강의

Spring Boot의 JpaRepository는 JPA의 기본 메서드 외에도 CRUD(create, read, update, delete) 기능을 제공하는 메서드를 제공한다.

JpaRepository는 이러한 메서드를 제공함으로써 개발자가 데이터 액세스 코드를 더욱 간편하게 작성할 수 있게 한다.

1. 저장/갱신 관련 메서드
    - `save(S entity)`: 엔티티를 저장하고 반환한다.
    - `saveAll(Iterable<S> entities)`: 여러 개의 엔티티를 저장하고 반환한다.
2. 조회 관련 메서드
    - `findById(ID id)`: 주어진 기본 키로 엔티티를 검색한다.
    - `findAll()`: 모든 엔티티를 검색한다.
    - `findAllById(Iterable<ID> ids)`: 주어진 기본 키 목록으로 엔티티를 검색한다.
    - `count()`: 엔티티의 총 개수를 반환한다.
3. 삭제 관련 메서드
    - `deleteById(ID id)`: 주어진 기본 키로 엔티티를 삭제한다.
    - `delete(T entity)`: 주어진 엔티티를 삭제한다.
    - `deleteAll()`: 모든 엔티티를 삭제한다.
