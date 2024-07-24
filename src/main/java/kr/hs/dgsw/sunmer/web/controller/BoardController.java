package kr.hs.dgsw.sunmer.web.controller;

import kr.hs.dgsw.sunmer.web.domain.Post;
import kr.hs.dgsw.sunmer.web.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@Slf4j
public class BoardController {
    private final BoardService boardService;


    @GetMapping("/board/write")
    public String write() {
        return "write";
    }

    @PostMapping("/board/write.do")
    public String writeDo(
            @RequestParam("title") String title,
            @RequestParam("content") String content,
            @RequestParam("writer") String writer){
        // 저장
        log.info("write {} {} {}", title, content, writer);
        Post post = Post.builder()
                .title(title)
                .content(content)
                .writer(writer)
                .build();

        log.info("Post - {}" , post);


        return "write-done";
    }
}
