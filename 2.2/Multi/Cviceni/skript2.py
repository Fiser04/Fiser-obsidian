# # !pip install spacy
# # !python -m spacy download en_core_web_sm  # en_core_web_lg
# # ceske modely ---  cs_core_news_sm a cs_core_news_lg


# import spacy

# nlp = spacy.load('en_core_web_sm')  #'en_core_web_sm',  python -m spacy download en_core_web_lg

# # Analýza věty
# doc = nlp("Barack Obama was born in Hawaii.")
# print(doc)

# print("\nTokenizace a lemmatizace")
# for token in doc:
#     print(token.text, token.lemma_, token.pos_, token.dep_)

# print("\nSlovni druhy")
# for ent in doc.ents:
#     print(ent.text, ent.label_)

# print("\nVazby")
# for token in doc:
#     print(f"{token.text} <-- {token.dep_} <-- {token.head.text}")

# print("\nVse")
# for token in doc:
#     print(f"{token.text}: POS={token.pos_}, DEP={token.dep_}, HEAD={token.head.text}")
# ===============================================================

# ### **1. Tokenizace a informace o slovech**
# Při průchodu přes `doc` můžeš získat tyto atributy:

# | Atribut | Význam | Příklad |
# |---------|--------|---------|
# | `token.text` | Původní tvar slova | `"Obama"` |
# | `token.lemma_` | Lemma (základní tvar) | `"be"` (pro "was") |
# | `token.pos_` | Slovní druh (Part of Speech, POS) | `"VERB"` (sloveso) |
# | `token.dep_` | Syntaktická závislost (Dependency) | `"nsubj"` (podmět) |

# ---

# ### **2. Slovní druhy (`pos_`)**
# Slovní druhy ve spaCy odpovídají standardu **UPOS (Universal POS tags)**:

# | Zkratka | Význam | Příklad |
# |---------|--------|---------|
# | `ADJ` | Přídavné jméno | **beautiful** |
# | `ADP` | Předložka | **in, on, at** |
# | `ADV` | Příslovce | **quickly, very** |
# | `AUX` | Pomocné sloveso | **is, was, have** |
# | `CCONJ` | Souřadicí spojka | **and, or, but** |
# | `DET` | Člen, determinátor | **the, a, an** |
# | `INTJ` | Citoslovce | **wow, oh** |
# | `NOUN` | Podstatné jméno | **dog, car** |
# | `PROPN` | Vlastní jméno | **Obama, London** |
# | `PRON` | Zájmeno | **he, she, they** |
# | `VERB` | Sloveso | **run, write** |
# | `NUM` | Číslovka | **one, two, 2023** |
# | `SCONJ` | Podřadicí spojka | **because, if, although** |

# ---

# ### **3. Syntaktické závislosti (`dep_`)**
# Tento atribut popisuje, jaké vztahy mají slova mezi sebou:

# | Zkratka | Význam | Příklad (věta: "Obama was born in Hawaii.") |
# |---------|--------|---------------------------------------------|
# | `nsubj` | Podmět | **Obama** (podmět věty) |
# | `ROOT` | Hlavní sloveso věty | **born** (kořen věty) |
# | `prep` | Předložka | **in** (předložka) |
# | `pobj` | Předmět předložky | **Hawaii** (předmět „in“) |
# | `auxpass` | Pomocné sloveso v pasivu | **was** |

# ---

# ### **4. Rozpoznávání entit (`ents`)**
# V `doc.ents` jsou pojmenované entity označeny podle standardu **Named Entity Recognition (NER)**:

# | Zkratka | Význam | Příklad |
# |---------|--------|---------|
# | `PERSON` | Osoba | **Barack Obama** |
# | `GPE` | Geopolitická entita (místo) | **Hawaii, USA** |
# | `ORG` | Organizace | **Microsoft, UN** |
# | `DATE` | Datum | **October 28, 2008** |
# | `NORP` | Národnost, náboženství | **American, Buddhist** |

# ---

# ### **5. Další užitečné atributy**
# | Atribut | Význam |
# |---------|--------|
# | `token.shape_` | Tvar slova (např. velká/malá písmena) |
# | `token.is_alpha` | Je to pouze písmeno? (`True/False`) |
# | `token.is_stop` | Je to stop slovo? (`True/False`) |

# ============================================

import nltk
from nltk.corpus import wordnet as wn

nltk.download("wordnet")

from nltk.corpus import wordnet as wn

# Zvolíme slovo, pro které hledáme vztahy
word = "dog"  # Můžeš změnit na jiné slovo
synsets = wn.synsets(word)

triples = []

for synset in synsets[0:1]:
    subject = synset.name()  # Název synsetu (konceptu)

    # Hyperonyma (nadřazené pojmy)
    for hypernym in synset.hypernyms():
        triples.append((subject, "is_a", hypernym.name()))

    # Hyponyma (podřazené pojmy)
    for hyponym in synset.hyponyms():
        triples.append((subject, "has_subtype", hyponym.name()))

    # Meronyma (části celku)
    for meronym in synset.part_meronyms():
        triples.append((subject, "has_part", meronym.name()))

    # Holonyma (celek, jehož je to část)
    for holonym in synset.member_holonyms():
        triples.append((subject, "part_of", holonym.name()))

    # Lemma (základní označení)
    for lemma in synset.lemmas():
        triples.append((subject, "lemma", lemma.name()))

    # Antonyma (opačný význam)
#   for lemma in synset.lemmas():
#       triples.append((subject, "antonym ", antonym.name()))

# Výpis trojic
for triple in triples:
    print(triple)
