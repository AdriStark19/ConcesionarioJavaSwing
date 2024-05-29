package Concesionario;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	private String database = "concesionario";		    
    private String hostname = "localhost";                                            // Host	   
    private String port = "3306";                                                     // Puerto	 
	private String login = "Adrian"; 
	private String pwddata = "MeganeRS";
	private String url = "jdbc:mysql://localhost/" + database;  // "jdbc:mysql://localhost/" + database;
	private Connection conexion;


		public Conexion() {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver"); // ("com.mysql.jdbc.Driver");
					conexion = DriverManager.getConnection(url, login, pwddata);
				} catch (ClassNotFoundException e) {
					System.out.println("Driver JDBC No encontrado");
					e.printStackTrace();
				} catch (SQLException e) {
					System.out.println("Error al conectarse a la BD");
					e.printStackTrace();
				} catch (Exception e) {
					System.out.println("Error general de Conexión");
					e.printStackTrace();
				}
			}

			public void terminar() {
				try {
					conexion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		public int insertar(Coche coche) {
			int resultado = 0;
			try {
				String query = "INSERT INTO coches (MARCA, MODELO, PRECIO_COCHE, COLOR, PRECIO_COLOR, MOTOR,PRECIO_MOTOR,VERSIÓN,VERSIÓN_PRECIO)"
						+ "VALUES (?,?,?,?,?,?,?,?,?)";
				PreparedStatement pstmt = conexion.prepareStatement(query);
				pstmt.setString(1, coche.getMarca());
				pstmt.setString(2, coche.getModelo());
				pstmt.setDouble(3, coche.getPrecio());
				pstmt.setString(4, coche.getColor().getNombre());
				pstmt.setDouble(5, coche.getColor().getPrecio());
				pstmt.setString(6, coche.getMotor().getNombre());
				pstmt.setDouble(7, coche.getMotor().getPrecio());
				pstmt.setString(8, coche.getVersion().getNombre());
				pstmt.setDouble(9, coche.getVersion().getPrecio());
				resultado = pstmt.executeUpdate();
				pstmt.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
			return resultado;
		}
		public int vender(Coche coche, String nombre, String apellido) {
			int resultado = 0;
			try {
				String query = "INSERT INTO clientes (NOMBRE,APELLIDO,MARCA,MODELO,COLOR,MOTOR,VERSIÓN)"
						+ "VALUES (?,?,?,?,?,?,?)";
				PreparedStatement pstmt = conexion.prepareStatement(query);
				pstmt.setString(1, nombre);
				pstmt.setString(2, apellido);
				pstmt.setString(3, coche.getMarca());
				pstmt.setString(4, coche.getModelo());
				pstmt.setString(5, coche.getColor().getNombre());
				pstmt.setString(6, coche.getMotor().getNombre());
				pstmt.setString(7, coche.getVersion().getNombre());
				resultado = pstmt.executeUpdate();
				pstmt.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
			return resultado;
		}
		public int modificar(Coche coche, int id) {
			int resultado = 0;
			try {
				String query = "UPDATE coches SET MARCA=?, MODELO=?, PRECIO_COCHE=?, COLOR=?, PRECIO_COLOR=?, MOTOR=?, PRECIO_MOTOR=?, "
						+ "VERSIÓN=?, VERSIÓN_PRECIO=? WHERE ID=?";
				PreparedStatement pstmt = conexion.prepareStatement(query);
				pstmt.setString(1, coche.getMarca());
				pstmt.setString(2, coche.getModelo());
				pstmt.setDouble(3, coche.getPrecio());
				pstmt.setString(4, coche.getColor().getNombre());
				pstmt.setDouble(5, coche.getColor().getPrecio());
				pstmt.setString(6, coche.getMotor().getNombre());
				pstmt.setDouble(7, coche.getMotor().getPrecio());
				pstmt.setString(8, coche.getVersion().getNombre());
				pstmt.setDouble(9, coche.getVersion().getPrecio());
				pstmt.setInt(10, id);
				resultado = pstmt.executeUpdate();
				pstmt.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
			return resultado;
		}
		public int borrar(int id) {
			int resultado = 0;
			try {
				String query = "DELETE FROM coches WHERE ID = ?";
				PreparedStatement pstmt = conexion.prepareStatement(query);
				pstmt.setInt(1, id);
				resultado = pstmt.executeUpdate();
				pstmt.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
			return resultado;
		}
		public int borrarCliente(int id) {
			int resultado = 0;
			try {
				String query = "DELETE FROM clientes WHERE ID = ?";
				PreparedStatement pstmt = conexion.prepareStatement(query);
				pstmt.setInt(1, id);
				resultado = pstmt.executeUpdate();
				pstmt.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
			return resultado;
		}
		public String [][] obtenerDatos(){
			try {
				Statement stmt = conexion.createStatement();
				String query = "SELECT count(*) AS cantidad FROM coches";
				ResultSet rset = stmt.executeQuery(query);
				rset.next();
				int size = rset.getInt("cantidad");
				String datos [][] = new String[size][11];
				query ="SELECT* FROM coches";
				rset = stmt.executeQuery(query);
				int i = 0;
				while (rset.next()) {
					datos[i][0] =Integer.toString((rset.getInt(1)));
					datos[i][1] =rset.getString(2);
					datos[i][2] =rset.getString(3);
					datos[i][3] =Double.toString(rset.getDouble(4));
					datos[i][4] =rset.getString(5);
					datos[i][5] =Double.toString(rset.getDouble(6));
					datos[i][6] =rset.getString(7);
					datos[i][7] =Double.toString(rset.getDouble(8));
					datos[i][8] =rset.getString(9);
					datos[i][9] =Double.toString(rset.getDouble(10));
					datos[i][10] =Double.toString(rset.getDouble(11));
					i++;
					}
				rset.close();
				stmt.close();
				return datos;
			}
			 catch (SQLException s) {
				s.printStackTrace();
				String datos [][] =null;
				return datos;
			}
		}
		public String [][] obtenerClientes(){
			try {
				Statement stmt = conexion.createStatement();
				String query = "SELECT count(*) AS cantidad FROM clientes";
				ResultSet rset = stmt.executeQuery(query);
				rset.next();
				int size = rset.getInt("cantidad");
				String datos [][] = new String[size][8];
				query ="SELECT* FROM clientes";
				rset = stmt.executeQuery(query);
				int i = 0;
				while (rset.next()) {
					datos[i][0] =Integer.toString((rset.getInt(1)));
					datos[i][1] =rset.getString(2);
					datos[i][2] =rset.getString(3);
					datos[i][3] =rset.getString(4);
					datos[i][4] =rset.getString(5);
					datos[i][5] =rset.getString(6);
					datos[i][6] =rset.getString(7);
					datos[i][7] =rset.getString(8);
					i++;
					}
				rset.close();
				stmt.close();
				return datos;
			}
			 catch (SQLException s) {
				s.printStackTrace();
				String datos [][] =null;
				return datos;
			}
		}
	public static void main(String[] args) {
		

	}

}
