package tws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 功能描述 : TODO
 *
 * @Author : 王辉
 * @Email : wanghui16@zybank.com.cn
 * @Date : 2019-08-29 11:13
 */
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping
    public ResponseEntity<List<Employee>> getEmployees(){
        List<Employee> employees = employeeMapper.findAll();

        return ResponseEntity.ok(employees);
    }

    @PostMapping
    public ResponseEntity<List<Employee>> postEmployess(@RequestBody Employee employee){
        employeeMapper.insert(employee);

        List<Employee> employees = employeeMapper.findAll();
        return ResponseEntity.ok(employees);
    }
}
