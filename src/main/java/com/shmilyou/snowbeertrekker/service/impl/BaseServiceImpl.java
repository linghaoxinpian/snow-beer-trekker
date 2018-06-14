package com.shmilyou.snowbeertrekker.service.impl;

import com.shmilyou.snowbeertrekker.dao.BaseRepository;
import com.shmilyou.snowbeertrekker.entity.BasePojo;
import com.shmilyou.snowbeertrekker.service.BaseService;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class BaseServiceImpl<T extends BasePojo> implements BaseService<T> {

    private BaseRepository<T> baseRepository;
    BaseServiceImpl(BaseRepository baseRepository){
        this.baseRepository=baseRepository;
    }

    private Class<T> clazz;
    {
        Type type = this.getClass().getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type[] types = parameterizedType.getActualTypeArguments();
        clazz= (Class<T>) types[0];
        System.out.println("====================="+clazz.getName());
    }
    @Override
    public List<T> findAll() {
        return baseRepository.findAll();
    }

    @Override
    public void addOne(T pojo) {
        baseRepository.insertOne(pojo);
    }

    @Override
    public <S> T findOne(Class<S> clazz, S id) {
        return baseRepository.findOne(clazz,id);
    }
}
