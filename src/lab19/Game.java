package lab19;

public class Game {

    private final String name;
    private final Genre genre;
    private final Type type;

    private Game(String name, Genre genre, Type type) {
        this.name = name;
        this.genre = genre;
        this.type = type;
    }



    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }

    public Type getType() {
        return type;
    }



    public enum Type {
        VIRTUAL,
        PHYSICAL;
    }

    public static GameDisk getDisk(String name, Genre genre, String description) {
        return new GameDisk(name, genre, description);
    }

    public static VirtualGame getVirtualGame(String name, Genre genre) {
        return new VirtualGame(name, genre);
    }

    static class GameDisk extends Game{
        final String description;
        final Game data;

        GameDisk(String name, Genre genre, String description) {
            super(name, genre, Type.PHYSICAL);
            this.description = description;
            this.data = new Game(name, genre, Game.Type.PHYSICAL);
        }

        String getDescription() {
            return description;
        }

        Game getData() {
            return data;
        }

    }


    static class VirtualGame extends Game {
        int rating;
        final Game data;

        VirtualGame(String name, Genre genre) {
            super(name, genre, Type.VIRTUAL);
            this.data = new Game(name, genre, Game.Type.VIRTUAL);
        }

        int getRating() {
            return rating;
        }

        void setRating(int rating) {
            this.rating = rating;
        }

        Game getData() {
            return data;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Game game = (Game) o;

        if (name != null ? !name.equals(game.name) : game.name != null) return false;
        if (genre != game.genre) return false;
        return type == game.type;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", ganre=" + genre +
                '}';
    }
}

