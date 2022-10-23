from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from webdriver_manager.chrome import ChromeDriverManager
from webdriver_manager.firefox import GeckoDriverManager
import time


def enterText(element, text):
    element.clear()
    element.send_keys(text)

def login():
    userInput = web.find_element_by_id("username")
    passInput = web.find_element_by_id("password")
    enterText(userInput,USERNAME)
    enterText(passInput,PASSWORD)
    passInput.send_keys(Keys.ENTER)

# web = webdriver.Chrome(ChromeDriverManager().install())
# web = webdriver.Firefox(executable_path=GeckoDriverManager().install())
web.get("https://www.santillanaconnect.com/Account/Login/?wtrealm=http%3A%2F%2Flms30.santillanacompartir.com%2Flogin%2Fcompartir%2F&wreply=https%3A%2F%2Flms30.santillanacompartir.com%2Flogin%2Fsso%2Floginconnect")
# web.get("https://www.instagram.com/")
time.sleep(1)

# acceptCookies = web.find_element_by_id("didomi-notice-agree-button").click()
acceptCookies = web.find_element_by_xpath("/html/body/div[1]/div/div/div/div/div[2]/button[2]").click()
login()

time.sleep(4
           )
web.get("https://lms30.santillanacompartir.com/student-new/schoolclassesindex/13371298?ctxtid=19843&ctxsid=385&ctxrid=16")
time.sleep(2)
book = web.find_element_by_xpath("/html/body/div[3]/div[2]/div/div[3]/div/div[1]/div[2]/a").click()
time.sleep(2)


web.get("https://lms30.santillanacompartir.com/student-new/common/resources/14119619?ctxtid=19843&ctxsid=385&ctxrid=16&schoolClassId=13371298&collectionType=ProjectResource&collectionId=16906498")
