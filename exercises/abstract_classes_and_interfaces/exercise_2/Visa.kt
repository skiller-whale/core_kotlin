package cards

import api.*

public class Visa(
    number: String,
    expiry: String,
    cvv: String,
) : Card("Visa", number, expiry, cvv)
