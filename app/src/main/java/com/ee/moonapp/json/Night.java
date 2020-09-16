
package com.ee.moonapp.json;

import java.util.HashMap;
import java.util.Map;

public class Night {

    private String phenomenon;
    private Double tempmin;
    private Double tempmax;
    private String text;
    private Object sea;
    private Object peipsi;
    private Object places;
    private Object winds;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getPhenomenon() {
        return phenomenon;
    }

    public void setPhenomenon(String phenomenon) {
        this.phenomenon = phenomenon;
    }

    public Double getTempmin() {
        return tempmin;
    }

    public void setTempmin(Double tempmin) {
        this.tempmin = tempmin;
    }

    public Double getTempmax() {
        return tempmax;
    }

    public void setTempmax(Double tempmax) {
        this.tempmax = tempmax;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Object getSea() {
        return sea;
    }

    public void setSea(Object sea) {
        this.sea = sea;
    }

    public Object getPeipsi() {
        return peipsi;
    }

    public void setPeipsi(Object peipsi) {
        this.peipsi = peipsi;
    }

    public Object getPlaces() {
        return places;
    }

    public void setPlaces(Object places) {
        this.places = places;
    }

    public Object getWinds() {
        return winds;
    }

    public void setWinds(Object winds) {
        this.winds = winds;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
