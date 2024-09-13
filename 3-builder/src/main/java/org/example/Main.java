package org.example;

import org.example.builders.CarBuilder;
import org.example.builders.CarManualBuilder;
import org.example.cars.Car;
import org.example.cars.Manual;
import org.example.director.Director;

/**
 * 客户端代码
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/13 上午11:58
 */
public class Main {
    public static void main(String... args) {
        Director director = new Director();

        // Director从客户端获取具体的构建器对象
        // (应用程序代码)。这是因为应用程序更了解哪个
        // 用于获取特定产品的生成器。
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // 最终产品通常是从builder对象中检索的，因为
        // 导演不知道，也不依赖于混凝土建筑商，
        // 产品。
        Car car = builder.getResult();
        System.out.println("汽车制造:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // 导演可能知道几个建筑食谱。
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\n汽车手动建造:\n" + carManual.print());
    }

}
