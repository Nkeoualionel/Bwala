package com.lionelnkeoua.com.bwala.model;

/**
 * Created by Lionel on 24/03/2018.
 */
public class NumerosUrgence {

    private int imageService;
    private int actionCall;
    private String service;
    private String numero;

    public NumerosUrgence(int imageService, int actionCall, String service, String numero) {
        this.imageService = imageService;
        this.actionCall = actionCall;
        this.service = service;
        this.numero = numero;
    }

    public int getImageService() {
        return imageService;
    }

    public void setImageService(int imageService) {
        this.imageService = imageService;
    }

    public int getActionCall() {
        return actionCall;
    }

    public void setActionCall(int actionCall) {
        this.actionCall = actionCall;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
