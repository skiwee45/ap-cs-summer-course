public class Unit8Activity1B {
    String name, artist, category;
    double price;
    public Unit8Activity1B (String name, String artist, String category, double price) {
        this.name = name;
        this.artist = artist;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }

    public String getArtist() {
        return artist;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String newCategory) {
        category = newCategory;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double newPrice) {
        price = newPrice;
    }

    @Override
    public String toString() {
        return String.format("%s by %s, Category: %s, $%.2f", getName(), getArtist(), getCategory(), getPrice());
    }
}
