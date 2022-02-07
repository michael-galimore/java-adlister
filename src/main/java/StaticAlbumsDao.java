import jdk.dynalink.beans.StaticClass;

import java.util.ArrayList;
import java.util.List;

public class StaticAlbumsDao implements Albums{
    private
    StaticAlbumsDao(){
        insert(new Album(989,"Mike", "Mikers", 1999, "R&B", 549);
        insert(new Album(3, "All 4 One","All 4 One", 1994, "pop", 5));

        }

    }

    @Override
    public List<Album> all() {
        return this.albums;
    }

    @Override
    public Album findOne(long id) {
        for(Album album : this.albums){
            if(album.getId() == id){
                return album;
            }
    }

    @Override
    public void insert(Album album) {
            this.albums.add(album);

    }

    @Override
    public void update(Album album) {
            Album previousVersion = findOne(album.getId());
            int index = this.albums.indexOf(previousVersion);
            this.albums.set(index,album);

    }

    @Override
    public void destroy(Album album) {
            this.albums.remove(album);

    }
}
