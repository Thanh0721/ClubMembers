import java.util.ArrayList;

public class Main {
    public static void main(String[] args) 
    {
        ClubMembers club = new ClubMembers();

        String[] newMembers = {"SMITH, JANE", "FOX, STEVE", "XIN, MICHAEL", "GARCIA, MARIA"};
        club.addMembers(newMembers, 2023);
        System.out.println("Initial member list:");
        printMemberList(club.getMemberList());

        System.out.println("\nTesting removeMembers(2022):");
        ArrayList<MemberInfo> graduated = club.removeMembers(2022);
        System.out.println("Graduated members:");
        printMemberList(graduated);
        System.out.println("Current member list:");
        printMemberList(club.getMemberList());

        String[] moreMembers = {"WATSON, JOHN", "ADAMS, AMY"};
        club.addMembers(moreMembers, 2021);
        System.out.println("\nAdded some older members:");
        printMemberList(club.getMemberList());

        System.out.println("\nTesting removeMembers(2023):");
        graduated = club.removeMembers(2023);
        System.out.println("Graduated members:");
        printMemberList(graduated);
        System.out.println("Current member list:");
        printMemberList(club.getMemberList());
    }

    private static void printMemberList(ArrayList<MemberInfo> members) 
    {
        if (members.isEmpty()) 
        {
            System.out.println("No members in list");
            return;
        }

        for (MemberInfo member : members) 
        {
            System.out.println(member);
        }
    }
}