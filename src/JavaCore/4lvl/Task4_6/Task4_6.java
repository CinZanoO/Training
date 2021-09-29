package Tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Task4_6 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String key;

        while (!(key = reader.readLine()).equals("")) {
            Cat cat = CatFactory.getCatByKey(key);
            System.out.println(cat.toString());
        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat;
            switch (key) {
                case "vaska":
                    cat = new MaleCat("�������");
                    break;
                case "murka":
                    cat = new FemaleCat("�������");
                    break;
                case "kiska":
                    cat = new FemaleCat("��������");
                    break;
                default:
                    cat = new Cat(key);
                    break;
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "� ������� ��� " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "� - �������� ����� �� ����� " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "� - ����� ������� �� ����� " + getName();
        }
    }
}
