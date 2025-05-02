public class MemberInfo {
    private String name;
    private int gradYear;
    private boolean hasGoodStanding;

    public MemberInfo(String name, int gradYear, boolean hasGoodStanding) 
    {
        this.name = name;
        this.gradYear = gradYear;
        this.hasGoodStanding = hasGoodStanding;
    }

    public int getGradYear()
    {
        return gradYear;
    }

    public boolean inGoodStanding() 
    {
        return hasGoodStanding;
    }

    public String toString() 
    {
        String s = "\nName: " + name + "\n";
        s += "Year: " + gradYear + "\n";
        return s + "Good Standing: " + hasGoodStanding + "\n";
    }
}