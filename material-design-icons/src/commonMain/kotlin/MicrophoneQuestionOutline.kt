package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MicrophoneQuestionOutline: ImageVector
    get() {
        if (_MicrophoneQuestionOutline != null) {
            return _MicrophoneQuestionOutline!!
        }
        _MicrophoneQuestionOutline = ImageVector.Builder(
            name = "MicrophoneQuestionOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.3f, 11f)
                curveTo(14.3f, 14f, 11.76f, 16.1f, 9f, 16.1f)
                reflectiveCurveTo(3.7f, 14f, 3.7f, 11f)
                horizontalLineTo(2f)
                curveTo(2f, 14.41f, 4.72f, 17.23f, 8f, 17.72f)
                verticalLineTo(21f)
                horizontalLineTo(10f)
                verticalLineTo(17.72f)
                curveTo(13.28f, 17.23f, 16f, 14.41f, 16f, 11f)
                moveTo(7.8f, 4.9f)
                curveTo(7.8f, 4.24f, 8.34f, 3.7f, 9f, 3.7f)
                reflectiveCurveTo(10.2f, 4.24f, 10.2f, 4.9f)
                lineTo(10.19f, 11.1f)
                curveTo(10.19f, 11.76f, 9.66f, 12.3f, 9f, 12.3f)
                reflectiveCurveTo(7.8f, 11.76f, 7.8f, 11.1f)
                moveTo(9f, 14f)
                curveTo(10.66f, 14f, 12f, 12.66f, 12f, 11f)
                verticalLineTo(5f)
                curveTo(12f, 3.34f, 10.66f, 2f, 9f, 2f)
                reflectiveCurveTo(6f, 3.34f, 6f, 5f)
                verticalLineTo(11f)
                curveTo(6f, 12.66f, 7.34f, 14f, 9f, 14f)
                moveTo(20.5f, 14.5f)
                verticalLineTo(16f)
                horizontalLineTo(19f)
                verticalLineTo(14.5f)
                horizontalLineTo(20.5f)
                moveTo(18.5f, 9.5f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                curveTo(17f, 7.34f, 18.34f, 6f, 20f, 6f)
                reflectiveCurveTo(23f, 7.34f, 23f, 9f)
                curveTo(23f, 9.97f, 22.5f, 10.88f, 21.71f, 11.41f)
                lineTo(21.41f, 11.6f)
                curveTo(20.84f, 12f, 20.5f, 12.61f, 20.5f, 13.3f)
                verticalLineTo(13.5f)
                horizontalLineTo(19f)
                verticalLineTo(13.3f)
                curveTo(19f, 12.11f, 19.6f, 11f, 20.59f, 10.35f)
                lineTo(20.88f, 10.16f)
                curveTo(21.27f, 9.9f, 21.5f, 9.47f, 21.5f, 9f)
                curveTo(21.5f, 8.17f, 20.83f, 7.5f, 20f, 7.5f)
                reflectiveCurveTo(18.5f, 8.17f, 18.5f, 9f)
                verticalLineTo(9.5f)
                close()
            }
        }.build()

        return _MicrophoneQuestionOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneQuestionOutline: ImageVector? = null
