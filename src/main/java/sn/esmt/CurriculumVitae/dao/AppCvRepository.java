package sn.esmt.CurriculumVitae.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.esmt.CurriculumVitae.entities.AppCvEntity;

@Repository
public interface AppCvRepository extends JpaRepository<AppCvEntity,Integer> {

}
