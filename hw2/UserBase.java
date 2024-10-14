public abstract class UserBase extends Base {
    private String role;

    protected String getRole() {
        return role;
    }

    protected void setRole(String role) {
        this.role = role;
    }

    public void printRole() {
        System.out.println(this.getRole());
    }
}
