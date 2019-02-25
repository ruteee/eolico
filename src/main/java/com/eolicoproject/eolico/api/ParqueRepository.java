package com.eolicoproject.eolico.api;

import com.eolicoproject.eolico.domain.Parque;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "parque", path="parque")
public interface ParqueRepository extends PagingAndSortingRepository<Parque, Long> {
}
