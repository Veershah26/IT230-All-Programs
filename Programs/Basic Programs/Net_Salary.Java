class net_salary {
    public static void main(String[] args) {
        double netsalary, basicsalary = 60000, MA = 1000;
        double DA, HRA, PF, IT;
        DA = ((70 * basicsalary) / 100);
        HRA = ((15 * 60000) / 100);
        PF = ((8 * 60000) / 100);
        IT = ((12 * 60000) / 100);
        
        netsalary = (basicsalary + DA + HRA + MA - PF -IT);
        System.out.println("Net Salary Of Person Is: " + netsalary);
    }
}