package lambda;

public class CheckTraitImpl implements CheckTrait{

    @Override
    public boolean test(Member member) {
        return member.id == 1;
    }
}
