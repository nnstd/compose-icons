package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SmokeDetectorOff: ImageVector
    get() {
        if (_SmokeDetectorOff != null) {
            return _SmokeDetectorOff!!
        }
        _SmokeDetectorOff = ImageVector.Builder(
            name = "SmokeDetectorOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 8f)
                curveTo(14.21f, 8f, 16f, 9.79f, 16f, 12f)
                curveTo(16f, 12.25f, 15.97f, 12.5f, 15.93f, 12.73f)
                lineTo(11.27f, 8.07f)
                curveTo(11.5f, 8.03f, 11.75f, 8f, 12f, 8f)
                moveTo(12f, 6f)
                curveTo(15.31f, 6f, 18f, 8.68f, 18f, 12f)
                curveTo(18f, 12.83f, 17.82f, 13.6f, 17.5f, 14.32f)
                lineTo(21f, 17.8f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.11f, 3f, 19f, 3f)
                horizontalLineTo(6.2f)
                lineTo(9.68f, 6.5f)
                curveTo(10.4f, 6.18f, 11.17f, 6f, 12f, 6f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.1f, 21f)
                curveTo(19.07f, 21f, 19.03f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.89f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 4.97f, 3f, 4.93f, 3f, 4.9f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(15.19f, 17.08f)
                lineTo(13.71f, 15.6f)
                curveTo(13.19f, 15.85f, 12.62f, 16f, 12f, 16f)
                curveTo(9.79f, 16f, 8f, 14.21f, 8f, 12f)
                curveTo(8f, 11.39f, 8.15f, 10.81f, 8.4f, 10.29f)
                lineTo(6.92f, 8.81f)
                curveTo(6.34f, 9.74f, 6f, 10.83f, 6f, 12f)
                curveTo(6f, 15.31f, 8.69f, 18f, 12f, 18f)
                curveTo(13.17f, 18f, 14.26f, 17.66f, 15.19f, 17.08f)
                close()
            }
        }.build()

        return _SmokeDetectorOff!!
    }

@Suppress("ObjectPropertyName")
private var _SmokeDetectorOff: ImageVector? = null
