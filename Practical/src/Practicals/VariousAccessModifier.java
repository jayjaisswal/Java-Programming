package Practicals;
	
	class AccessModifiers {
	    public String publicField = "Public Field";
	    private String privateField = "Private Field";
	    protected String protectedField = "Protected Field";
	    String defaultField = "Default Field"; // package-private

	    public void showFields() {
	        System.out.println(publicField);
	        System.out.println(privateField);
	        System.out.println(protectedField);
	        System.out.println(defaultField);
	    }
	}

	public class VariousAccessModifier {
	    public static void main(String[] args) {
	        AccessModifiers am = new AccessModifiers();
	        am.showFields();
	        
	        // Accessing fields from outside the class
	        System.out.println(am.publicField); // Accessible
	        // System.out.println(am.privateField); // Not accessible
	        // System.out.println(am.protectedField); // Not accessible
	        // System.out.println(am.defaultField); // Not accessible if in a different package
	    }
	}



