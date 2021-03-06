package net.serenitybdd.core.buildinfo;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by john on 12/02/15.
 */
public class BuildProperties {

    private final Map<String, String> generalProperties;
    private final List<String> drivers;
    private final Map<String, Properties> driverProperties;

    public BuildProperties(Map<String, String> generalProperties, List<String> drivers, Map<String, Properties> driverProperties) {
        this.generalProperties = generalProperties;
        this.drivers = drivers;
        this.driverProperties = driverProperties;
    }

    public Map<String, String> getGeneralProperties() {
        return ImmutableMap.copyOf(generalProperties);
    }

    public List<String> getDrivers() {
        return ImmutableList.copyOf(drivers);
    }

    public Map<String, Properties> getDriverProperties() {
        return ImmutableMap.copyOf(driverProperties);
    }
}
