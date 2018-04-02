package StudentsLaboratoriesMV;

import StudentsLaboratoriesMV.controller.LaboratoriesController;
import StudentsLaboratoriesMV.model.Laboratory;
import StudentsLaboratoriesMV.model.Student;
import StudentsLaboratoriesMV.validator.Validator;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

	@Test
	public void test1() {
		Laboratory lab = new Laboratory();
		Validator val = new Validator();
		LaboratoriesController ctrl = new LaboratoriesController("students.txt","laboratories.txt");
		
		lab.setDate(new Date());
		lab.setGrade(10);
		lab.setNumber(3);
		lab.setProblemNumber(-1);
		lab.setStudentRegNumber("tiie2033");
		
		
        assertEquals(false, val.validateLaboratory(lab));
        assertEquals(false, ctrl.saveLaboratory(lab));
      
    }
	
	@Test
	public void test2() {
		Student std = new Student();
		Validator val = new Validator();
		LaboratoriesController ctrl = new LaboratoriesController("students.txt","laboratories.txt");
        
		std.setGroup(933);
		std.setName("ale232432");
		std.setRegNumber("tiie2033");
		
        assertEquals(false, val.validateStudent(std));
        assertEquals(false, ctrl.saveStudent(std));
    }
	

}
