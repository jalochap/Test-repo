package test;

import java.io.IOException;

public class ProcessExecTest {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Process p = Runtime.getRuntime().exec("cmd.exe /k echo TEST");
		Thread.sleep(3000);
		System.out.println(p.exitValue());

	}

}
