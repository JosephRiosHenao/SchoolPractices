import re
entrada = ''
while not re.search('^[0-9,$]*$', entrada) is None:
    entrada = input('Ingrese texto: ')
