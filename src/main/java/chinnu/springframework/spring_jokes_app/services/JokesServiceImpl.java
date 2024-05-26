package chinnu.springframework.spring_jokes_app.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokeService{

    @Autowired
    private final ChuckNorrisQuotes quotes;

    public JokesServiceImpl(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }

    @Override
    public String getJoke() {
        return quotes;
    }
}
