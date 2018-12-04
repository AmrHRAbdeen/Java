String ch;
#define LED 6
#define MOTOR_EN 3
#define MOTOR_ONE 7
#define MOTOR_TWO 8

#define PWM_INIT 0

volatile int PWM_VAL=0;

//int PWM_VAL=PWM_INIT;

void setup() {
  pinMode(MOTOR_EN,OUTPUT);
  pinMode(MOTOR_ONE,OUTPUT);
  pinMode(MOTOR_TWO,OUTPUT);
  pinMode(LED,OUTPUT);
  
  analogWrite(MOTOR_EN,255);
  
  Serial.begin(9600);
}
  void loop(){
    if(Serial.available() > 0)
    {
      ch=Serial.readString();
      if(ch == "O"){
        digitalWrite(LED,HIGH);
        Serial.println("HIGH");
       
      }
      else if(ch=="F"){
          digitalWrite(LED,LOW);
          Serial.println("LOW");
      }
      else if(ch=="c"){
        /*Motor Control Start*/
        digitalWrite(MOTOR_ONE,HIGH);
        digitalWrite(MOTOR_TWO,LOW);
       /*Motor Control End*/
      }
      else if(ch=="A"){
        /*Motor Control Start*/
        digitalWrite(MOTOR_ONE,LOW);
        digitalWrite(MOTOR_TWO,HIGH);
       /*Motor Control End*/
      }else{
        PWM_VAL=ch.toInt();
        analogWrite(LED,PWM_VAL);
        Serial.println("PWM ON");
      }
    }
  }
