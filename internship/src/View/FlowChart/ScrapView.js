import React, { Component } from 'react';
import { Step, Icon } from 'semantic-ui-react'
import '../View.css';

class ScrapView extends Component {
    render() {
        return (
            <div className="Scrap">
                <Step.Group>
                    {
                        this.props.scrap.result === true ?
                            <Step completed>
                                <Icon name='trash alternate' />
                                <Step.Content>
                                    <Step.Title>실패</Step.Title>
                                    <Step.Description>DNA 복제 실패</Step.Description>
                                </Step.Content>
                            </Step>
                            :
                            <Step active>
                                <Icon name='trash alternate' />
                                <Step.Content>
                                    <Step.Title>실패</Step.Title>
                                    <Step.Description>DNA 복제 실패</Step.Description>
                                </Step.Content>
                            </Step>}
                </Step.Group>
            </div>
        );
    }
}

export default ScrapView;
