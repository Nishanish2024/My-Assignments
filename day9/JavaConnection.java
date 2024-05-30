package assignments.day9;

public class JavaConnection implements DatabaseConnection{

	public static void main(String[] args) {
		JavaConnection java= new JavaConnection();
		System.out.println("========Java Connection==========");
		java.connect();
		java.disconnect();
		java.executeUpdate();
	}

	public void connect() {
		System.out.println("Database Connected successfully....");
	}

	public void disconnect() {

		System.out.println("Database disconnected successfully....");
	}

	public void executeUpdate() {
		System.out.println("Database Updated successfully....");
	}

}
