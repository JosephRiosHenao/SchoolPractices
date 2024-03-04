import websocket
import _thread
import time
import rel
import json


def on_message(ws, message):
    text_data_json = json.loads(message)
    message = text_data_json['message']
    print(f"Recibido por cliente #1: {message}")
    ws.send(json.dumps({'message': 'Enviado desde Cliente #1'}))


def on_error(ws, error):
    print(error)


def on_close(ws, close_status_code, close_msg):
    print("### closed ###")


def on_open(ws):
    print("Opened connection")
    ws.send(json.dumps({'message': 'Enviado desde Cliente #1'}))


if __name__ == "__main__":
    ws = websocket.WebSocketApp("ws://localhost:8000/sea-battle/",
                                on_open=on_open,
                                on_message=on_message,
                                on_error=on_error,
                                on_close=on_close)

ws.run_forever(dispatcher=rel, reconnect=5)
rel.signal(2, rel.abort)
rel.dispatch()
