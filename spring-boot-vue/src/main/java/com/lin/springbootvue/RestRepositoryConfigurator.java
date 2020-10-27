package com.lin.springbootvue;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;

/**
 * IDs are not returned by RestRepository by default. I like them exposed so that the client can easily find
 * the ID of created and listed resources.
 * This class is just a configuration class. The whole purpose of it is to tell Spring to return the data model
 * instance IDs with the the object serializations (that way you can refer to them by ID from the client app,
 * since this is going to be the UUID).
 * */
@Component
public class RestRepositoryConfigurator implements RepositoryRestConfigurer {

    /**
     *
     * @param config using the config to expose ids
     */
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Todo.class);
    }
}
