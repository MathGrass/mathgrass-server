package de.tudresden.inf.st.mathgrass.api.task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskCollectionRepository extends JpaRepository<TaskCollectionEntity,Long> {
}
