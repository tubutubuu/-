package org.dto;

import java.math.BigDecimal;
import java.sql.*;
import java.util.UUID;
import java.time.*;
import java.util.List;
/*
public class AllDataTypes {
    private Integer serialCol;
    private Integer intCol;
    private Short smallintCol;
    private Long bigintCol;
    private BigDecimal decimalCol;
    private BigDecimal numericCol;
    private Float realCol;
    private Double doubleCol;
    private BigDecimal moneyCol;
    private String charCol;
    private String varcharCol;
    private String textCol;
    private byte[] byteaCol;
    private Date dateCol;
    private Time timeCol;
    private Time timetzCol;
    private Timestamp timestampCol;
    private Timestamp timestamptzCol;
    private String intervalCol;  // Intervalは文字列として扱う
    private Boolean booleanCol;
    private String pointCol;     // Geometric typesは文字列として扱う
    private String lineCol;
    private String lsegCol;
    private String boxCol;
    private String pathCol;
    private String polygonCol;
    private String circleCol;
    private String cidrCol;
    private String inetCol;
    private String macaddrCol;
    private UUID uuidCol;
    private String jsonCol;
    private String jsonbCol;
    private String xmlCol;
    private List<Integer> arrayCol;
    private CompositeType compositeCol;

    // Getters and Setters

    public static class CompositeType {
        private Integer id;
        private String description;
        // Getters and Setters
    }

}
 */
public class AllDataTypes {
    public Integer serialCol;
    public Integer intCol;
    public Short smallintCol;
    public Long bigintCol;
    public Integer decimalCol;
    public Integer numericCol;
    public Float realCol;
    public Double doubleCol;
    public String moneyCol;
    public String charCol;
    public String varcharCol;
    public String textCol;
    public byte[] byteaCol;
    public Date dateCol;
    public Time timeCol;
    public Time timetzCol;
    public Timestamp timestampCol;
    public Timestamp timestamptzCol;
    public String intervalCol;  // Intervalは文字列として扱う
    public Boolean booleanCol;
    public String pointCol;     // Geometric typesは文字列として扱う
    public String lineCol;
    public String lsegCol;
    public String boxCol;
    public String pathCol;
    public String polygonCol;
    public String circleCol;
    public String cidrCol;
    public String inetCol;
    public String macaddrCol;
    public UUID uuidCol;
    public String jsonCol;
    public String jsonbCol;
    public String xmlCol;
    public List<Integer> arrayCol;
    public CompositeType compositeCol;

    public static class CompositeType {
        public Integer id;
        public String description;
        @Override
        public String toString() {
            return "CompositeType{" +
                    "id=" + id +
                    ", description='" + description + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "AllDataTypes{" +
                "serialCol=" + serialCol +
                ", intCol=" + intCol +
                ", smallintCol=" + smallintCol +
                ", bigintCol=" + bigintCol +
                ", decimalCol=" + decimalCol +
                ", numericCol=" + numericCol +
                ", realCol=" + realCol +
                ", doubleCol=" + doubleCol +
                ", moneyCol=" + moneyCol +
                ", charCol='" + charCol + '\'' +
                ", varcharCol='" + varcharCol + '\'' +
                ", textCol='" + textCol + '\'' +
                ", byteaCol=" + (byteaCol != null ? new String(byteaCol) : null) +
                ", dateCol=" + dateCol +
                ", timeCol=" + timeCol +
                ", timetzCol=" + timetzCol +
                ", timestampCol=" + timestampCol +
                ", timestamptzCol=" + timestamptzCol +
                ", intervalCol='" + intervalCol + '\'' +
                ", booleanCol=" + booleanCol +
                ", pointCol='" + pointCol + '\'' +
                ", lineCol='" + lineCol + '\'' +
                ", lsegCol='" + lsegCol + '\'' +
                ", boxCol='" + boxCol + '\'' +
                ", pathCol='" + pathCol + '\'' +
                ", polygonCol='" + polygonCol + '\'' +
                ", circleCol='" + circleCol + '\'' +
                ", cidrCol='" + cidrCol + '\'' +
                ", inetCol='" + inetCol + '\'' +
                ", macaddrCol='" + macaddrCol + '\'' +
                ", uuidCol=" + uuidCol +
                ", jsonCol='" + jsonCol + '\'' +
                ", jsonbCol='" + jsonbCol + '\'' +
                ", xmlCol='" + xmlCol + '\'' +
                ", arrayCol=" + arrayCol +
                ", compositeCol=" + compositeCol +
                '}';
    }
}