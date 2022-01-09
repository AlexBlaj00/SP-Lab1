package ro.uvt.sabloane.models;

import org.springframework.http.MediaType;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;

public class SseObservers implements Observer{

    private final SseEmitter emitter;

    public SseObservers(SseEmitter emitter) {
        this.emitter = emitter;
    }

    @Override
    public void update(Book book)  {
        try {
            emitter.send(book, MediaType.APPLICATION_JSON);
        }catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
