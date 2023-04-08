import './styles.css';
import carImg from '../../assets/car.png';
export default function SectionCardsOne() {
    return (
        <div className="sectionCardsOne">
            <div>
                <img src={carImg} alt="Carro" />
            </div>

            <p >Lorem ipsum dolor</p>
        </div>
    );
}
