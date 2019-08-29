package tws;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述 : TODO
 *
 * @Author : 王辉
 * @Email : wanghui16@zybank.com.cn
 * @Date : 2019-08-29 11:10
 */
@Service
@Mapper
public interface EmployeeMapper {

    public List<Employee> findAll();



    public void insert(Employee employee);
}
