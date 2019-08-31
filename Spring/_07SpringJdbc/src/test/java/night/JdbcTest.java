package night;

import org.junit.Test;

import java.sql.*;

/**
 * @author: yanzx
 * @date: 2019/08/31 23:31
 */
public class JdbcTest {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/spring_test";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "yanzixuan";
    private static final String SQL = "select * from student where sid = ?";

    /**
     * og. jdbc
     */
    @Test
    public void test1() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;


        try {
            // 加载数据库驱动
            Class.forName(DRIVER);
            // 获取数据库连接
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            // 设置sql参数
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, 1);

            // 执行获取结果
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Student student = new Student();
                student.setSid(resultSet.getInt(1));
                student.setAge(resultSet.getInt(2));
                student.setSname(resultSet.getString(3));
                System.out.println(student);
            }
        } catch (Exception e) {

            e.printStackTrace();
        } finally {

            try {
                //释放资源
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 利用反射机set属性
     */
    @Test
    public void test2() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;


        try {
            // 加载数据库驱动
            Class.forName(DRIVER);
            // 获取数据库连接
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            // 设置sql参数
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, 1);

            // 执行获取结果
            resultSet = preparedStatement.executeQuery();

            Object student = Class.forName("night.Student").newInstance();

            while (resultSet.next()) {
                // 获取元数据的结果集
                ResultSetMetaData metaData = resultSet.getMetaData();
                // 结果数量
                int columnCount = metaData.getColumnCount();

                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    String columnTypeName = metaData.getColumnTypeName(i);

                    String setMethodName = getMethod(columnName);
                    if (columnTypeName.equals("INT")) {
                        student.getClass().getMethod(setMethodName, int.class)
                                .invoke(student, resultSet.getInt(columnName));

                    } else if (columnTypeName.equals("VARCHAR")) {
                        student.getClass().getMethod(setMethodName, String.class)
                                .invoke(student, resultSet.getString(columnName));

                    }
                }

                System.out.println(student);
            }
        } catch (Exception e) {

            e.printStackTrace();
        } finally {

            try {
                //释放资源
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 构件set方法名
     *
     * @param fieldName
     * @return setFieldName
     */
    private String getMethod(String fieldName) {
        return "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }
}
