/**
 * 
 */
package helloworlddemo.main;

/**
 * @author Lenovo
 *
 */
public class AddressMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Address address = new Address();
		address.setCity("Indore");
		address.setHousename("Geeta Bhawan");
		address.setHouseno(60);
		address.setStreet("MG road");
		
		System.out.println(address.getHouseno());
		System.out.println(address.getHousename());
		System.out.println(address.getStreet());
		System.out.println(address.getCity());

	}

}
