public class JPGImage extends Image{
    public void parseFile(String fileName){
        String impType="jpg图片";
        this.image.doPaint(impType,name);
    }
}
