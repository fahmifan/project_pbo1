# Games Sliding Picture : Sundanese Culture

Game ini adalah puzzle yang berisi gambar kebudayaan. 

Cara memainkan : 
1. User memilih gambar terlebih dahulu melalui dropdown menu.
2. User memilih level.
3. User mengklik bagian-bagian puzzle gambar
4. Lalu gambar akan berpindah ke kotak kosong yg ada di sebelahnya jika ada.
5. User dapat melihat hint gambar.
6. User menyelesaikan puzzle sesuai dengan gambar asli (hint).
7. Ketika puzzle solve, maka akan muncul pop up pesan.

Konsep OOP yg dipakai : 

1. Membuat class-class untuk object-object yang berbeda
Diantara class-class tersebut adalah : 
	- MyButton
	- GameParent
	- GamEasy 
	- GameMedium
	- ComboBoxDemo

2. Penggunaan access modifier (public, private, protected)
	- Tiap Class

3. Penggunaan override
	- Class GameParent
		- Method ClickAction extends Abstraction();

4. Penggunaan generic
	-Class GameParent
		- Method checkSolution();

5. Menggunakan inheritance pada class berikut :
	- GameEasy : Extends dari GameParent, dengan constructor yg spesifik
	- GameMedium : Extends dari GameParent, dengan constructor yg spesifik

6. Exception handling
	- Digunakan untuk menangani exception pada beberapa kasus. 
		- Class MainMenuPanel
			- Method updateLabel();
			- 

7. Penggunaan Upcasting
	- MainMenuPanel
		- imageComboActionPerformed();

[Sliding Puzzle Src.Code](http://www.airtute.com/view/How_to_Create_a_Puzzle_Game__GUI__in_Java___Beginner_friendly.html)

[Sliding Puzzle Src. Code 2](http://zetcode.com/tutorials/javaswingtutorial "Now using this")
