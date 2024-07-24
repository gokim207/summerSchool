package kr.hs.dgsw.sunmer.web.service;

import kr.hs.dgsw.sunmer.web.domain.Post;

import java.util.List;

public interface BoardService {
    Post addPost(Post post);

    List<Post> list();

    Post read(int id);

    Post update(Post post);

    void delete(int id);
}
