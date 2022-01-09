//package ro.uvt.sabloane.services;
//
//public class JSONFileExporter {
//    String fileName;
//    BookSaveVisitor visitor;
//
//    public JSONFileExporter(String fn, BookSaveVisitor v){
//        fileName = fn;
//        visitor = v;
//    }
//
//    public void exportToJSON(Visitee v){
//        try{
//            FileWriter fileWriter = new FileWriter(fileName);
//            fileWriter.write(v.accept(visitor).toString(4));
//            fileWriter.close();
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//    }
//}
