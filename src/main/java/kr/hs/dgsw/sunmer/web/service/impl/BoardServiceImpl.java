package kr.hs.dgsw.sunmer.web.service.impl;

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
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
