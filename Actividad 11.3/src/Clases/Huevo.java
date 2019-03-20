package Clases;

public class Huevo {
    public Huevo() {
    }

    public static Yema hazYema () {
        return new Yema();
    }

    public static Clara hazClara() {
        return new Clara();
    }

    public static class Clara {
        public Clara() {
        }
    }

    public static class Yema {
        public Yema() {
        }
    }
}
