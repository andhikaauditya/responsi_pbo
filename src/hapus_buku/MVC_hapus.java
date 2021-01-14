/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hapus_buku;

/**
 *
 * @author asus
 */
public class MVC_hapus {
    view_hapus vh = new view_hapus();
    model_hapus mh = new model_hapus();
    controller_hapus ch = new controller_hapus(vh,mh);
}
