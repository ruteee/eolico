package com.eolicoproject.eolico.api;

import com.eolicoproject.eolico.domain.Complexo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "complexo", path="complexo")
public interface ComplexoRepository extends PagingAndSortingRepository<Complexo, Long> {
}
