/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formedit;

import tambah_buku.*;
/**
 *
 * @author asus
 */
public class MVC_formedit {
    view_formedit view = new view_formedit();
    model_formedit model= new model_formedit();
    controller_formedit cf = new controller_formedit(view,model);
}
