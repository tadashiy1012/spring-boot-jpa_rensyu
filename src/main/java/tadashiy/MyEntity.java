package tadashiy;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table(name="value")
public class MyEntity {
  @Id @GeneratedValue
  public Long id;
  public String value;
  public MyEntity() {}
  public MyEntity(String value) {
    this.value = value;
  }
  @Override
  public String toString() {
    return "MyEntity [id=" + id + ", value=" + value + "]";
  }
}