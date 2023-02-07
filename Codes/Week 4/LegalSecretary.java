public class LegalSecretary extends Secretary
{

    public int get_salary ()
    {
        return super.get_salary() + 5000;
    }
    public void file_legal_briefs ()
    {
        System.out.println("I could file all day!");
    }

}