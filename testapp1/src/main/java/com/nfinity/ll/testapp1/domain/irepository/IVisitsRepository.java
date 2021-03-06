package com.nfinity.ll.testapp1.domain.irepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;
import com.nfinity.ll.testapp1.domain.model.VisitsEntity;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@RepositoryRestResource(collectionResourceRel = "visits", path = "visits")
public interface IVisitsRepository extends JpaRepository<VisitsEntity, Integer>,QuerydslPredicateExecutor<VisitsEntity> {

}
