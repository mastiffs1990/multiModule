package prj.com.it;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Result result = JUnitCore.runClasses(MoltiplicatoreTest.class);
		    
		 int error = result.getFailureCount();
		 if ( error == 0 )
		 {
			 System.out.println("Tutto ok!");
		 }
		 else
		 {
			 for (Failure failure : result.getFailures()) {
		      System.out.println(failure.toString());
			 }
		 }
	}

}
