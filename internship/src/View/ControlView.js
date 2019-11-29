import React, { Component } from 'react';
import { Grid, Form, Radio, Button, Icon } from 'semantic-ui-react'

class ControlView extends Component {
    render() {
        const searchParam = this.props.searchParam;
        const steelGrdOptions = [
            {
                key: '',
                text: '',
                value: ''
            },
            {
                key: 'P',
                text: '후판',
                value: 'P',
            },
            {
                key: 'T',
                text: '박판',
                value: 'T',
            },
        ]

        return (
            <div className="ControlButton">
                <Grid stackable columns={10}>
                    <Grid.Column width={9}>
                        <Form>
                            <Form.Group >
                                <Form.Select fluid label='강종선택'
                                    value={searchParam.steelGrd}
                                    options={steelGrdOptions}
                                    onChange={(e, option) =>
                                        this.props.onChangeSteelGrd(option.value)} />
                                <Form.Field>
                                    <label>품질판정</label>
                                    <Radio
                                        label='합'
                                        name='radioGroup'
                                        value={true}
                                        checked={searchParam.qualityRes === true}
                                        onChange={(e) => this.props.onChangeQualityTest()}
                                    />
                                    <Radio
                                        label='불합'
                                        name='radioGroup'
                                        value={false}
                                        checked={searchParam.qualityRes === false}
                                        onChange={(e) => this.props.onChangeQualityTest()}
                                    />
                                </Form.Field>
                                <Form.Field>
                                    <label>정련값</label>
                                    <input
                                        type='range'
                                        min={0}
                                        max={5}
                                        value={searchParam.refinedRes}
                                        onChange={(e) => this.props.onChangeRefine(e.target.value)}
                                    />
                                </Form.Field>
                            </Form.Group>
                        </Form>
                    </Grid.Column>
                    <Grid.Column>
                        <Button content='Start' primary
                            onClick={(e) => {
                                this.props.onProgress(searchParam);
                            }} />
                        <Button secondary onClick={(e) => this.props.onRestart()}>
                            <Icon fitted name='undo' />
                        </Button>
                    </Grid.Column>
                </Grid>
            </div>
        );
    }
}

export default ControlView;