public class FaylTapsiriqi{
    public static void main(String[] args) {
        String fileName = "hesabat.docx";
        int dotIndex = fileName.lastIndexOf('.');
        String name = fileName.substring(0, dotIndex);
        String extension = fileName.substring(dotIndex);
        System.out.println("filename: hesabat");
        System.out.println("extension: .docx");
    }
}