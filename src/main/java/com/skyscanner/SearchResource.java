package com.skyscanner;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Path("/search")
@Produces(MediaType.APPLICATION_JSON)
public class SearchResource {

    @GET
    public List<String> search(@QueryParam("city") String city) {

        List<String> hotels = Arrays.asList(
                "Hoen Grand Hotel - Aurora",
                "Island Breeze Resort - Ember",
                "SeaView Lodge - Aurora"
        );

        List<String> cars = Arrays.asList(
                "Aurora Car Rentals",
                "Ember Island Cars"
        );

        return hotels.stream()
                .filter(item -> city == null || item.toLowerCase().contains(city.toLowerCase()))
                .collect(Collectors.toList());
    }
}
