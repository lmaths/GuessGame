
public class GuessGame {
	
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame( ) {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int adivinhap1 = 0;
		int adivinhap2 = 0;
		int advinhap3 =0;
		
		boolean p1eCorreto = false;
		boolean p2eCorreto = false;
		boolean p3eCorreto = false;
		
		int numeroAlvo = (int) (Math.random()*10);
		System.out.println("*********INICIO DO GAME *********");
		System.out.println("********* SORTEANDO NÚMERO DE 0 A 99 *********");
		
		
		while(true) {
			System.out.println("O NÚMERO SORTEADO FOI  " + numeroAlvo);
			p1.guess();
			p2.guess();
			p3.guess();
			
			
		adivinhap1 = p1.number;
		System.out.println("palpite player 1 " + adivinhap1);
		adivinhap2 = p2.number;
		System.out.println("palpite player 2 " + adivinhap2);
		advinhap3 = p3.number;
		System.out.println("palpite player 3 " + advinhap3);
		
		
		//criar comparações pra ver qual chegou perto do numero sorteado
		
		if (adivinhap1 == numeroAlvo) {
			p1eCorreto = true;
		}
		if (adivinhap2 == numeroAlvo) {
			p2eCorreto = true;
		}
		if (advinhap3 == numeroAlvo) {
			p3eCorreto = true;
		}
		
		if(p1eCorreto || p2eCorreto|| p3eCorreto) {
			System.out.println("Temos um vencedor!");
			System.out.println("O jogador um acertou? " + p1eCorreto);
			System.out.println("O jogador dois acertou? " + p2eCorreto);
			System.out.println("O jogador três acerotu? " + p3eCorreto);
			
			System.out.println("Final do jogo");
			break; 
			// fim do jogo final do loop
			}else {
				//continua pq ngn acertou
				
				System.out.println("Ninguém acertou");
			}
}
		
	}
}
