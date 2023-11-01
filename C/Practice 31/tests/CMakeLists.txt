add_executable(test_ClassActivities test_ClassActivities.c)

# Enlaza la biblioteca de pruebas y la biblioteca que contiene tu código
#target_link_libraries(test_ClassActivities PRIVATE Unity ClassActivities)

# Agrega una regla de prueba personalizada
add_test(NAME test_sumar COMMAND test_ClassActivities)
