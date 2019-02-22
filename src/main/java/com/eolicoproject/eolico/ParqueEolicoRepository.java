package com.eolicoproject.eolico;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "parque", path="parque")
public interface ParqueEolicoRepository extends PagingAndSortingRepository<Parque, Long> {
}
