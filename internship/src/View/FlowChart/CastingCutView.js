import React, { Component } from 'react';
import { Step, Icon } from 'semantic-ui-react'
import '../View.css';

class CastingCutView extends Component {
    render() {
        return (
            <div className="CastingCut">
                <Step.Group>
                    {
                        this.props.castingCut.result === true ?
                            <Step completed>
                                <Icon name='filter' />
                                <Step.Content>
                                    <Step.Title>숙주주입</Step.Title>
                                    <Step.Description>박테리아내부 벡터 주입</Step.Description>
                                </Step.Content>
                            </Step>
                            :
                            <Step active>
                                <Icon name='filter' />
                                <Step.Content>
                                    <Step.Title>숙주주입</Step.Title>
                                    <Step.Description>박테리아내부 벡터 주입</Step.Description>
                                </Step.Content>
                            </Step>}
                </Step.Group>
            </div>
        );
    }
}

export default CastingCutView;
