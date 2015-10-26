package domain.dao;

import domain.model.SpacialRefSys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by bbonheur on 26/10/2015.
 */
@Repository
public interface SpacialRefSysDAO extends JpaRepository<SpacialRefSys, Integer> {
}
