public class Data {
    String name;
    String pass;
    String phone;

    public Data(String name, String pass, String phone) {
        this.name = name;
        nameCorrection();
        this.pass = pass;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    void nameCorrection() {
        char[] nameArray = this.name.toCharArray();
        boolean space = true;
        for (int i = 0; i < nameArray.length; i++) {
            if (Character.isLetter(nameArray[i])) {
                nameArray[i] = Character.toLowerCase(nameArray[i]);
                if (space) {
                    nameArray[i] = Character.toUpperCase(nameArray[i]);
                    space = false;
                }
            } else {
                space = true;
            }
        }
        this.name = String.valueOf(nameArray);
    }
}