def reverse(x):
    if x == 0:
        return 0
    if x < 0:
        x = x - (x * 2)
        minus = True
    else:
        minus = False
    now = x
    hasil = ''
    while now != 0:
        sisa = now % 10
        hasil += str(sisa)
        now = now // 10
    if minus:
        return int(hasil) - (int(hasil) * 2)
    else:
        return int(hasil)


reverse(0)