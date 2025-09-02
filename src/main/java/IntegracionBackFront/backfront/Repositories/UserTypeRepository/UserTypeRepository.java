package IntegracionBackFront.backfront.Repositories.UserTypeRepository;

import IntegracionBackFront.backfront.Entities.UserType.UserTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTypeRepository extends JpaRepository<UserTypeEntity, Long> {
}
