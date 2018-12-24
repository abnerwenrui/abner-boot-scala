package com.abner.service;

import com.abner.domain.MetaDatabase;
import com.abner.repository.MetaDatabaseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author
 * @since 2018-11-28 18:55
 */
@Service("metaDatabaseService")
public class MetaDatabaseService {

    @Resource
    private MetaDatabaseRepository metaDatabaseRepository;

    @Transactional
    public void save(MetaDatabase metaDatabase){
        metaDatabaseRepository.save(metaDatabase);
    }

    public Iterable<MetaDatabase> query(){
        return metaDatabaseRepository.findAll();
    }

}
