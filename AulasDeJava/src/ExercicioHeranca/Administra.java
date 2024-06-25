package ExercicioHeranca;

public class Administra extends Assistente {
		public String turno;
		private double porcentagem;
		
		public Administra (String _nome , double _salario , int _matricula , String _turno) {
			super(_nome,_salario,_matricula);
			this.turno = _turno;
			this.porcentagem = 0;
			
			if (this.turno == "noite"){
				this.porcentagem = this.salario * 0.2;
				this.salario = this.salario + this.porcentagem ;
			}
		}
		
		@Override
		public void exibirDados(){
			System.out.println(this.nome + " " + this.salario + " " + this.matricula + " " + this.porcentagem + " " + this.turno);
		}
}
