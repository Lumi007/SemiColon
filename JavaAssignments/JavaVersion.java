
public class JavaVersion {
	public static void main(String[] args){
	

	String javaVersion = System.getProperty("java.version");
	String javaRuntime = System.getProperty("java.runtime.version");
	String javaHome = System.getProperty("java.home");
	String javaVendor = System.getProperty("java.vendor");
	String javaClassPath = System.getProperty("java.class.path");
	String javaVendorUrl = System.getProperty("java.vendor.url");

	
	System.out.println("Java Version : " +javaVersion);
	System.out.println("Java Runtime: " +javaRuntime);
	System.out.println("Java Home: " +javaHome);
	System.out.println("Java Vendor :" +javaVendor);
	System.out.println("Java Class Path: " +javaClassPath);
	System.out.println("Java Vendor Url : " +javaVendorUrl);
	

	}


}
