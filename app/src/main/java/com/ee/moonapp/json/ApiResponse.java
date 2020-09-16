
package com.ee.moonapp.json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApiResponse {

    private List<Forecast> forecasts = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Forecast> getForecasts() {
        return forecasts;
    }

    public void setForecasts(List<Forecast> forecasts) {
        this.forecasts = forecasts;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
