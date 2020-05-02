package de.mclenburg.privatechannel.planner;

import lombok.Data;

@Data
public class Movie {
    private String title;
    private String description;
    private String rated;
    private String year;
    private String streamURL;
}
