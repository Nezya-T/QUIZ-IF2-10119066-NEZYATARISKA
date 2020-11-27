/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119066.nezyatariska;
import java.util.Scanner;

/**
 *
 * @author Neyza-T
 */
public class ServicePrice implements ServiceItem {
    private float priceService;
    private float discount;
    
    Scanner choose = new Scanner(System.in);
   
    
    public float getPriceService(){
        return priceService;
    }
    public void setPriceService(){
        this.priceService = priceService;
    }

    @Override
    public void displaService() {
        System.out.println("-------------------------");
        System.out.println("---Rock n Roll Haircut---");
        System.out.println("-------Service List------");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + HairWash : IDR 55k");
        System.out.println("3. Hairwash only : IDR 15k");
        System.out.println("choose (1/2/3) : ");
        priceService = choose.nextFloat;
    }

    @Override
    public float getPrice(int serviceItem) {
        int pilih = (int) priceService;
        
        switch(pilih){
            case 1 : serviceItem = 45;
            break;
            case 2 : serviceItem = 55;
            break;
            case 3 : serviceItem = 15;
        }
        return serviceItem;
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
       return checkMemberStatus(statusMember);
    }

    @Override
    public float getSale(boolean isMember, float perServicePrice) {
       return getSale(isMember, perServicePrice);
    }
    public float getTotalPay(float priceService, float discount){
        return getTotalPay(priceService, discount);
    }
    
}
