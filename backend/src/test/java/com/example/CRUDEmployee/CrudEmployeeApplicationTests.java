package com.example.CRUDEmployee;

import com.example.CRUDEmployee.controller.EmployeeControllerTests;
import com.example.CRUDEmployee.repository.EmployeeRepositoryTests;
import com.example.CRUDEmployee.service.EmployeeServiceTest;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//@SpringBootTest
@RunWith(Suite.class)
@Suite.SuiteClasses({
		EmployeeServiceTest.class,
		EmployeeControllerTests.class,
		EmployeeRepositoryTests.class
})
class CrudEmployeeApplicationTests {

	@Test
	void contextLoads() {
	}

}
