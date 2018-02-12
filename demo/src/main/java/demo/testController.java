package demo;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiyeon on 15. 9. 6..
 */
@RestController
public class testController {

    @Autowired
    DozerBeanMapper dozerBeanMapper;

    static Mapper mapper = new DozerBeanMapper();

    @RequestMapping("/test")
    public EmployeeB test(){
        EmployeeA employeeA = new EmployeeA();
        employeeA.setLastName("purini");
        employeeA.setFirstName("kiran");
        employeeA.setBirthday(new DateTime("1989-12-28"));

        EmployeeB employee = dozerBeanMapper.map(employeeA, EmployeeB.class);
//        EmployeeB employee = mapper.map(employeeA, EmployeeB.class);

        return employee;
    }

}
