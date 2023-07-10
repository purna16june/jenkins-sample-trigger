public class Client {

	public static void main(String[] args) {
		JenkinsInterface j1 = new JenkinsClass1();
		j1.defaultMethod();
		j1.method1();
		
		JenkinsInterface j2 = new JenkinsClass2();
		j2.defaultMethod();
		j2.method1();

	}

}
