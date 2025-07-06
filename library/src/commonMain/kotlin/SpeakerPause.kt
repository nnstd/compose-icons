package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SpeakerPause: ImageVector
    get() {
        if (_SpeakerPause != null) {
            return _SpeakerPause!!
        }
        _SpeakerPause = ImageVector.Builder(
            name = "SpeakerPause",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.28f, 19.81f)
                curveTo(11.87f, 19.92f, 11.45f, 20f, 11f, 20f)
                curveTo(8.24f, 20f, 6f, 17.76f, 6f, 15f)
                reflectiveCurveTo(8.24f, 10f, 11f, 10f)
                curveTo(12.89f, 10f, 14.5f, 11.06f, 15.37f, 12.61f)
                curveTo(16.16f, 12.23f, 17.06f, 12f, 18f, 12f)
                verticalLineTo(4f)
                curveTo(18f, 2.89f, 17.1f, 2f, 16f, 2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.89f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(13.54f)
                curveTo(13f, 21.37f, 12.54f, 20.63f, 12.28f, 19.81f)
                moveTo(11f, 4f)
                curveTo(12.11f, 4f, 13f, 4.89f, 13f, 6f)
                reflectiveCurveTo(12.11f, 8f, 11f, 8f)
                curveTo(9.89f, 8f, 9f, 7.1f, 9f, 6f)
                curveTo(9f, 4.89f, 9.89f, 4f, 11f, 4f)
                moveTo(13.74f, 13.78f)
                curveTo(12.7f, 14.82f, 12.06f, 16.24f, 12f, 17.81f)
                curveTo(11.69f, 17.93f, 11.36f, 18f, 11f, 18f)
                curveTo(9.34f, 18f, 8f, 16.66f, 8f, 15f)
                reflectiveCurveTo(9.34f, 12f, 11f, 12f)
                curveTo(12.22f, 12f, 13.27f, 12.73f, 13.74f, 13.78f)
                moveTo(19f, 15f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                moveTo(15f, 15f)
                horizontalLineTo(17f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _SpeakerPause!!
    }

@Suppress("ObjectPropertyName")
private var _SpeakerPause: ImageVector? = null
