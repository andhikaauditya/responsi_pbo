/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tambah_buku;

/**
 *
 * @author asus
 */
public class MVC_tambah {
    view_tambah view1 = new view_tambah();
    model_tambah  model1 = new model_tambah();
    controller_tambah controller1 = new controller_tambah(view1,model1);
}
