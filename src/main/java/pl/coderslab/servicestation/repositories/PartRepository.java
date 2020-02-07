package pl.coderslab.servicestation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.servicestation.models.Part;

public interface PartRepository extends JpaRepository<Part, Long> {

}
