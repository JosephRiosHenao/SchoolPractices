import cv2
import numpy as np

original = cv2.imread("D:\JOSEPH\GIT\SchoolPractices\src\Practices\Python\OpenCV\IMG\Monedas.jpg")

gris = cv2.cvtColor(original,cv2.COLOR_BGR2GRAY)

blur = cv2.GaussianBlur(gris,(3,3),0)

canny = cv2.Canny(blur,80,100)

kernel = np.ones((6,6),np.uint8)

cierre = cv2.morphologyEx(canny,cv2.MORPH_CLOSE,kernel)

contorno, jerarquia = cv2.findContours(cierre.copy(), cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)
print("Monedas encontradas: {}".format(len(contorno)))

cv2.drawContours(original,contorno,-1,(255,255,0),2)

cv2.imshow("Output",original)
cv2.waitKey(0)
cv2.destroyAllWindows() 