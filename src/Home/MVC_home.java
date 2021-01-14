/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

/**
 *
 * @author asus
 */
public class MVC_home {
    view_home view = new view_home();
    model_home model = new model_home();
    controller_home ch = new controller_home(view,model);
}
