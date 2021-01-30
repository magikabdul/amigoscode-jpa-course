package cloud.cholewa.amigoscodejpa;

import cloud.cholewa.amigoscodejpa.student.entity.Student;
import cloud.cholewa.amigoscodejpa.student.repository.StudentRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;

import java.util.Locale;

@SpringBootApplication
public class AmigoscodeJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmigoscodeJpaApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
//        return args -> {
//        Faker faker = new Faker(new Locale("pl"));
//
//            for (int i = 0; i < 100; i++) {
//                String firstName = faker.name().firstName();
//                String lastName = faker.name().lastName();
//
//                Student student = new Student();
//                student.setFirstName(firstName);
//                student.setLastName(lastName);
//                student.setEmail(firstName + "." + lastName + "@example.pl");
//                student.setAge(faker.number().numberBetween(20, 60));
//
//                studentRepository.save(student);
//            }
//        };
//    }
}
