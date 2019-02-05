/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author HP
 */

public class user {
    
    private String uname;
    private String pwd;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "user{" + "uname=" + uname + '}';
    }
    
    public boolean equals(Object o){
        user u=(user) o;
        
        if(uname.equals(u.getUname()) && pwd.equals(u.getPwd())){
            return true;
    }
        return false;
    
}
}
