package kr.hs.dgsw.sunmer.web.service.impl;

import jakarta.annotation.PostConstruct;
import kr.hs.dgsw.sunmer.web.domain.Post;
import kr.hs.dgsw.sunmer.web.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class BoardServiceImpl implements BoardService {
    private final List<Post> list =
            new ArrayList<>();

    private int idPool =0;

    @PostConstruct
    public void makeSampleData() {
        Post post = Post.builder()
                .title("1")
                .content("2")
                .writer("3")
                .build();

        addPost(post);
    }

    @Override
    public Post addPost(Post post) {
        log.info("addPost  {} {}", post, idPool);
        post.setId(++idPool);

        list.addFirst(post);

        log.info("LIST - {}" , list);

        return post;
    }

    @Override
    public List<Post> list() {
        return list;
    }

    @Override
    public Post read(int id) {
        for(Post post : list){
            if(post.getId() == id){
                return post;
            }
        }

        throw new RuntimeException("not found");
    }

    @Override
    public Post update(Post post) {
        Post original = read(post.getId());
        original.setTitle(post.getTitle());
        original.setContent(post.getContent());
        original.setWriter(post.getWriter());

        return original;
    }

    @Override
    public void delete(int id) {
        Post post = read(id);
        list.remove(post);
    }
}
