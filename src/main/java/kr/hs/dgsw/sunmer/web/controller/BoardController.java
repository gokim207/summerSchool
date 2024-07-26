package kr.hs.dgsw.sunmer.web.controller;

import kr.hs.dgsw.sunmer.web.domain.Post;
import kr.hs.dgsw.sunmer.web.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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

        boardService.addPost(post);
        return "redirect:list";
    }

    @GetMapping("/board/list")
    public String list(Model model){

        List<Post> list =  boardService.list();
        model.addAttribute("list", list);

        return "list";
    }

    @GetMapping("/board/detail")
    public String detail(Model model,
                         @RequestParam("id") int id) {
        Post post = boardService.read(id);

        model.addAttribute("post", post);
        return "detail";
    }

    @GetMapping("/board/detail/{id}")
    public String detail1(Model model,
                         @PathVariable("id") int id) {
        Post post = boardService.read(id);

        model.addAttribute("post", post);
        return detail(model, id);
    }

    @GetMapping("/board/rewrite/{id}")
    public String rewrite(Model model,
                          @PathVariable("id") int id) {
        Post post = boardService.read(id);

        model.addAttribute("post", post);

        return "rewrite";
    }

    @PostMapping("/board/rewrite.do")
    public String rewriteDo(
            @RequestParam("id") int id,
            @RequestParam("title") String title,
            @RequestParam("content") String content,
            @RequestParam("writer") String writer) {

        Post post = Post.builder()
                .id(id)
                .title(title)
                .content(content)
                .writer(writer)
                .build();

        boardService.update(post);

        return "redirect:list";
    }

    @PostMapping("/board/delete/{id}")
    public String deleteDo(
            @PathVariable("id") int id){

        boardService.delete(id);

        return "redirect:/board/list";
    }
}
