/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas33;

/**
 *
 * @author
 * Aris Prabowo 
 * 10119914 - IF10K
 */
public class Main {
        public static void main(String arg[]){
        String userName = "RizkyAdam";
        String password = "terbaikselalu";
        User user = new User();
        user.pengecekanLogin(userName, password);
    }
}
