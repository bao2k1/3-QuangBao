package Day1.Bai6;

class Photo {
    private String id;

    public Photo(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id='" + id + '\'' +
                '}';
    }
}