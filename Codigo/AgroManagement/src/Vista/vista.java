/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author platon
 */
public class vista {
    private frmLogin frmLogin;
    private frmPrincipal frmPrincipal;
    public vista(){
        this.frmLogin=new frmLogin();
    }
    public void setVisibleLogin(boolean visible){
        frmLogin.setVisible(visible);
    }
}
