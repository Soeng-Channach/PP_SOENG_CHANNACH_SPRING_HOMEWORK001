package com.example.pp_soeng_channach_spring_hw1;

import com.example.pp_soeng_channach_spring_hw1.entity.Employee;
import com.example.pp_soeng_channach_spring_hw1.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Date;

@SpringBootApplication
@Data
@AllArgsConstructor
@RestController("")

public class PpSoengChannachSpringHw1Application {
    private final EmployeeRepository employeeRepository;
    static   Employee employee =new Employee("Dara","Kok",new Date(System.currentTimeMillis()),"kokdara@gmail.com");
    @GetMapping("/insert")

        public String insertData(){
            employeeRepository.insertData(employee);
            return "Data Inserted Successfully.";
        }
    @GetMapping("/detach")
        public String detachData(){
            employeeRepository.detachData(employee);
            return "Data Detached Successfully";
        }

    @GetMapping("/merge")
        public String mergeData(){
            employeeRepository.mergeData(employee);
            return "Data Merged Successfully";
    }

    @GetMapping("/flush")
        public String flushData(){
            employeeRepository.flushData(employee);
            return "Data Flushed Successfully";
    }

    @GetMapping("/find/{id}")
        public String findEmById(@PathVariable Long id){
            employeeRepository.findEmById(id);
            return "Find Employee By Id Successfully";
    }

    @GetMapping("/remove")
        public String removeData(){
            employeeRepository.removeData(employee);
            return "Data Remove Successfully";
    }

    public static void main(String[] args) {
            SpringApplication.run(PpSoengChannachSpringHw1Application.class, args);
    }

}
