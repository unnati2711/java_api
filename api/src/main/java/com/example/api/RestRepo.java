package com.example.api;

import org.springframework.data.repository.*;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RestRepo extends CrudRepository<Beer, Long> {

}
