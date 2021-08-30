package web.models;

public class Car {
    private String producer;
    private String model;
    private String body ;

    public Car() {
    }

    public Car(String producer, String model, String body) {
        this.producer = producer;
        this.model = model;
        this.body = body;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
