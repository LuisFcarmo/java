#include <iostream>
#include <string>
#include <vector>
int main (){   
    using namespace std;
    string palavra(1000000, 'A');
    //cin >> palavra;
    int qtd;
    int qtd2 = 0;
    int maior = 0;
    
    for (int i = 0; i < palavra.length(); i++) {
        if (palavra[i] != palavra[i+1]) {
            qtd2++;
            if (qtd2 > maior) {
                maior = qtd2;
            }
            qtd2 = 0;
        } else {
            qtd2++;
        }
    }
    cout << maior;
    return 0;
}