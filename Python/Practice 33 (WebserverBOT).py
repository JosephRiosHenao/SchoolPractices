from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from webdriver_manager.chrome import ChromeDriverManager
import time

USERNAME = "joseph.rios.1"
PASSWORD = "Foca2306"

def enterText(element, text):
    element.clear()
    element.send_keys(text)

def login():
    userInput = web.find_element_by_id("username")
    passInput = web.find_element_by_id("password")
    enterText(userInput,USERNAME)
    enterText(passInput,PASSWORD)
    passInput.send_keys(Keys.ENTER)

web = webdriver.Chrome(ChromeDriverManager().install())
web.get("https://www.santillanaconnect.com/Account/Login/?wtrealm=http%3A%2F%2Flms30.santillanacompartir.com%2Flogin%2Fcompartir%2F&wreply=https%3A%2F%2Flms30.santillanacompartir.com%2Flogin%2Fsso%2Floginconnect")
# web.get("https://www.instagram.com/")
time.sleep(1)

# acceptCookies = web.find_element_by_id("didomi-notice-agree-button").click()
acceptCookies = web.find_element_by_xpath("/html/body/div[1]/div/div/div/div/div[2]/button[2]").click()
login()

time.sleep(5)
