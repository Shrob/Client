

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author Shrob
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
        // TODO code application logic here
        //try {
calcul c=(calcul) Naming.lookup("rmi://localhost:1098/Mycalcul");
double result1=c.carre(2);
System.out.println(result1);
//}
//catch (Exception e) 
//{System.out.println("Erreur client");
//System.out.println(e.toString());}
    }
}
