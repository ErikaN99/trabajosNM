def merge_sort(arr, depth=0, branch="raiz"):
    # Imprimir el estado actual en el árbol de recursión
    indent = " " * depth
    print(f"{indent}[{branch}] Profundidad {depth}: {arr}")

    # Caso base: lista de tamaño 0 o 1
    if len(arr) <= 1:
        return arr

    # Dividir la lista en dos mitades
    mid = len(arr) // 2
    left_half = arr[:mid]
    right_half = arr[mid:]

    # Llamadas recursivas para ordenar cada mitad
    left_sorted = merge_sort(left_half, depth + 1, "izquierda")
    right_sorted = merge_sort(right_half, depth + 1, "derecha")

    # Combinar las mitades ordenadas
    result = merge(left_sorted, right_sorted)

    # Imprimir el resultado de la combinación
    print(f"{indent}[{branch}] Combinando: {result}")

    return result

def merge(left, right):
    result = []
    i = j = 0

    # Mientras haya elementos en ambas listas
    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1

    # Agregar los elementos restantes
    result.extend(left[i:])
    result.extend(right[j:])

    return result

# Ejemplo de uso
if __name__ == "__main__":
    arr = [38, 27, 43, 3, 9, 82, 10]
    print("Lista original:", arr)
    print("\nÁrbol de recursión de Merge Sort")
    sorted_arr = merge_sort(arr)
    print("\nLista ordenada:", sorted_arr)   
    