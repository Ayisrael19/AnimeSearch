package org.launchcode.models.data;

import org.launchcode.models.Genre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface GenreDao extends CrudRepository<Genre, Integer> {
}