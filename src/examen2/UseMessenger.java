package examen2;

public class UseMessenger{
	public static void main(String[] args){
		Contact pepe = new Contact("Pepe", "5555380");
		Contact juan = new Contact("Juan", "55541501");
		Contact antonio = new Contact("Antonio", "5556380");
		Contact maría = new Contact("María", "5557780");
		Contact ana = new Contact("Ana", "5557781");
		Group familia = new Group("familia");
		Group amigos = new Group("amigos");
		Group amigas = new Group("amigas");
		Group todos =  new Group("todos");
		Group noFamilia=  new Group("no familiares");
		familia.add(juan);
		familia.add(maría);
		amigos.add(pepe);
		amigos.add(antonio);
		amigas.add(ana);
		noFamilia.add(amigos);
		noFamilia.add(amigas);
		todos.add(familia);
		todos.add(noFamilia);
		todos.receiveMessage("Parcial de PR1 superado ...");
		familia.receiveMessage("Hoy cena de cumpleaños");
		noFamilia.receiveMessage("Hoy (después de cena familiar) ¡fiesta!");
		amigas.remove(ana.getId());
	}
}
