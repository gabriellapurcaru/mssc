package tutanodigital.mssc.repository;

import org.springframework.data.repository.ListCrudRepository;
import tutanodigital.mssc.model.Post;

public interface PostRepository extends ListCrudRepository<Post, Integer> {
}
