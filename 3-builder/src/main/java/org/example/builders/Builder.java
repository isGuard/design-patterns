package org.example.builders;

import org.example.cars.CarType;
import org.example.components.Engine;
import org.example.components.GPSNavigator;
import org.example.components.Transmission;
import org.example.components.TripComputer;

/**
 * Builder界面定义了配置产品的所有可能方法。
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/13 上午11:42
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
