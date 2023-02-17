package com.can.OrderProject.Repository.Concrete;

import com.can.OrderProject.Entity.BaseEntity;

import java.util.Set;

public interface BaseRepository <T extends BaseEntity>
{
    Set<T> getAll();
    T get(int id);
    T add(T entity);
    T delete(T entity);
}
