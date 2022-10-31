package commencis.hr.EmployeeManagement.EmployeeService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;

import org.apache.logging.log4j.*;
   
@RestController
public class EmployeeTestController {    
    
    Logger myLogger = LogManager.getLogger(EmployeeTestController.class);    

    @GetMapping("test")
    public String test() {                
        
        myLogger.log(Level.INFO, "--------------------------------");
        myLogger.log(Level.INFO, "EMPLOYEE -->>  TESTTTTT");
        myLogger.log(Level.INFO, "--------------------------------");
        
        return "EMPLOYEE -->> OK... Done : " + LocalDate.now();

    }  
}

