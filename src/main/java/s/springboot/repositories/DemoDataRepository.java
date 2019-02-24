package s.springboot.repositories;

import s.springboot.DemoData;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoDataRepository extends JpaRepository<DemoData, Long> {

}

