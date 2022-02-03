package Phone;

public class FactoryObjInstantiater {
    public Shortcuts getShortcut(String query){
        if(query.equals("screenshot")){
            return new Screenshot();
        }
        else if(query.equals("camera")){
            return new Camera();
        }
        else if(query.equals("assistant")){
            return new Assistant();
        }
        else{
            return new ZoomIn();
        }

    }
}
