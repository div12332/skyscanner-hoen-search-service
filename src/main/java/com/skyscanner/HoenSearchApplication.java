package com.skyscanner;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HoenSearchApplication extends Application<HoenSearchConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HoenSearchApplication().run(args);
    }

    @Override
    public String getName() {
        return "hoen-search-service";
    }

    @Override
    public void initialize(final Bootstrap<HoenSearchConfiguration> bootstrap) {
        // nothing yet
    }

    @Override
    public void run(final HoenSearchConfiguration configuration,
                    final Environment environment) {
        final HoenSearchResource resource = new HoenSearchResource();
        environment.jersey().register(resource);
    }
}
