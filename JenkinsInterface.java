

public interface JenkinsInterface {
	
	public void method1();
	
	public default void defaultMethod() {
        System.out.println("I am default method");
    }

}
