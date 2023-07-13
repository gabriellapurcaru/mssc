package tutanodigital.mssc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tutanodigital.mssc.model.Post;
import tutanodigital.mssc.repository.PostRepository;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostRepository repository;

    public PostController(PostRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Post> findAll(){
        return repository.findAll();
    }
}
