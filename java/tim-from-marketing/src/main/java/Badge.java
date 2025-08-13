class Badge {
    public static String print(Integer id, String name, String department) {
        String badge;

        // 1. Print a badge for an employee
        badge = String.format("[%d] - %s - %S", id, name, department);

        // 2. Print a badge for a new employee
        if (id == null) badge = String.format("%s - %S", name, department);

        // 3. Print a badge for the owner
        if (department == null)  badge = String.format("[%d] - %s - OWNER", id, name);
        if (id == null && department == null)  badge = String.format("%s - OWNER", name);

        return badge;
    }

    /* public static void main(String[] args) {

        // 1. Print a badge for an employee
        Badge badge = new Badge();
        System.out.println(badge.print(734, "Ernest Johnny Payne", "Strategic Communication"));;
        // => "[734] - Ernest Johnny Payne - STRATEGIC COMMUNICATION"

        // 2. Print a badge for a new employee
        Badge badge2 = new Badge();
        System.out.println(Badge.print(null, "Jane Johnson", "Procurement"));;
        // => "Jane Johnson - PROCUREMENT"

        // 3. Print a badge for the owner
        Badge badge3 = new Badge();
        System.out.println(badge3.print(254, "Charlotte Hale", null));;
        // => "[254] - Charlotte Hale - OWNER"

        Badge badge4 = new Badge();
        System.out.println(badge4.print(null, "Charlotte Hale", null));;
        // => "Charlotte Hale - OWNER"
    } */
}
