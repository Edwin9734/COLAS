package org.example.cola;

import java.security.PublicKey;

public class ColaLineal<t> {

    protected  int fin;
    protected  int frente;
    private static int MAXTAMQ = 39;
    protected  Object[] listaCola;

    public ColaLineal(){

        frente =0;
        fin =-1;
        listaCola= new Object[MAXTAMQ];
    }

    public boolean colaLlena(){
        return fin == MAXTAMQ -1 ;
    }




    public boolean colaVacia(){

        return frente > fin;
    }






    public void insertar(Object elemento)throws Exception{
        if(!colaLlena()){
            listaCola[++fin] = elemento;


        }else {
            throw  new Exception("HUBO UN OVERFLOW!");
        }

    }

    public  Object quitar()throws Exception {
        if(!colaVacia()){
            return listaCola[frente++];

        }else {
            throw new Exception("cola vacia");
        }
    }

    public void borrarCola(){
        frente =0;
        fin =-1;
    }

    public Object frenteCola()throws Exception {
        if( !colaVacia()){
            return listaCola[frente];


        }else {
            throw new Exception("Cola vacacía");

        }

    }




}
