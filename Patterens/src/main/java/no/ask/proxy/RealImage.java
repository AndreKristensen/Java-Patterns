package no.ask.proxy;
interface Image {
    void displayImage();
}
 
// on System A 
class RealImage implements Image {
    private String filename;
 
    public RealImage(String filename) { 
        this.filename = filename;
        loadImageFromDisk();
    }
 
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }
 
    public void displayImage() { 
        System.out.println("Displaying " + filename); 
    }
 
}


 
