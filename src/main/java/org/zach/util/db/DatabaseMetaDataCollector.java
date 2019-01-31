package org.zach.util.db;

import java.sql.*;

public class DatabaseMetaDataCollector {
    public static void main(String[] args) {
        getTableByName("IFP_PORTFOLIO");
//       getAllTables();
    }

    public static void getTableByName(String tableName) {
        String url = "jdbc:oracle:thin:@121.41.112.100:1521:orcl";
        String username = "bigdata";
        String password = "bigdata";
        String driverName = "oracle.jdbc.driver.OracleDriver";

        try {
            Class.forName(driverName);
            Connection conn = DriverManager.getConnection(url, username, password);
            DatabaseMetaData meta = conn.getMetaData();

            System.out.println("\n=== TABLE: " + tableName);

            String catalog = null, schemaPattern = null;
            String columnNamePattern = null;
            ResultSet rsColumns = meta.getColumns(catalog, schemaPattern, tableName, columnNamePattern);

            ResultSet rsPK = meta.getPrimaryKeys(catalog, schemaPattern, tableName);

            StringBuilder stringBuilder = new StringBuilder();
            while (rsColumns.next()) {
                String columnName = rsColumns.getString("COLUMN_NAME");
                String columnType = rsColumns.getString("TYPE_NAME");
                int columnSize = rsColumns.getInt("COLUMN_SIZE");
                String isNullable = rsColumns.getString("IS_NULLABLE");

                stringBuilder.append(columnName);
                System.out.println("\t" + columnName + " - " + columnType + "(" + columnSize + ")" + isNullable);
            }

            while (rsPK.next()) {
                String primaryKeyColumn = rsPK.getString("COLUMN_NAME");
                System.out.println("\tPrimary Key Column: " + primaryKeyColumn);
            }


        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void getAllTables() {
        String url = "jdbc:oracle:thin:@121.41.112.100:1521:orcl";
        String username = "bigdata";
        String password = "bigdata";
        String driverName = "oracle.jdbc.driver.OracleDriver";

        try {
            Class.forName(driverName);
            Connection conn = DriverManager.getConnection(url, username, password);
            DatabaseMetaData meta = conn.getMetaData();

            String catalog = null, schemaPattern = null, tableNames = null;
            String[] types = {"TABLE"};

            ResultSet rsTables = meta.getTables(catalog, schemaPattern, tableNames, types);


            while (rsTables.next()) {
                String tableName = rsTables.getString(3);
                System.out.println("\n=== TABLE: " + tableName);

                String columnNamePattern = null;
                ResultSet rsColumns = meta.getColumns(catalog, schemaPattern, tableName, columnNamePattern);

                ResultSet rsPK = meta.getPrimaryKeys(catalog, schemaPattern, tableName);

                while (rsColumns.next()) {
                    String columnName = rsColumns.getString("COLUMN_NAME");
                    String columnType = rsColumns.getString("TYPE_NAME");
                    int columnSize = rsColumns.getInt("COLUMN_SIZE");
                    System.out.println("\t" + columnName + " - " + columnType + "(" + columnSize + ")");
                }

                while (rsPK.next()) {
                    String primaryKeyColumn = rsPK.getString("COLUMN_NAME");
                    System.out.println("\tPrimary Key Column: " + primaryKeyColumn);
                }

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
