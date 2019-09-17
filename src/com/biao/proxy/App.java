package com.biao.proxy;

/**
 * 代理模式
 */
public class App {
    public static void main(String[] args){
        Movie movie = new RealMovie();
        Movie movieProxy = new MovieProxy(movie);
        movieProxy.play();
    }
}
