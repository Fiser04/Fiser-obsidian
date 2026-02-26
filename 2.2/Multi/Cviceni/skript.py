# !pip install spacy
# !python -m spacy download en_core_web_sm  # en_core_web_lg
# ceske modely ---  cs_core_news_sm a cs_core_news_lg


import spacy

nlp = spacy.load('en_core_web_sm')  #'en_core_web_sm',  python -m spacy download en_core_web_lg

# Analýza věty
doc = nlp("Barack Obama was born in Hawaii.")
print(doc)

print("\nTokenizace a lemmatizace")
for token in doc:
    print(token.text, token.lemma_, token.pos_, token.dep_)

print("\nSlovni druhy")
for ent in doc.ents:
    print(ent.text, ent.label_)

print("\nVazby")
for token in doc:
    print(f"{token.text} <-- {token.dep_} <-- {token.head.text}")

print("\nVse")
for token in doc:
    print(f"{token.text}: POS={token.pos_}, DEP={token.dep_}, HEAD={token.head.text}")
