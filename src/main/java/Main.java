import Entity.Field;
import Service.FieldService;

public class Main {
    public static void main(String[] args) {
        Field f1 = new Field();
        Field f2 = new Field();
        FieldService.printFields(f1,f2);
        }
    }
