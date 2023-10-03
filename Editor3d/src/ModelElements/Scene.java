package ModelElements;

import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(int id, List<Flash> flashes, List<Camera> cameras, List<PoligonalModel> models) {
        this.id = id;
        this.flashes = flashes;
        this.cameras = cameras;
        this.models = models;
    }

    public <T> T method1(T type){
        // какая-то логика
        return null;
    }

    public <T> T method2(T type, T type2){
        // какая-то логика
        return null;
    }

}
