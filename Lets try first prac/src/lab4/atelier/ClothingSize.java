package lab4.atelier;

enum ClothingSize {
    XXS(32) {
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;

    // Конструктор, принимающий euroSize
    ClothingSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    // Метод по умолчанию для взрослых размеров
    public String getDescription() {
        return "Взрослый размер";
    }
}