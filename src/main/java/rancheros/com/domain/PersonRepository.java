package rancheros.com.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Daniel on 11/06/2016.
 */
public interface PersonRepository {

    List<Person> findAll();

    Person findById(String id);

    Person create(Person person);
}
