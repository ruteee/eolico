package com.eolicoproject.eolico;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "aerogerador", path="aerogerador")
public interface AeroGeradorRepository  extends PagingAndSortingRepository<Aerogerador, Long> {
}
