
#include"game.h"


void menu() {
	cout << "******************************************" << endl;
	cout << "*******************  1 play **************" << endl;
	cout << "*******************  0 exit **************" << endl;
	cout << "******************************************" << endl;
}
void game() {
	//��Ų��úõ���
	char mine[ROWS][COLS] = { 0 };//��š�0��
	//����Ų������
	char show[ROWS][COLS] = { 0 };//���'*'
	//��ʼ������
	InitBoard(mine, ROWS, COLS, '0');
	InitBoard(show, ROWS, COLS, '*');
	//��ӡ����
	/*DisplayBoard(mine, ROW, COL);
	DisplayBoard(show, ROW, COL);*/
	//������
	SetMine(mine,ROW,COL);
	//DisplayBoard(mine, ROW, COL);
	DisplayBoard(show, ROW, COL);
	//�Ų���
	FindMine(mine, show, ROW, COL);
}

void test() {
	int input = 0;
	srand((unsigned int)time(NULL));
	do {
		menu();
		cout << "��ѡ�� :> ";
		cin >> input;
		switch (input)
		{
		case 1:
			/*cout << "ɨ��" << endl;*/
			game();
			break;

		case 0:
			cout << "�˳�ѭ��" << endl;
			break;
		default:
			cout << "ѡ�����" << endl;
			break;
		}
	} while (input);
	
}

int main() {
	test();
}