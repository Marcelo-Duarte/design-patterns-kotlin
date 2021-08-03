package state

import java.lang.RuntimeException

class DomainException(
    mensagem: String
): RuntimeException(
    mensagem
) {
}