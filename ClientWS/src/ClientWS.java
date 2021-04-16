import ev.BanqueService;
import ev.BanqueWS;
import ev.Compte;

import java.util.List;

public class ClientWS {
    public static void main (String[] args){
        BanqueService stubWs=new BanqueWS().getBanqueServicePort();
        System.out.println(stubWs.conversionEuroToDH(800));
        Compte cp= stubWs.getCompte(2L);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        List<Compte>  cptes= stubWs.listComptes();
        cptes.forEach(c ->{


            System.out.println("----------");
            System.out.println(cp.getCode());
            System.out.println(cp.getSolde());

    });


}
}