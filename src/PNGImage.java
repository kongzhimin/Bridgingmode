public class PNGImage extends Image{
    public void parseFile(String fileName){
        String impType="png图片";
        this.image.doPaint(impType,name);
    }
}
