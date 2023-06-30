package Day1.Bai6;

import java.util.ArrayList;
import java.util.List;

class IPhone {
    private List<Photo> photos;

    public IPhone(List<Photo> photos) {
        this.photos = photos;
    }

    public IPhone() {
        this.photos = new ArrayList<>();
    }

    public void airdrop(IPhone other, String id) {
        // Find the photo with the given ID in the current iPhone
        Photo photo = null;
        for (Photo p : photos) {
            if (p.getId().equals(id)) {
                System.out.println(p);
                photo = p;
                break;
            }
        }

//         If the photo is found, share it with the other iPhone
        if (photo != null) {

            other.receivePhoto(photo);
//            photos.remove(photo);
        }
    }
    public void receivePhoto(Photo photo) {
        photos.add(photo);
    }
    public List<Photo> getPhotos() {
        return photos;
    }
}




