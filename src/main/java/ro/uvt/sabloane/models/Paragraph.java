package ro.uvt.sabloane.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import ro.uvt.sabloane.services.AlignCenter;
import ro.uvt.sabloane.services.AlignStrategy;
import ro.uvt.sabloane.services.Context;

import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class Paragraph extends BaseElement implements Visitee {
    private String text_;
    @Transient
    @JsonIgnore
    private Context context = new Context(10);
    @Transient
    @JsonIgnore
    private AlignStrategy alignStrategy = new AlignCenter();

    public Paragraph(String paragraph){
        this.text_ = paragraph;
    }

    public Paragraph() {

    }

    public void setAlignStrategy(AlignStrategy alignStrategy){
        this.alignStrategy = alignStrategy;
    }

    public void setContext(Context context){
        this.context = context;
    }

    public AlignStrategy getAlignStrategy(){
        return alignStrategy;
    }

    public Context getContext(){
        return context;
    }

    public String getText(){
        return text_;
    }


    @Override
    public void accept(Visitor visitor){
        visitor.visitParagraph(this);
    }

}
