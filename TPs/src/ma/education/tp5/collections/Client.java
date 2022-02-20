package ma.education.tp5.collections;

public class Client{
	Integer code;
	String name;
	
	Client(Integer code, String name){
		this.code = code;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Client {" + 
				"code=" + code + 
				", name='" + name + '\'' +
				'}';
		
	}
	
	public boolean equals(Object o) {
		Client client = (Client) o;
		return this.code==client.code && this.name.equals(client.name);
		}
		
	public int hashCode() {
		return code;
		}
	
	public int compareTo(Object o) {
		Client client = (Client) o;
		return -client.code+this.code;
		}
}
