package pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.factorycreators;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.componentfactory.LaptopComponentFactory;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.componentfactory.impl.LaptopHighComponentFactoryImpl;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.componentfactory.impl.LaptopLowComponentFactoryImpl;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.factory.componentfactory.impl.LaptopMediumComponentFactoryImpl;
import pl.vm.javaguild.designpatterns.pattern.creational.abstractfactory.model.enums.QualityLevel;

/**
 * Class that returns implementations of ComponentFactory, depending on chosen QualityLevel
 * @see QualityLevel
 */
@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ComponentFactoryCreator {

    public static LaptopComponentFactory getComponentFactory(QualityLevel qualityLevel) {
        return switch (qualityLevel) {
            case LOW -> new LaptopLowComponentFactoryImpl();
            case MEDIUM -> new LaptopMediumComponentFactoryImpl();
            case HIGH -> new LaptopHighComponentFactoryImpl();
        };
    }
}