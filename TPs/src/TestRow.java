import java.util.HashSet;
import java.util.Set;

public class TestRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Row> rows = new HashSet<>();
		
		rows.add( new Row (3, "FIX"));
		rows.add( new Row (2, "ISSUE"));
		rows.add( new Row (2, "MERGE"));
		rows.add( new Row (3, "PULL"));
		rows.add( new Row (3, "IOC"));
		
		
		System.out.println(rows);
	}

}
