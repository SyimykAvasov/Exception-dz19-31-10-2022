public class Main {
    public static void main(String[] args) {
        try(Car car = new Car()){
        }catch (Exception e){
            throw  new RuntimeException();
        }
        try (Car car = new Car()) {
        }catch (Exception e) {
            e.getCause();
        }
    }
}