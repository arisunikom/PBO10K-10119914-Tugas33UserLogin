/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas33;

/**
 *
 * @author dropsuite
 */
public class User {
    private static String username = "RizkyAdam";
    private static String password = "terbaikselalu";
    
    private boolean cekAccount(String parUserName, String parPassword){
        return parUserName.equals(username) && parPassword.equals(password);
    }
    
    private void hasilLogin(boolean Status, String parUserName){
        if(Status==true){
            System.out.println("****Halo "+parUserName+"****");
            System.out.println("Selamat Datang di Aplikasi Ini");
        }else{
            System.out.println("Ooops, username atau password anda salah");
        }
    }
    
    public void pengecekanLogin(String parUserName, String parPassword){
        boolean isSuccess = cekAccount(parUserName, parPassword);
        hasilLogin(isSuccess,parUserName);
    }
}
