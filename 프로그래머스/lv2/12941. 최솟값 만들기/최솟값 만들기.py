def solution(A,B):
    answer = 0
    A.sort()
    B.sort(reverse = 1)

    for a_num, b_num in zip(A,B):
        answer += (a_num * b_num)
    return answer