#!/usr/bin/python
from PIL import Image
import os, sys
from resizeimage import resizeimage

# path = "C:/Users/POCHI-PC/Downloads/IAJoseph/images/"
path = input("Digit the path of the folder images: ")
dirs = os.listdir( path )

def resize():
    print("Execute...")
    for item in dirs:
        if os.path.isfile(path+item):
            im = Image.open(path+item)
            f, e = os.path.splitext(path+item)
            img = resizeimage.resize_contain(im, [512, 512])
            # imResize = im.resize((512,512), Image.Resampling.LANCZOS)
            # imResize.save(f + ' resized.jpg', 'JPEG', quality=90)
            img.save(f + ' resized.png', img.format)
            im.close()
            print(f+' resized')

resize()


