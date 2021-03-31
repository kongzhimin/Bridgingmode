public abstract class Image {
    protected Image image;
    public void setImage(ImageImp imp){
        this.image = image;
    }
    public abstract void parseFile(String fileName);
}
