package myOwn;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

public class MyCustomTask extends Task{
	

	@Override
	public void execute() throws BuildException {
		log("Hello from custom tag example!");
	}
	

}
