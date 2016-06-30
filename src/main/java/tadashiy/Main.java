package tadashiy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {
  public static void main(String[] args) {
    try (ConfigurableApplicationContext ctx = SpringApplication.run(Main.class, args)) {
      Main m = ctx.getBean(Main.class);
      m.method();
      MyService service = ctx.getBean(MyService.class);
      service.save("piyopiyo");
      service.find();
    }
  }
  @Autowired
  private MyEntityRepository repo;
  public void method() {
    this.repo.findAll().forEach(System.out::println);
    this.repo.findById((long)1).forEach(System.out::println);
    this.repo.findByValueLike("hoge").forEach(System.out::println);
    this.repo.findEvenIdEntities().forEach(System.out::println);
  }
}