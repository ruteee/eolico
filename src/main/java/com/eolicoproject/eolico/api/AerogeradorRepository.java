package com.eolicoproject.eolico.api;


import com.eolicoproject.eolico.domain.Aerogerador;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "aerogerador", path="aerogerador")
public interface AerogeradorRepository extends PagingAndSortingRepository<Aerogerador, Long> {
}
