
class Person():
    def __init__(self, name, adults, childrens, city):
        self.name = name
        self.childrens = childrens
        self.adults = adults
        self.city = city
    def __str__(self):
        return "Full Name: {}\nCiudad: {}\nAdultos: {}\nChildrens: {}".format(self.name,self.city, self.adults, self.childrens)

class Plan():
    tiquets = {
        "CALI":{
            "AEREO": 850000
        },
        "TUNJA":{
            "AEREO": 630000,
            "TERRESTRE": 380000
        },
        "MANIZALES":{
            "AEREO": 480000,
            "TERRESTRE": 420000
        }
    }
    hotel = {
        "ADULTO": 150000,
        "CHILDREN": 93000
    }
    food = {
        "ADULTO": 80000,
        "CHILDREN": 27000,
    }

    def __init__(self, plan, person, days):
        self.price_tiquts = self.calc_tiquets(plan, person)
        self.price_hotel = self.calc_hotel(person, days)
        self.price_food = self.calc_food(person, days)

    def calc_tiquets(self, plan, person):
        price = 0
        for _ in range(0,person.adults+person.childrens):
            price += self.tiquets[person.city][plan]
        return price

    def calc_hotel(self, person, days):
        price = 0
        for _ in range(0,person.adults):
            price += self.hotel["ADULTO"]
        for _ in range(0,person.childrens):
            price += self.hotel["CHILDREN"]
        return price * days

    def calc_food(self, person, days):
        price = 0
        for _ in range(0,person.adults):
            price += self.hotel["ADULTO"]+self.food["ADULTO"]
        for _ in range(0,person.childrens):
            price += self.hotel["CHILDREN"]+self.food["CHILDREN"]
        return price * days

class Reserve(Plan):

    def __init__(self, person, plan, days):
        super().__init__(plan, person, days)
        self.person = person
        self.plan = plan
        self.days = days
        self.planes = {
            "AEREO": self.price_hotel + self.price_tiquts,
            "HOTEL": self.price_hotel + self.price_food,
            "TERRESTRE": self.price_hotel + self.price_tiquts
        }   
        self.total = self.planes[plan]

    def plan_total(self):
        return self.total

    def __str__(self):
        info = "COTIZACION PLAN TURISTICO CARTAGENA\nSolicitante:{}\nCiudad de Origen:{}\nNumero de adultos:{}\nNumero de childres:{}\nNumero de dias:{}\nTipo de plan:{}\n".format(
            self.person.name,  self.person.city, self.person.adults, self.person.childrens, self.days, self.plan
        )
        prices = "Total:{}".format(self.plan_total())
        return "{}\n----------\n{}".format(info,prices)

def menu(menu, range):
    while (True):
        menu_int = input("{}\nDigite su opcion:".format(menu))
        if menu_int.isdigit():
            menu_int = int(menu_int)
            if menu_int <= range and menu_int > 0: break
    return menu_int

if __name__ == "__main__":
    name = input("Digite su nombre: ")
    while True:
        adults = input("Digite la cantidad de Adultos: ")
        if adults.isdigit():
            adults = int(adults)
            break
    while True:
        childrens = input("Digite la cantidad de Peques: ")
        if childrens.isdigit():
            childrens = int(childrens)
            break
    city = menu("1. CALI\n2. TUNJA\n3. MANIZALES",3)
    if city == 1: city = "CALI"
    if city == 2: city = "TUNJA"
    if city == 3: city = "MANIZALES"
    adult = Person(name, adults, childrens, city)
    while True:
        days = input("Digite la cantidad de Dias: ")
        if days.isdigit():
            days = int(days)
            break
    while True:
        plan = menu("1. AEREO\n2. HOTEL\n3. TERRESTRE",3)
        if plan == 1: plan = "AEREO"
        if plan == 2: plan = "HOTEL"
        if plan == 3: plan = "TERRESTRE"
        if adult.city == "CALI" and plan == "TERRESTRE": 
            print("NO DISPONIBLE")
        else: break
    reserve = Reserve(adult,plan,days)
    print(reserve)