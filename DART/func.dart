void greet(String name,String message){
  print("Hello ${name} $message");
}

void selectOperations1(int a,int b,void Function(int,int) ops1){
  ops1(a,b);
}

int selectOperations2(int a,int b,int Function(int,int) ops2){
  return ops2(a,b);
}

void add(int a,int b) => print(a+b);
void mul(int a,int b) => print(a*b);

int sub(int a,int b) => (a-b);
int div(int a,int b) => b==0 ? throw ArgumentError('Division by zero is not allowed'): a ~/ b;

void main(){
  greet("Vicky", "Welcome");
  
  selectOperations1(5, 5, add);
  selectOperations1(5, 5, mul);

  print(selectOperations2(5,5 , sub).toString() +" "+selectOperations2(5, 5, div).toString());
}