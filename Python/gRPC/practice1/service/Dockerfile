FROM python:3.8-slim

COPY ./service /home/app

WORKDIR /home/app

RUN pip3.8 install --upgade pip
RUN pip3.8 install -r requirements.txt

CMD [ "python3.8", "-u", "main.py"]