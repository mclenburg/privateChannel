package de.mclenburg.privatechannel.clients;

import de.mclenburg.privatechannel.planner.Movie;

import java.util.Collection;

public interface MovieLister {
    Collection<Movie> getMovieList();
}
