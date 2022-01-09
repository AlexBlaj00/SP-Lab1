package ro.uvt.sabloane.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import ro.uvt.sabloane.models.SseObservers;
import ro.uvt.sabloane.models.Subject;

@RestController
public class BookSseController {

    private final Subject subject;

    @Autowired
    public BookSseController(Subject subject) {
        this.subject = subject;
    }

    @RequestMapping("/books-sse")
    public ResponseBodyEmitter getBookSse() {
        final SseEmitter emitter = new SseEmitter(0L);
        subject.attach(new SseObservers(emitter));
        return emitter;
    }
}
