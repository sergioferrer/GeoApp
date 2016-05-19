package com.sergioferrer.android.model;

/**
 * Created by snayper on 18/05/2016.
 */
public class Pregunta {

    private Integer mIdResTexto;
    private  boolean mRespuestaVerdadera;

    public Pregunta(Integer idResTexto, boolean respuestaVerdadera){
        this.mIdResTexto = idResTexto;
        this.mRespuestaVerdadera = respuestaVerdadera;

    }

    public void setIdResTexto(Integer IdResTexto){
        IdResTexto += 1;
    }

    public Integer getIdResTexto(){
        return mIdResTexto;
    }

    public void setRespuestaVerdadera(boolean respuestaVerdadera ){
        respuestaVerdadera = true;
    }

    public boolean isRespuestaVerdadera(){
        return mRespuestaVerdadera;
    }
}
