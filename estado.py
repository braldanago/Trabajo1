def dec_a_bin(decimal):
    if decimal == 0:
        return ""
    else:
        return dec_a_bin(decimal//2) + str(decimal % 2)
    
print("Resultado " + dec_a_bin(6))
