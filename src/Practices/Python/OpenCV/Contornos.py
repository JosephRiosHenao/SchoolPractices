import cv2

path = "IMG/FigurasGeometricasJPG.jpg"
imagen = cv2.imread(path)

cv2.imshow("image",imagen)
cv2.waitKey(0)
cv2.destroyAllWindows()
