package com.juaracoding.oop.package2;

public interface IService<T> {

    public void insert();// 001-010
    public void update();//011-020
    public void delete();//021-030
    public void selectAll();//031-040
    public void insert(T t);
    public void update(T t, Long id);

    public T delete(T t,Long id);
//    public default void coba(){
//        System.out.println("HUE");
//    }
}
