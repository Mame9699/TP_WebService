import ws.BanqueService;

import javax.xml.ws.Endpoint;

public class ServeuJaxWS {
    public static void main (String[] args ){
        String url ="http://0.0.0.0:8686/";
        Endpoint.publish(url,new BanqueService());
        System.out.println(" web service déployé " +url);
    }


}
