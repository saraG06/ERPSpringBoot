package it.unikey.BLL.Exception;

public class LowRoleException extends Exception{

    public LowRoleException(){
        System.out.println("Ruolo troppo basso per assegnare risorse");
    }
}
