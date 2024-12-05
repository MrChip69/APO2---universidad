package usc.musicCollection.UI;
import java.util.ArrayList;

/*

Administra los datos de artistas, canciones y listas de reproducción.
Es el punto central donde se almacenan las colecciones y se proporcionan métodos para añadir datos.

 */



class MusicManager {
    private ArrayList<Artist> artists;
    private ArrayList<Song> songs;
    private ArrayList<Playlist> playlists;

    public MusicManager() {
        artists = new ArrayList<>();
        songs = new ArrayList<>();
        playlists = new ArrayList<>();
    }
    public void addArtist(Artist artist) {
        artists.add(artist);
    }
    public void addSong(Song song) {
        songs.add(song);
    }
    public void addPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }
    public ArrayList<Artist> getArtists() {
        return artists;
    }
    public ArrayList<Song> getSongs() {
        return songs;
    }
    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }
}