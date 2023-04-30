package ru.praktikumservices.qascooter.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:default.properties"})
public interface ProgectConfig extends Config {
    @Key("base.uri")
    @DefaultValue("https://qa-scooter.praktikum-services.ru")
    String getBaseUriProperties();

    @Key("browser")
    @DefaultValue("FIREFOX")
    Browser getBrowser();
}
