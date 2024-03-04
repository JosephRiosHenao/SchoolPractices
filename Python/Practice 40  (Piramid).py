abc=['a','b','c','d','e','f','g','h','i','j',
     'k','l','m','n','o','p','q','r','s']

def print_rangoli(size):
    chain_collect=[]
    for i in range(size):
        chain = ''
        for j in range(size-i):
            chain += abc[j+i]+'-' if j+1!=size-i else abc[j+i]
        for _ in range((size*2-1)-len(chain)): chain += '-'
        chain_collect.append(chain)
        
    first_part = []
        
    for i in range(len(chain_collect), 0, -1): 
        chain = ''
        for reverse_i in range(len(chain_collect[i-1]), 1, -1):  
            chain += chain_collect[i-1][reverse_i-1]
        first_part.append(chain)
                
    for i in range(len(chain_collect), 0, -1): 
        first_part[len(chain_collect)-i] += chain_collect[i-1]
    
    for i in range(len(first_part)-1): print(first_part[i])
    for i in range(len(first_part), 0, -1): print(first_part[i-1])
    

if __name__ == '__main__':
    n = 24
    print_rangoli(n)