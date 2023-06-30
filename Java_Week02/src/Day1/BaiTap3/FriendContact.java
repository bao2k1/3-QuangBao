package Day1.BaiTap3;

public class FriendContact implements Contact{
    private String name;
    private int phoneNumber;
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public void displayContactInfo() {
        System.out.println("Thong tin lien he: \n "+getName()+" "+getPhoneNumber());
    }
}
