package assignments.day9;

public interface DatabaseConnection {
	public void connect();
	public void disconnect();
	public void executeUpdate(); 
}
