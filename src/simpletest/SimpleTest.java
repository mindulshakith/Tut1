package simpletest;


public class SimpleTest {
    public static void main(String[] args) {
        SimpleTest test = new SimpleTest();
        test.execute();
    }
    public void execute(){
        DummyServer server = new DummyServer();
        System.out.println("Attenpting to call testConnection. ");
        String recieved = server.testConnection();
        System.out.println("Recieved the value : " +"[" + recieved + "]" + "from the server. ");

        if ((recieved != null) && (recieved.equals("Connection Succeeded") == true)){

        }else {
            System.out.println("System failed.");
        }
    }
    }

