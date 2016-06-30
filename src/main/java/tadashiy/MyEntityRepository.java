package tadashiy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MyEntityRepository extends JpaRepository<MyEntity, Long> {
  List<MyEntity> findById(Long id);
  List<MyEntity> findByValueLike(String value);
  List<MyEntity> findByValueIgnoreCase(String value);
  List<MyEntity> findByIdAndValueLike(Long id, String value);
  List<MyEntity> findByIdOrValue(Long id, String value);
  long countByValueLike(String value);
  @Query("SELECT e FROM MyEntity e WHERE (e.id % 2) = 0")
  List<MyEntity> findEvenIdEntities();
}