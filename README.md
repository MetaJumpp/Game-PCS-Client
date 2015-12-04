#Game-PCS-Client
Since the game is not fully functioning it is necessary to make changes in the code to try different parts of the game. It is therefore not exported to a jar or exe file.
Before running the client, make sure that the variable HOST (line 23) in the GameServer class is set to the IP that the server prints out if playing over LAN or is set to localhost if running both server and client on one machine.

##Testing the Lobby
The lobby is currently mostly working, but when pressing the “BEGIN THE GAME” the clients will crash for unknown reasons.
To test the lobby simply run the code as it is. no modifications are required.

##Testing the inGame state
The in game state has all implemented actions. But is not able to update the other clients based on the actions of one client.
To test the inGame state the following changes must be made to the code: <br>
1: in the class GameClient comment out line 60 and 61<br>
2: in the class ServerCalls change line 155 from true to false <br>
3: in the class ServerCalls change line 221 from false to true <br>

##State of the Client
The client is not 100% functioning. It is lacking a way to change from lobby to game state and it needs to update the other players values.
