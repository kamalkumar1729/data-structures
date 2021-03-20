package learnjava.java8;

public class GridData {

    private Double rsrp;
    private Double sinr;
    private Double traffic;
    private Long users;

    public GridData() { }

    public GridData(Double rsrp, Double sinr, Double traffic, Long users) {
        this.rsrp = rsrp;
        this.sinr = sinr;
        this.traffic = traffic;
        this.users = users;
    }

    public Double getRsrp() {
        return rsrp;
    }

    public void setRsrp(Double rsrp) {
        this.rsrp = rsrp;
    }

    public Double getSinr() {
        return sinr;
    }

    public void setSinr(Double sinr) {
        this.sinr = sinr;
    }

    public Double getTraffic() {
        return traffic;
    }

    public void setTraffic(Double traffic) {
        this.traffic = traffic;
    }

    public Long getUsers() {
        return users;
    }

    public void setUsers(Long users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "GridData{" +
                "rsrp=" + rsrp +
                ", sinr=" + sinr +
                ", traffic=" + traffic +
                ", users=" + users +
                '}';
    }

    public static String rsrpGroups(GridData grid) {
        Double rsrp = grid.getRsrp();
        if (rsrp != null) {
            if (rsrp >= -90.00 && rsrp < -40.00) return "r_90_40";
            else if (rsrp >= -95.00 && rsrp < -90.00) return "r_95_90";
            else if (rsrp >= -100.00 && rsrp < -95.00) return "r_100_95";
            else if (rsrp >= -105.00 && rsrp < -100.00) return "r_105_100";
            else if (rsrp >= -113.00 && rsrp < -105.00) return "r_113_105";
            else if (rsrp >= -140.00 && rsrp < -113.00) return "r_140_113";
            return "NULL";
        }
        return "NULL";
    }

    public static String sinrGroups(GridData grid) {
        Double sinr = grid.getSinr();
        if (sinr != null) {
            if (sinr >= -6.00 && sinr < -2.00) return "s_6_2";
            else if (sinr >= -2.00 && sinr < 0.00) return "s_2_0";
            else if (sinr >= 0.00 && sinr < 10.00) return "s_0_10";
            else if (sinr >= 10.00 && sinr < 20.00) return "s_10_20";
            else if (sinr >= 20.00 && sinr < 25.00) return "s_20_25";
            else if (sinr >= 25.00 && sinr < 40.00) return "s_25_40";
            return "NULL";
        }
        return "NULL";
    }

    public static String trafficGroups(GridData grid) {
        Double traffic = grid.getTraffic();
        if (traffic != null) {
            if (traffic <= 100.00) return "t_0_100";
            else if (traffic <= 200.00) return "t_100_200";
            else if (traffic <= 500.00) return "t_200_500";
            else if (traffic <= 1000.00) return "t_500_1000";
            else if (traffic <= 2000.00) return "t_1000_2000";
            return "t_gt_2000";
        }
        return "NULL";
    }

    public static String usersGroups(GridData grid) {
        Long users = grid.getUsers();
        if (users != null) {
            if (users <= 10) return "u_0_10";
            else if (users <= 100) return "u_10_100";
            else if (users <= 1000) return "u_100_1000";
            else if (users <= 10000) return "u_1000_10000";
            else if (users <= 100000) return "u_10000_100000";
            return "u_gt_100000";
        }
        return "NULL";
    }
}

