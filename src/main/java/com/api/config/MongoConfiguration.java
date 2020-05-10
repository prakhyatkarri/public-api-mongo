//package com.api.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.data.mongodb.MongoDbFactory;
//import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory;
//import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
//
//@Configuration
//public class MongoConfiguration {
//
//    @Value("${spring.data.mongodb.uri:}")
//    private String url;
//
//    @Bean
//    public MongoDbFactory mongoDbFactory() {
//        return new SimpleMongoClientDbFactory(url);
//    }
//}
