package com.example.sens.es.repository;

import com.example.sens.es.entity.EsApi;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author θ¨ζ
 * @date 2022/2/20 1:49 δΈε
 */
@Repository
public interface EsApiRepository extends ElasticsearchRepository<EsApi, Long> {
}
