package com.abner.service;

import com.abner.domain.MetaDatabase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author peiwenrui
 * @since 2018-11-28 19:00
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MetaDataServiceTest {

    @Resource
    private MetaDatabaseService metaDatabaseService;

    @Test
    public void testSave() {
        MetaDatabase metaDatabase = new MetaDatabase();
        metaDatabase.setName("default");
        metaDatabase.setLocal("hdfs://hadoop001:8020:/user");
        metaDatabaseService.save(metaDatabase);
    }

    @Test
    public void testQuery() {
        Iterable<MetaDatabase> query = metaDatabaseService.query();

        for (MetaDatabase metaDatabase : query) {
            System.out.println(metaDatabase.toString());
        }

    }

}