package ems.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ems.Model.Event;


@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
// add custom queries if needed
}