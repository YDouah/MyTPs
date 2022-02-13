
public class Row {
	
	private int number;
	private String content;
	
	
	@Override
	public boolean equals(Object o) {
		
		Row row = (Row) o;
		return content.length() == row.content.length();	
				
	}
	
	@Override
	public int hashCode() {
		
		return number+content.length();
		
	}

	@Override
	public String toString() {
		return "Row [number=" + number + ", content=" + content + "]";
	}

	public Row(int number, String content) {
		super();
		this.number = number;
		this.content = content;
	}
	
	
	
	

}
