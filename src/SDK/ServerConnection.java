package SDK;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
/**
 * Created by Peter on 03-12-2015.
 */

//class which will make it possible to connect to the server
public class ServerConnection {

    //constructor
    public ServerConnection(){
        //giving hostAddress and port the same values as the server, so that they can connect
        this.hostAddress="http://localhost";
        this.port=8888;
        }

    //declaring instance variables
    private String hostAddress;
    private int port;


    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getHostAddress() {
        return hostAddress;
    }

    public int getPort() {
        return port;
    }

    /*creating methods for get, delete, post and put, so that it will be able to send and recieve data to the server
    and the API can use them*/
    public String get(String path){

        Client client = Client.create();

        WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
        ClientResponse response = webResource.type("application/json").get(ClientResponse.class);

        String output = response.getEntity(String.class);
        System.out.println(output);

        return output;

    }

    public String delete(String path){

        Client client = Client.create();

        WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
        ClientResponse response = webResource.type("application/json").delete(ClientResponse.class);

        String output = response.getEntity(String.class);
        System.out.println(output);

        return output;

    }

    public String post(String json, String path){

        Client client = Client.create();

        WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
        ClientResponse response = webResource.type("application/json").post(ClientResponse.class, json);

        String output = response.getEntity(String.class);
        System.out.println(output);

        return output;

    }

    public String put(String json, String path){

        Client client = Client.create();

        WebResource webResource = client.resource(getHostAddress() + ":" + getPort() + "/api/" + path);
        ClientResponse response = webResource.type("application/json").put(ClientResponse.class, json);

        String output = response.getEntity(String.class);
        System.out.println(output);

        return output;

    }
}