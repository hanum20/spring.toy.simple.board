# JPA STUDY - Pageable

##### Pageable 적용하기 - 기본

**Controller **

```java
@RestController
public class BoardController {

    @Autowired
    BoardService boardService;

    @GetMapping("/posts")
    public Page<Post> getPost(@PageableDefault(size= 10, sort="title", direction= Sort.Direction.DESC) Pageable pageable) {
        return boardService.getPostPage(pageable);
    }
}
```

* Spring Boot의 autoconfig가 Pageable관련 formatter도 제공해주는지?

<br>

**Service**

```java
@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    PostRepository postRepository;

    ...

    @Override
    public Page<Post> getPostPage(Pageable pageable) {
        return postRepository.findAll(pageable);
    }
}
```

<br>

*****

