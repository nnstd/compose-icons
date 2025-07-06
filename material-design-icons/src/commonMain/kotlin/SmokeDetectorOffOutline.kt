package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SmokeDetectorOffOutline: ImageVector
    get() {
        if (_SmokeDetectorOffOutline != null) {
            return _SmokeDetectorOffOutline!!
        }
        _SmokeDetectorOffOutline = ImageVector.Builder(
            name = "SmokeDetectorOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.2f, 5f)
                lineTo(6.2f, 3f)
                horizontalLineTo(19f)
                curveTo(20.11f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(17.8f)
                lineTo(19f, 15.8f)
                verticalLineTo(5f)
                horizontalLineTo(8.2f)
                moveTo(17.5f, 14.32f)
                curveTo(17.82f, 13.6f, 18f, 12.83f, 18f, 12f)
                curveTo(18f, 8.68f, 15.31f, 6f, 12f, 6f)
                curveTo(11.17f, 6f, 10.4f, 6.18f, 9.68f, 6.5f)
                lineTo(11.27f, 8.07f)
                curveTo(11.5f, 8.03f, 11.75f, 8f, 12f, 8f)
                curveTo(14.21f, 8f, 16f, 9.79f, 16f, 12f)
                curveTo(16f, 12.25f, 15.97f, 12.5f, 15.93f, 12.73f)
                lineTo(17.5f, 14.32f)
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
                moveTo(8f, 12f)
                curveTo(8f, 14.21f, 9.79f, 16f, 12f, 16f)
                curveTo(12.62f, 16f, 13.19f, 15.85f, 13.71f, 15.6f)
                lineTo(8.4f, 10.29f)
                curveTo(8.15f, 10.81f, 8f, 11.39f, 8f, 12f)
                moveTo(17.11f, 19f)
                lineTo(15.19f, 17.08f)
                curveTo(14.26f, 17.66f, 13.17f, 18f, 12f, 18f)
                curveTo(8.69f, 18f, 6f, 15.31f, 6f, 12f)
                curveTo(6f, 10.83f, 6.34f, 9.74f, 6.92f, 8.81f)
                lineTo(5f, 6.89f)
                verticalLineTo(19f)
                horizontalLineTo(17.11f)
                close()
            }
        }.build()

        return _SmokeDetectorOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SmokeDetectorOffOutline: ImageVector? = null
