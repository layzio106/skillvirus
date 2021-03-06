package com.koreait.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import com.koreait.controller.Manager;
import com.koreait.model.UserInfo;

public class Viewer {

	private JFrame frmMain;
	private JMenuBar mnubMain;
	private JMenu mnuFile;
	private JMenuItem mnuiHome;
	private JMenuItem mnuiEnd;
	private JMenu mnuUserInfoMng;
	private JMenuItem mnuiUserInfoInsert;
	private JMenuItem mnuiUserInfoDelete;
	private JMenuItem mnuiUserInfoUpdate;
	private JMenuItem mnuiUserInfoSelect;
	private JMenu mnuBookInfoMng;
	private JMenuItem mnuiBookInfoInsert;
	private JMenuItem mnuiBookInfoDelete;
	private JMenuItem mnuiBookInfoUpdate;
	private JMenuItem mnuiBookInfoSelect;
	private JMenu mnuBookRentalMng;
	private JMenuItem mnuiBookRentalInsert;
	private JMenuItem mnuiBookReturnInsert;
	private JMenuItem mnuiBookRentalHistorySelect;
	private JMenu mnuHelp;
	private JPanel pnlMain;
	private JLabel lblMainTitle;
	private JLabel lblResultInfo;
	private JPanel pnlUserInfoInsert;
	private JLabel lblUserInfoInsertPnlTitle;
	private JPanel pnlUserInfoDelete;
	private JLabel lblUserInfoDeletePnlTitle;
	private JPanel pnlUserInfoUpdate;
	private JLabel lblUserInfoUpdatePnlTitle;
	private JPanel pnlUserInfoSelect;
	private JLabel lblUserInfoSelectPnlTitle;
	private JPanel pnlBookInfoInsert;
	private JLabel lblBookInfoInsertPnlTitle;
	private JPanel pnlBookInfoDelete;
	private JLabel lblBookInfoDeletePnlTitle;
	private JPanel pnlBookInfoUpdate;
	private JLabel lblBookInfoUpdatePnlTitle;
	private JPanel pnlBookInfoSelect;
	private JLabel lblBookInfoSelectPnlTitle;
	private JPanel pnlBookRentalInsert;
	private JLabel lblBookRentalInsertPnlTitle;
	private JPanel pnlBookReturnInsert;
	private JLabel lblBookReturnInsertPnlTitle;
	private JPanel pnlBookRentalHistorySelect;
	private JLabel lblBookRentalHistorySelectPnlTitle;
	private JTextField txfUserInfoInsertID;
	private JTextField txfUserInfoInsertName;
	private JTextField txfUserInfoInsertPhoneNum;
	private JLabel lblUserInfoInsertID;
	private JLabel lblUserInfoInsertName;
	private JLabel lblUserInfoInsertPhoneNum;
	private JButton btnUserInfoInsert;
	private JTextField txfUserInfoDeleteID;
	private JLabel lblUserInfoDeleteID;
	private JButton btnUserInfoDelete;
	private JScrollPane scrpUserInfo;
	private JTable tblUserInfo;
	private DefaultTableModel tblUserInfoTableModel;
	private JButton btnUserInfoSelect;
	private JTextField txfUserInfoSelectID;
	private JTextField txfUserInfoSelectName;
	private JTextField txfUserInfoSelectPhoneNum;
	private JTextField txfUserInfoUpdateID;
	private JTextField txfUserInfoUpdateName;
	private JTextField txfUserInfoUpdatePhoneNum;
	private JLabel lblUserInfoUpdateID;
	private JLabel lblUserInfoUpdatePhoneNum;
	private JLabel lblUserInfoUpdateName;
	private JButton btnUserInfoUpdate;
	private JLabel lblUserInfoSelectID;
	private JLabel lblUserInfoSelectName;
	private JLabel lblUserInfoSelectPhoneNum;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Viewer window = new Viewer();
					window.frmMain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Viewer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMain = new JFrame();

		frmMain.setTitle("?????? ?????? ??????");
		frmMain.setBounds(100, 100, 650, 420);
		frmMain.setLocationRelativeTo(null); //?????? ???????????? ??????
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMain.getContentPane().setLayout(null);
		frmMain.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				setPanelVisible("pnlMain");
			}
		});
		
		pnlUserInfoUpdate = new JPanel();
		pnlUserInfoUpdate.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlUserInfoUpdate);
		pnlUserInfoUpdate.setLayout(null);
		
		lblUserInfoUpdatePnlTitle = new JLabel("[????????? ?????? ??????]");
		lblUserInfoUpdatePnlTitle.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		lblUserInfoUpdatePnlTitle.setBounds(5, 5, 200, 15);
		pnlUserInfoUpdate.add(lblUserInfoUpdatePnlTitle);
		
		lblUserInfoUpdateID = new JLabel("ID");
		lblUserInfoUpdateID.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		lblUserInfoUpdateID.setBounds(10, 54, 57, 15);
		pnlUserInfoUpdate.add(lblUserInfoUpdateID);
		
		txfUserInfoUpdateID = new JTextField();
		txfUserInfoUpdateID.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		txfUserInfoUpdateID.setColumns(10);
		txfUserInfoUpdateID.setBounds(81, 51, 116, 21);
		pnlUserInfoUpdate.add(txfUserInfoUpdateID);
		
		txfUserInfoUpdateName = new JTextField();
		txfUserInfoUpdateName.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		txfUserInfoUpdateName.setColumns(10);
		txfUserInfoUpdateName.setBounds(81, 79, 116, 21);
		pnlUserInfoUpdate.add(txfUserInfoUpdateName);
		
		txfUserInfoUpdatePhoneNum = new JTextField();
		txfUserInfoUpdatePhoneNum.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		txfUserInfoUpdatePhoneNum.setColumns(10);
		txfUserInfoUpdatePhoneNum.setBounds(81, 107, 116, 21);
		pnlUserInfoUpdate.add(txfUserInfoUpdatePhoneNum);
		
		lblUserInfoUpdatePhoneNum = new JLabel("????????????");
		lblUserInfoUpdatePhoneNum.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		lblUserInfoUpdatePhoneNum.setBounds(10, 110, 57, 15);
		pnlUserInfoUpdate.add(lblUserInfoUpdatePhoneNum);
		
		lblUserInfoUpdateName = new JLabel("??????");
		lblUserInfoUpdateName.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		lblUserInfoUpdateName.setBounds(10, 82, 57, 15);
		pnlUserInfoUpdate.add(lblUserInfoUpdateName);
		
		btnUserInfoUpdate = new JButton("??????");
		btnUserInfoUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserInfo userInfo = new UserInfo(); //????????? ???????????? ??????(Model ??????)
				Manager manager = new Manager(); //????????? ?????? ??????(??????,??????,??????, ??????)??? ??????(Controller ??????)
				boolean result = false;
				
				try {
					userInfo.setUserID(txfUserInfoUpdateID.getText());
					userInfo.setUserName(txfUserInfoUpdateName.getText());
					userInfo.setUserPhoneNum(txfUserInfoUpdatePhoneNum.getText());
					
					if (Tools.openAlert("?????????????????????????") == 0) {
						result = manager.updateUserInfo(userInfo);
						
						if (result == true) {
							Tools.setText(lblResultInfo, "?????? ??????", 3, Tools.messageType.SUCCESS);
						} else {
							Tools.setText(lblResultInfo, "?????? ??????", 3, Tools.messageType.ERROR);
						}
					}
				} catch(Exception ex) {
					Tools.setText(lblResultInfo, ex.getMessage(), 3, Tools.messageType.ERROR);
				} finally {
					manager.closeDataBaseConnection();
				}
			}
		});
		btnUserInfoUpdate.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		btnUserInfoUpdate.setBounds(10, 302, 97, 23);
		pnlUserInfoUpdate.add(btnUserInfoUpdate);
		
		pnlUserInfoInsert = new JPanel();
		pnlUserInfoInsert.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlUserInfoInsert);
		pnlUserInfoInsert.setLayout(null);
		
		lblUserInfoInsertPnlTitle = new JLabel("[????????? ?????? ??????]");
		lblUserInfoInsertPnlTitle.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		lblUserInfoInsertPnlTitle.setBounds(5, 5, 200, 15);
		pnlUserInfoInsert.add(lblUserInfoInsertPnlTitle);
		
		lblUserInfoInsertID = new JLabel("ID");
		lblUserInfoInsertID.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		lblUserInfoInsertID.setBounds(10, 54, 57, 15);
		pnlUserInfoInsert.add(lblUserInfoInsertID);
		
		txfUserInfoInsertID = new JTextField();
		txfUserInfoInsertID.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		txfUserInfoInsertID.setBounds(81, 51, 116, 21);
		pnlUserInfoInsert.add(txfUserInfoInsertID);
		txfUserInfoInsertID.setColumns(10);
		
		lblUserInfoInsertName = new JLabel("??????");
		lblUserInfoInsertName.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		lblUserInfoInsertName.setBounds(10, 82, 57, 15);
		pnlUserInfoInsert.add(lblUserInfoInsertName);
		
		txfUserInfoInsertName = new JTextField();
		txfUserInfoInsertName.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		txfUserInfoInsertName.setColumns(10);
		txfUserInfoInsertName.setBounds(81, 79, 116, 21);
		pnlUserInfoInsert.add(txfUserInfoInsertName);
		
		lblUserInfoInsertPhoneNum = new JLabel("????????????");
		lblUserInfoInsertPhoneNum.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		lblUserInfoInsertPhoneNum.setBounds(10, 110, 57, 15);
		pnlUserInfoInsert.add(lblUserInfoInsertPhoneNum);
		
		txfUserInfoInsertPhoneNum = new JTextField();
		txfUserInfoInsertPhoneNum.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		txfUserInfoInsertPhoneNum.setColumns(10);
		txfUserInfoInsertPhoneNum.setBounds(81, 107, 116, 21);
		pnlUserInfoInsert.add(txfUserInfoInsertPhoneNum);
		
		//????????? ?????? ??????
		btnUserInfoInsert = new JButton("??????");
		btnUserInfoInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

//				//1?????? : MVC ?????? ?????? ??????_S
//				//1. DB ??????
//				//2. DB??? ????????? ?????? ??????
//				//3. ?????? ??????
//				//4. ?????? ??????
//				Connection connection = null; //?????????????????? ????????? ??????(??????)??? ???????????? ??????
//				PreparedStatement preparedStatement = null; //SQL?????? ???????????? ??????
//				String queryString;
//				
//				try {
//					queryString = "	INSERT INTO UserInfo"
//					+ "	("
//					+ "		UserID,"
//					+ "		UserName,"
//					+ " 	UserPhoneNum"
//					+ " )"
//					+ " VALUES"
//					+ " ("
//					+ "		?,"
//					+ "		?,"
//					+ "		?"
//					+ " );";
//					
//					Class.forName("org.sqlite.JDBC");
//					connection = DriverManager.getConnection("jdbc:sqlite:./././Resources/Database/BookManagement.db");
//					preparedStatement = connection.prepareStatement(queryString);
//					
////					preparedStatement.setString(1, "16");
////					preparedStatement.setString(2, "?????????16");
////					preparedStatement.setString(3, "010-0000-0016");
//					
//					//???????????? ???????????? ????????? ??????
//					preparedStatement.setString(1, txfUserInfoInsertID.getText());
//					preparedStatement.setString(2, txfUserInfoInsertName.getText());
//					preparedStatement.setString(3, txfUserInfoInsertPhoneNum.getText());
//					
//					preparedStatement.executeUpdate();
//							
//					connection.close();
//					
//				} catch (Exception ex) {
//					lblResultInfo.setText(ex.getMessage());
//				}
//				//1?????? : MVC ?????? ?????? ??????_E
				
//				//2?????? : DAO ????????? ??????(MVC ?????????)_S
//				DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
//				String queryString;
//
//				try {
//					queryString = "	INSERT INTO UserInfo"
//								+ "	("
//								+ "		UserID,"
//								+ "		UserName,"
//								+ " 	UserPhoneNum"
//								+ " )"
//								+ " VALUES"
//								+ " ("
//								+ "		?,"
//								+ "		?,"
//								+ "		?"
//								+ " );";
//					
//					ArrayList<DataPack> dataPack = new ArrayList<DataPack>();
//					dataPack.add(new DataPack(1, txfUserInfoInsertID.getText()));
//					dataPack.add(new DataPack(2, txfUserInfoInsertName.getText()));
//					dataPack.add(new DataPack(3, txfUserInfoInsertPhoneNum.getText()));
//					
//					databaseAccessHelper.executeNonQuery(queryString, dataPack);
//				} catch(Exception ex) {
//					System.out.println(ex.getMessage());
//				} finally {
//					if (databaseAccessHelper != null) {
//						databaseAccessHelper.close();
//					}
//				}
//				//2?????? : DAO ????????? ??????(MVC ?????????)_E
				
				//3?????? : MVC ?????? ??????_S
				UserInfo userInfo = new UserInfo(); //????????? ???????????? ??????(Model ??????)
				Manager manager = new Manager(); //????????? ?????? ??????(??????,??????,??????, ??????)??? ??????(Controller ??????)
				boolean result = false;;
				
				try {
					userInfo.setUserID(txfUserInfoInsertID.getText());
					userInfo.setUserName(txfUserInfoInsertName.getText());
					userInfo.setUserPhoneNum(txfUserInfoInsertPhoneNum.getText());
					
					result = manager.insertUserInfo(userInfo);
					
					if (result == true) {
						Tools.setText(lblResultInfo, "?????? ??????", 3, Tools.messageType.SUCCESS);
					} else {
						Tools.setText(lblResultInfo, "?????? ??????", 3, Tools.messageType.ERROR);
					}
				} catch(Exception ex) {
					Tools.setText(lblResultInfo, ex.getMessage(), 3, Tools.messageType.ERROR);
				} finally {
					manager.closeDataBaseConnection();
				}
				//3?????? : MVC ?????? ??????_E
			}
		});
		btnUserInfoInsert.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		btnUserInfoInsert.setBounds(10, 302, 97, 23);
		pnlUserInfoInsert.add(btnUserInfoInsert);
		
		pnlUserInfoSelect = new JPanel();
		pnlUserInfoSelect.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlUserInfoSelect);
		pnlUserInfoSelect.setLayout(null);
		
		lblUserInfoSelectPnlTitle = new JLabel("[????????? ?????? ??????]");
		lblUserInfoSelectPnlTitle.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		lblUserInfoSelectPnlTitle.setBounds(5, 5, 200, 15);
		pnlUserInfoSelect.add(lblUserInfoSelectPnlTitle);
		
		String[] tblUserInfoColName = {"?????????ID", "???????????????", "?????????????????????"};
		tblUserInfoTableModel = new DefaultTableModel(tblUserInfoColName, 0);
		
		tblUserInfo = new JTable(tblUserInfoTableModel);
		tblUserInfo.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		tblUserInfo.setBounds(10, 50, 410, 155);
		
		scrpUserInfo = new JScrollPane(tblUserInfo);
		scrpUserInfo.setBounds(10, 50, 612, 242);
		pnlUserInfoSelect.add(scrpUserInfo);
		
		btnUserInfoSelect = new JButton("??????");
		btnUserInfoSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserInfo userInfo = new UserInfo(); //????????? ???????????? ??????(Model ??????)
				Manager manager = new Manager(); //????????? ?????? ??????(??????,??????,??????, ??????)??? ??????(Controller ??????)
				ResultSet resultSet = null;
				
				try
				{
					userInfo.setUserID(txfUserInfoSelectID.getText());
					userInfo.setUserName(txfUserInfoSelectName.getText());
					userInfo.setUserPhoneNum(txfUserInfoSelectPhoneNum.getText());
					resultSet = manager.selectUserInfo(userInfo);
					
					tblUserInfoTableModel.setNumRows(0);
					try {
						while(resultSet.next() ) {
							tblUserInfoTableModel.addRow(new Object[]{
														resultSet.getString("UserID"), 
														resultSet.getString("UserName"),
														resultSet.getString("UserPhoneNum")
													 });
						}
						
						Tools.setText(lblResultInfo, "?????? ??????", 3, Tools.messageType.SUCCESS);
					} catch (SQLException e1) {
						Tools.setText(lblResultInfo, e1.getMessage(), 3, Tools.messageType.ERROR);
					} finally {
						if (resultSet != null) {
							try {
								resultSet.close();
							} catch (SQLException e1) {
								Tools.setText(lblResultInfo, e1.getMessage(), 3, Tools.messageType.ERROR);
							}
						}
					}
				} catch (Exception ex) {
					Tools.setText(lblResultInfo, ex.getMessage(), 3, Tools.messageType.ERROR);
				} finally {
					manager.closeDataBaseConnection();
					manager.closeResultSet();
				}
			}
		});
		btnUserInfoSelect.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		btnUserInfoSelect.setBounds(10, 302, 97, 23);
		pnlUserInfoSelect.add(btnUserInfoSelect);
		
		lblUserInfoSelectID = new JLabel("ID");
		lblUserInfoSelectID.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		lblUserInfoSelectID.setBounds(10, 30, 57, 15);
		pnlUserInfoSelect.add(lblUserInfoSelectID);
		
		txfUserInfoSelectID = new JTextField();
		txfUserInfoSelectID.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		txfUserInfoSelectID.setBounds(80, 27, 97, 21);
		pnlUserInfoSelect.add(txfUserInfoSelectID);
		txfUserInfoSelectID.setColumns(10);
		
		txfUserInfoSelectName = new JTextField();
		txfUserInfoSelectName.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		txfUserInfoSelectName.setColumns(10);
		txfUserInfoSelectName.setBounds(256, 27, 97, 21);
		pnlUserInfoSelect.add(txfUserInfoSelectName);
		
		lblUserInfoSelectName = new JLabel("??????");
		lblUserInfoSelectName.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		lblUserInfoSelectName.setBounds(186, 30, 57, 15);
		pnlUserInfoSelect.add(lblUserInfoSelectName);
		
		txfUserInfoSelectPhoneNum = new JTextField();
		txfUserInfoSelectPhoneNum.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		txfUserInfoSelectPhoneNum.setColumns(10);
		txfUserInfoSelectPhoneNum.setBounds(435, 27, 187, 21);
		pnlUserInfoSelect.add(txfUserInfoSelectPhoneNum);
		
		lblUserInfoSelectPhoneNum = new JLabel("????????????");
		lblUserInfoSelectPhoneNum.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		lblUserInfoSelectPhoneNum.setBounds(365, 30, 57, 15);
		pnlUserInfoSelect.add(lblUserInfoSelectPhoneNum);
						
		pnlUserInfoDelete = new JPanel();
		pnlUserInfoDelete.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlUserInfoDelete);
		pnlUserInfoDelete.setLayout(null);
		
		lblUserInfoDeletePnlTitle = new JLabel("[????????? ?????? ??????]");
		lblUserInfoDeletePnlTitle.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		lblUserInfoDeletePnlTitle.setBounds(5, 5, 200, 15);
		pnlUserInfoDelete.add(lblUserInfoDeletePnlTitle);
		
		lblUserInfoDeleteID = new JLabel("ID");
		lblUserInfoDeleteID.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		lblUserInfoDeleteID.setBounds(10, 54, 57, 15);
		pnlUserInfoDelete.add(lblUserInfoDeleteID);
		
		txfUserInfoDeleteID = new JTextField();
		txfUserInfoDeleteID.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		txfUserInfoDeleteID.setColumns(10);
		txfUserInfoDeleteID.setBounds(81, 51, 116, 21);
		pnlUserInfoDelete.add(txfUserInfoDeleteID);
		
		btnUserInfoDelete = new JButton("??????");
		btnUserInfoDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				//1?????? : MVC ?????? ?????? ??????_S
//				//1. DB ??????
//				//2. DB??? ????????? ?????? ??????
//				//3. ?????? ??????
//				//4. ?????? ??????
//				Connection connection = null; //?????????????????? ????????? ??????(??????)??? ???????????? ??????
//				PreparedStatement preparedStatement = null; //SQL?????? ???????????? ??????
//				String queryString;
//				
//				try {
//					queryString = "	DELETE"
//								+ "	FROM UserInfo"
//								+ "	WHERE UserID = ?";
//					
//					Class.forName("org.sqlite.JDBC");
//					connection = DriverManager.getConnection("jdbc:sqlite:./././Resources/Database/BookManagement.db");
//					preparedStatement = connection.prepareStatement(queryString);
//					
//					//???????????? ???????????? ????????? ??????
//					preparedStatement.setString(1, txfUserInfoDeleteID.getText());
//					
//					preparedStatement.executeUpdate();
//							
//					connection.close();
//					
//				} catch (Exception ex) {
//					lblResultInfo.setText(ex.getMessage());
//				}
//				//1?????? : MVC ?????? ?????? ??????_E
				
//				//2?????? : DAO ????????? ??????(MVC ?????????)_S
//				DatabaseAccessHelper databaseAccessHelper = new DatabaseAccessHelper();
//				String queryString;
//
//				try {
//					queryString = "	DELETE"
//								+ "	FROM UserInfo"
//								+ "	WHERE UserID = ?";
//					
//					ArrayList<DataPack> dataPack = new ArrayList<DataPack>();
//					dataPack.add(new DataPack(1, txfUserInfoDeleteID.getText()));
//					
//					databaseAccessHelper.executeNonQuery(queryString, dataPack);
//				} catch(Exception ex) {
//					System.out.println(ex.getMessage());
//				} finally {
//					if (databaseAccessHelper != null) {
//						databaseAccessHelper.close();
//					}
//				}
				//2?????? : DAO ????????? ??????(MVC ?????????)_E
				
				//3?????? : MVC ?????? ??????_S
				UserInfo userInfo = new UserInfo(); //????????? ???????????? ??????(Model ??????)
				Manager manager = new Manager(); //????????? ?????? ??????(??????,??????,??????, ??????)??? ??????(Controller ??????)
				boolean result = false;
				
				try {
					userInfo.setUserID(txfUserInfoDeleteID.getText());
					
					if (Tools.openAlert("?????????????????????????") == 0) {
						result = manager.deleteUserInfo(userInfo);
						
						if (result == true) {
							Tools.setText(lblResultInfo, "?????? ??????", 3, Tools.messageType.SUCCESS);
						} else {
							Tools.setText(lblResultInfo, "?????? ??????", 3, Tools.messageType.ERROR);
						}
					}
				} catch(Exception ex) {
					Tools.setText(lblResultInfo, ex.getMessage(), 3, Tools.messageType.ERROR);
				} finally {
					manager.closeDataBaseConnection();	
				}
				//3?????? : MVC ?????? ??????_E
			}
		});
		btnUserInfoDelete.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		btnUserInfoDelete.setBounds(10, 302, 97, 23);
		pnlUserInfoDelete.add(btnUserInfoDelete);
		
		mnubMain = new JMenuBar();
		mnubMain.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		mnubMain.setBounds(0, 0, 634, 23);
		frmMain.getContentPane().add(mnubMain);
		
		mnuFile = new JMenu("??????");
		mnuFile.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		mnubMain.add(mnuFile);
		
		mnuiHome = new JMenuItem("???");
		mnuiHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelVisible("pnlMain");
			}
		});
		mnuiHome.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		mnuFile.add(mnuiHome);
		
		mnuiEnd = new JMenuItem("??????");
		mnuiEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnuiEnd.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		mnuFile.add(mnuiEnd);
		
		mnuUserInfoMng = new JMenu("????????? ?????? ??????");
		mnuUserInfoMng.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		mnubMain.add(mnuUserInfoMng);
		
		mnuiUserInfoInsert = new JMenuItem("????????? ?????? ??????");
		mnuiUserInfoInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelVisible("pnlUserInfoInsert");
			}
		});
		mnuiUserInfoInsert.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		mnuUserInfoMng.add(mnuiUserInfoInsert);
		
		mnuiUserInfoDelete = new JMenuItem("????????? ?????? ??????");
		mnuiUserInfoDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelVisible("pnlUserInfoDelete");
			}
		});
		mnuiUserInfoDelete.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		mnuUserInfoMng.add(mnuiUserInfoDelete);
		
		mnuiUserInfoUpdate = new JMenuItem("????????? ?????? ??????");
		mnuiUserInfoUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelVisible("pnlUserInfoUpdate");
			}
		});
		mnuiUserInfoUpdate.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		mnuUserInfoMng.add(mnuiUserInfoUpdate);
		
		mnuiUserInfoSelect = new JMenuItem("????????? ?????? ??????");
		mnuiUserInfoSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelVisible("pnlUserInfoSelect");
			}
		});
		mnuiUserInfoSelect.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		mnuUserInfoMng.add(mnuiUserInfoSelect);
		
		mnuBookInfoMng = new JMenu("?????? ?????? ??????");
		mnuBookInfoMng.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		mnubMain.add(mnuBookInfoMng);
		
		mnuiBookInfoInsert = new JMenuItem("?????? ?????? ??????");
		mnuiBookInfoInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelVisible("pnlBookInfoInsert");
			}
		});
		mnuiBookInfoInsert.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		mnuBookInfoMng.add(mnuiBookInfoInsert);
		
		mnuiBookInfoDelete = new JMenuItem("?????? ?????? ??????");
		mnuiBookInfoDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelVisible("pnlBookInfoDelete");
			}
		});
		mnuiBookInfoDelete.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		mnuBookInfoMng.add(mnuiBookInfoDelete);
		
		mnuiBookInfoUpdate = new JMenuItem("?????? ?????? ??????");
		mnuiBookInfoUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelVisible("pnlBookInfoUpdate");
			}
		});
		mnuiBookInfoUpdate.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		mnuBookInfoMng.add(mnuiBookInfoUpdate);
		
		mnuiBookInfoSelect = new JMenuItem("?????? ?????? ??????");
		mnuiBookInfoSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelVisible("pnlBookInfoSelect");
			}
		});
		mnuiBookInfoSelect.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		mnuBookInfoMng.add(mnuiBookInfoSelect);
		
		mnuBookRentalMng = new JMenu("?????? ?????? ??????");
		mnuBookRentalMng.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		mnubMain.add(mnuBookRentalMng);
		
		mnuiBookRentalInsert = new JMenuItem("?????? ?????? ??????");
		mnuiBookRentalInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelVisible("pnlBookRentalInsert");
			}
		});
		mnuiBookRentalInsert.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		mnuBookRentalMng.add(mnuiBookRentalInsert);
		
		mnuiBookReturnInsert = new JMenuItem("?????? ?????? ??????");
		mnuiBookReturnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelVisible("pnlBookReturnInsert");
			}
		});
		mnuiBookReturnInsert.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		mnuBookRentalMng.add(mnuiBookReturnInsert);
		
		mnuiBookRentalHistorySelect = new JMenuItem("?????? ?????? ?????? ??????");
		mnuiBookRentalHistorySelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelVisible("pnlBookRentalHistorySelect");
			}
		});
		mnuiBookRentalHistorySelect.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		mnuBookRentalMng.add(mnuiBookRentalHistorySelect);
		
		mnuHelp = new JMenu("?????????");
		mnuHelp.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		mnubMain.add(mnuHelp);
		
		pnlMain = new JPanel();
		pnlMain.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlMain);
		pnlMain.setLayout(null);
		
		lblMainTitle = new JLabel("?????? ?????? ?????? ????????????");
		lblMainTitle.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMainTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblMainTitle.setFont(new Font("?????? ??????", Font.PLAIN, 22));
		lblMainTitle.setBounds(0, 125, 634, 57);
		pnlMain.add(lblMainTitle);
		
		lblResultInfo = new JLabel("");
		lblResultInfo.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		lblResultInfo.setBounds(0, 358, 634, 23);
		frmMain.getContentPane().add(lblResultInfo);
		
		pnlBookInfoInsert = new JPanel();
		pnlBookInfoInsert.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlBookInfoInsert);
		pnlBookInfoInsert.setLayout(null);
		
		lblBookInfoInsertPnlTitle = new JLabel("[?????? ?????? ??????]");
		lblBookInfoInsertPnlTitle.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		lblBookInfoInsertPnlTitle.setBounds(5, 5, 200, 15);
		pnlBookInfoInsert.add(lblBookInfoInsertPnlTitle);
		
		pnlBookInfoDelete = new JPanel();
		pnlBookInfoDelete.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlBookInfoDelete);
		pnlBookInfoDelete.setLayout(null);
		
		lblBookInfoDeletePnlTitle = new JLabel("[?????? ?????? ??????]");
		lblBookInfoDeletePnlTitle.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		lblBookInfoDeletePnlTitle.setBounds(5, 5, 200, 15);
		pnlBookInfoDelete.add(lblBookInfoDeletePnlTitle);
		
		pnlBookInfoUpdate = new JPanel();
		pnlBookInfoUpdate.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlBookInfoUpdate);
		pnlBookInfoUpdate.setLayout(null);
		
		lblBookInfoUpdatePnlTitle = new JLabel("[?????? ?????? ??????]");
		lblBookInfoUpdatePnlTitle.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		lblBookInfoUpdatePnlTitle.setBounds(5, 5, 200, 15);
		pnlBookInfoUpdate.add(lblBookInfoUpdatePnlTitle);
		
		pnlBookInfoSelect = new JPanel();
		pnlBookInfoSelect.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlBookInfoSelect);
		pnlBookInfoSelect.setLayout(null);
		
		lblBookInfoSelectPnlTitle = new JLabel("[?????? ?????? ??????]");
		lblBookInfoSelectPnlTitle.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		lblBookInfoSelectPnlTitle.setBounds(5, 5, 200, 15);
		pnlBookInfoSelect.add(lblBookInfoSelectPnlTitle);
		
		pnlBookRentalInsert = new JPanel();
		pnlBookRentalInsert.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlBookRentalInsert);
		pnlBookRentalInsert.setLayout(null);
		
		lblBookRentalInsertPnlTitle = new JLabel("[?????? ?????? ??????]");
		lblBookRentalInsertPnlTitle.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		lblBookRentalInsertPnlTitle.setBounds(5, 5, 200, 15);
		pnlBookRentalInsert.add(lblBookRentalInsertPnlTitle);
		
		pnlBookReturnInsert = new JPanel();
		pnlBookReturnInsert.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlBookReturnInsert);
		pnlBookReturnInsert.setLayout(null);
		
		lblBookReturnInsertPnlTitle = new JLabel("[?????? ?????? ??????]");
		lblBookReturnInsertPnlTitle.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		lblBookReturnInsertPnlTitle.setBounds(5, 5, 200, 15);
		pnlBookReturnInsert.add(lblBookReturnInsertPnlTitle);
		
		pnlBookRentalHistorySelect = new JPanel();
		pnlBookRentalHistorySelect.setBounds(0, 21, 634, 335);
		frmMain.getContentPane().add(pnlBookRentalHistorySelect);
		pnlBookRentalHistorySelect.setLayout(null);
		
		lblBookRentalHistorySelectPnlTitle = new JLabel("[?????? ?????? ?????? ??????]");
		lblBookRentalHistorySelectPnlTitle.setFont(new Font("?????? ??????", Font.PLAIN, 12));
		lblBookRentalHistorySelectPnlTitle.setBounds(5, 5, 200, 15);
		pnlBookRentalHistorySelect.add(lblBookRentalHistorySelectPnlTitle);
	}
	
	/*
	 * ????????????(????????? ?????? ???????????? ????????? ?????????)??? ???????????? Panel Visible ?????? 
	 */
	private void setPanelVisible(String panelName) {
		try {
			Class<?> c = Class.forName("com.koreait.view.Viewer");
			Field[] allField = c.getDeclaredFields();
			
			for (Field field : allField){
				if (field.getType().getName().equals("javax.swing.JPanel")) { //panel ??? ???
					//field.setAccessible(true); //private ????????? ?????? ???????????? ??????
					
					JPanel p = (JPanel)field.get(this); //JPanel??? ?????????
					
					if (field.getName().equals(panelName)) {
						p.setVisible(true);
					} else {
						p.setVisible(false);
					}
				}
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
