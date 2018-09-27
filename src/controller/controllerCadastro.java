package controller;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.util.ResourceBundle;

public class controllerCadastro /*implements Initializable*/{

	@FXML
	private TableView<Usuario> tbTabela;

	@FXML
	private TableColumn<Usuario, String> tbUsuario;

	@FXML
	private TableColumn<Usuario, String> tbEmail;

	@FXML
	private TableColumn<Usuario, Integer> tbID;

	@FXML
	private Button btEditar;

	@FXML
	private Button btRemover;

	@FXML
	private Button btNovo;

	@FXML
	private Button btLimpar;

	@FXML
	private Button btSalvar;

	@FXML
	private TextField txtEmail;

	@FXML
	private TextField txtUsuario;

	@FXML
	private PasswordField pfSenha;

	@FXML
	private ComboBox<?> cbCargo;

	@FXML
	void novoCadastro(ActionEvent event) {
		Stage primaryStage = new Stage();
		try {
			AnchorPane root = FXMLLoader.load(getClass().getResource("/view/FXMLInclusaoo.fxml"));
			Scene scene = new Scene(root, 400, 303);
			primaryStage.setTitle("Cadastrar novo Usuário");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	void editarCadastro(ActionEvent event) {

	}

	@FXML
	void removerCadastro(ActionEvent event) {
	}

	public static class Usuario {
		private final SimpleIntegerProperty id;
		private final SimpleStringProperty usuario;
		private final SimpleStringProperty email;

		public Usuario(Integer id, String usuario, String email) {
			this.usuario = new SimpleStringProperty(usuario);
			this.id = new SimpleIntegerProperty(id);
			this.email = new SimpleStringProperty(email);
		}
	}
/*
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		tbUsuario.setCellValueFactory(new PropertyValueFactory<>("usuario"));
		tbID.setCellValueFactory(new PropertyValueFactory<>("id"));
		tbEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
		tbTabela.setItems(listadeUsuarios());
		
	}
	
	private ObservableList<Usuario> listadeUsuarios() {
		return FXCollections.observableArrayList(new Usuario(1, "root", "root@gmail.com"));
	}
	*/
}
