package org.launchcode.liftoff.shoefinder.data;

import org.launchcode.liftoff.shoefinder.models.ShoeListing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoeListingRepository  extends JpaRepository<ShoeListing, Long> {

    List<ShoeListing> findByGender(String gender);
}
