package com.biao.proxy;

import com.biao.Logger;

class MovieProxy implements Movie {
   private Movie movie;
    public MovieProxy(Movie movie){
        this.movie = movie;
    }
    @Override
    public void play() {
        Logger.LOG("start");
        movie.play();
        Logger.LOG("end");
    }
}
