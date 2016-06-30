package tadashiy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class MyService {
  @Autowired
  private MyEntityRepository repo;
  @Transactional
  public void save(String value) {
    MyEntity e = new MyEntity(value);
    this.repo.save(e);
  }
  public void find() {
    this.repo.findAll().forEach(System.out::println);
  }
}