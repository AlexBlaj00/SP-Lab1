package ro.uvt.sabloane.Lab6.models;


import java.util.Objects;

public class Paragraph extends Element implements Visitee {
    private String text_;
    private ParagraphAlignment align_;

    public Paragraph(String text)
    {
        text_ = Objects.requireNonNull(text, "");
        align_ = ParagraphAlignment.LEFT;
    }

    public Paragraph(Paragraph paragraph)
    {
        text_ = paragraph.text_;
    }

    public void setAlignStrategy(ParagraphAlignment alignStrategy) throws Exception
    {
        if (alignStrategy == null)
        {
            throw new Exception("Alignment cannot be null");
        }
        else
        {
            align_ = alignStrategy;
        }
    }

    public String getText()
    {
        return text_;
    }

    public ParagraphAlignment getAlignStrategy() { return align_; }

    public void setText(String text)
    {
        text_ = text;
    }

    @Override
    public boolean add(Element element)
    {
        throw new UnsupportedOperationException();
    };

    @Override
    public boolean remove(Element element)
    {
        throw new UnsupportedOperationException();
    };

    @Override
    public Element get(int index)
    {
        throw new UnsupportedOperationException();
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }

//    @Override
//    public void accept(BookStatistics bookStatistics) {
//        throw new UnsupportedOperationException();
//    }

}