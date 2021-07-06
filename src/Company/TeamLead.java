package Company;

public class TeamLead implements Timesheets, FirePeople {

    @Override
    public void fillOutTimesheets() {
        System.out.println("Team lead fills out timesheets");
    }

    @Override
    public void firePower(){
        System.out.println("YOU'RE FIRED!");
    };


}
