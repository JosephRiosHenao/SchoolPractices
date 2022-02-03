from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from webdriver_manager.chrome import ChromeDriverManager
import time

USERNAME = "loncron232005@gmail.com"
PASSWORD = "Foca2306"

def enterText(element, text):
    element.clear()
    element.send_keys(text)

def login():
    userInput = web.find_element_by_xpath("/html/body/div[1]/section/main/article/div[2]/div[1]/div/form/div/div[1]/div/label/input")
    passInput = web.find_element_by_xpath("/html/body/div[1]/section/main/article/div[2]/div[1]/div/form/div/div[2]/div/label/input")
    enterText(userInput,USERNAME)
    enterText(passInput,PASSWORD)
    passInput.send_keys(Keys.ENTER)

web = webdriver.Chrome(ChromeDriverManager().install())
web.get("https://www.instagram.com/")
time.sleep(2)
login()
time.sleep(4)
web.get("https://www.instagram.com/pochi_dibujos/")
time.sleep(3)
followersBtn = web.find_element_by_xpath("/html/body/div[1]/section/main/div/header/section/ul/li[2]/a").click()
time.sleep(2)
popUpWindows = web.find_element_by_xpath("/html/body/div[6]/div/div/div[2]")