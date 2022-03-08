package com.example.sens.es.repository;

import com.example.sens.es.entity.EsApi;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 言曌
 * @date 2022/2/20 1:49 下午
 */
@Repository
public interface EsApiRepository extends ElasticsearchRepository<EsApi, Long> {
}
