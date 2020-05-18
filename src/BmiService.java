public class BmiService {
    public float calculate(float weight, float height) {
        float index = weight / ((height * height) / 100 / 100);
        return (float)((int)(index * 100)) / 100 ;
    }
}
