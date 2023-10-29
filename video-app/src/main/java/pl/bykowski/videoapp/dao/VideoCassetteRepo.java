package pl.bykowski.videoapp.dao;

import org.springframework.data.repository.CrudRepository;
import pl.bykowski.videoapp.dao.entity.VideoCassette;

public interface VideoCassetteRepo extends CrudRepository<VideoCassette, Long> {
}
