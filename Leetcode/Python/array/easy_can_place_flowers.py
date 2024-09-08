def canPlaceFlowers(flowerbed, n):
    if n == 0:
        return True
    for i in range(len(flowerbed)):
        if flowerbed[i] == 0 and (i == 0 or flowerbed[i-1] == 0) and (i == len(flowerbed) or flowerbed[i+1] == 0):
            flowerbed[i] = 1
            n -= 1
            if n == 0:
                return True
    return False
    
print(canPlaceFlowers([0,1,0], 1))