module aulasdeFX {
	requires javafx.controls;
	requires java.sql;
	exports _2estruturaDaAplicacaoFX to javafx.graphics;
	opens application to javafx.graphics, javafx.fxml;
	exports _3nodes to javafx.graphics;
	exports teste to javafx.graphics;
}
