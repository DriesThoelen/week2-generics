package be.pxl.generics.opgave2;

public interface Moveable <T> {
    void move(T location);
    T getCurrentLocation();
}
