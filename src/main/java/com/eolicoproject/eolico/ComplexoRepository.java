package com.eolicoproject.eolico;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "complexo", path="complexo")
public interface ComplexoRepository extends PagingAndSortingRepository<Complexo, Long> {
}
