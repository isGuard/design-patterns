package org.example.components;

/**
 * 产品特征 2
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/13 上午11:47
 */
public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221b，贝克街，伦敦到苏格兰场，8-10百老汇，伦敦";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}