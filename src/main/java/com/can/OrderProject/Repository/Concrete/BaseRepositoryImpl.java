package com.can.OrderProject.Repository.Concrete;

import com.can.OrderProject.Entity.BaseEntity;

import java.util.HashSet;
import java.util.Set;

public  class BaseRepositoryImpl<T extends BaseEntity> implements BaseRepository<T>
{

    Set<T> entites=new HashSet<>();
    @Override
    public Set<T> getAll() {

        return entites;
    }

    @Override
    public T get(int id) {
        T entity=entites.stream().filter(t -> t.getId()==id).findFirst().get();
        return entity;
    }

    @Override
    public T add(T entity) {
        entites.add(entity);
        return entity;
    }

    @Override
    public T delete(T entity) {
        entites.remove(entity);
        return entity;
    }
}
