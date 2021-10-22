package exception;

import java.io.IOException;

public class TestExceptionPrapagation2 {
	public void m() throws IOException {
		throw new IOException();
	}

	/**
	 * n() is the consumer m()
	 * @throws IOException 
	 */
	public void n() throws IOException {
		m();
	}


	public void p() {

		try {
			n();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public static void main(String[] args) {

		TestExceptionPrapagation2 tp2 = new TestExceptionPrapagation2();
		tp2.p();

	}


}
