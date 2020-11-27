/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119066.nezyatariska;

/**
 *
 * @author Neyza-T
 */
public interface ServiceItem {
    public void displaService();
    public float getPrice(int serviceItem);
    public boolean checkMemberStatus(String statusMember);
    public float getSale(boolean isMember, float perServicePrice);
    
    
}
