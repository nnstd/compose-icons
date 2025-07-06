package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountTieVoiceOff: ImageVector
    get() {
        if (_AccountTieVoiceOff != null) {
            return _AccountTieVoiceOff!!
        }
        _AccountTieVoiceOff = ImageVector.Builder(
            name = "AccountTieVoiceOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.7f, 9.5f)
                lineTo(7.5f, 4.3f)
                curveTo(7.96f, 4.11f, 8.46f, 4f, 9f, 4f)
                curveTo(11.2f, 4f, 13f, 5.79f, 13f, 8f)
                curveTo(13f, 8.53f, 12.89f, 9.04f, 12.7f, 9.5f)
                moveTo(16.75f, 11.63f)
                curveTo(18.77f, 9.61f, 18.77f, 6.56f, 16.75f, 4.36f)
                lineTo(15.07f, 6.05f)
                curveTo(15.91f, 7.23f, 15.91f, 8.76f, 15.07f, 9.94f)
                lineTo(16.75f, 11.63f)
                moveTo(20.06f, 15f)
                curveTo(23.96f, 11.11f, 24f, 5.05f, 20.06f, 1f)
                lineTo(18.43f, 2.63f)
                curveTo(21.2f, 5.65f, 21.2f, 10.19f, 18.43f, 13.37f)
                lineTo(20.06f, 15f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(5.13f, 7f)
                curveTo(5.05f, 7.34f, 5f, 7.66f, 5f, 8f)
                curveTo(5f, 10.21f, 6.79f, 12f, 9f, 12f)
                curveTo(9.33f, 12f, 9.66f, 11.94f, 9.97f, 11.86f)
                lineTo(13f, 14.87f)
                curveTo(12.93f, 16.06f, 12.54f, 18.32f, 10.8f, 20.83f)
                lineTo(10f, 16f)
                lineTo(10.93f, 14.12f)
                curveTo(10.31f, 14.05f, 9.66f, 14f, 9f, 14f)
                curveTo(8.32f, 14f, 7.67f, 14.05f, 7.05f, 14.12f)
                lineTo(8f, 16f)
                lineTo(7.18f, 20.83f)
                curveTo(5.27f, 18.07f, 5f, 15.6f, 5f, 14.54f)
                curveTo(2.6f, 15.24f, 0.994f, 16.5f, 0.994f, 18f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                verticalLineTo(18.88f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                close()
            }
        }.build()

        return _AccountTieVoiceOff!!
    }

@Suppress("ObjectPropertyName")
private var _AccountTieVoiceOff: ImageVector? = null
