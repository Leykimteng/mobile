#KOTLIN
###Intent
* are used to perform an action in android app
* are cleaves that are used to start the following android component :  
  1. Activities
  2. Services
  3. broadcast Receiver    

#####There are 2 type of intent
1. Explicit intent  
```
var i = Intent(this,Activities2::class.java
i.action=Intent.Action_Send
i.type="text/plaintext"
i.putExtra("ID",other type)
startActivity(i)
```  

2. implicit intent  
```
var i:String = Intent.getStringExtra("ID")
```  
####Activity Life Cycle

onCreate()  
    |  
onStart()  
    |  
onPause()  
    |  
onResume()  
    |    
onStop()  
    |  
onDestroy()  
    |  
onRestart()  

#### linear layout
__layout_width__ is use to devide the home layout into part for each layout.
__layout_Gruvity__ is use to 