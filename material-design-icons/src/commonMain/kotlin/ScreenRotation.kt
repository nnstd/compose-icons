package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ScreenRotation: ImageVector
    get() {
        if (_ScreenRotation != null) {
            return _ScreenRotation!!
        }
        _ScreenRotation = ImageVector.Builder(
            name = "ScreenRotation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 21.5f)
                curveTo(4.25f, 19.94f, 1.91f, 16.76f, 1.55f, 13f)
                horizontalLineTo(0.05f)
                curveTo(0.56f, 19.16f, 5.71f, 24f, 12f, 24f)
                lineTo(12.66f, 23.97f)
                lineTo(8.85f, 20.16f)
                moveTo(14.83f, 21.19f)
                lineTo(2.81f, 9.17f)
                lineTo(9.17f, 2.81f)
                lineTo(21.19f, 14.83f)
                moveTo(10.23f, 1.75f)
                curveTo(9.64f, 1.16f, 8.69f, 1.16f, 8.11f, 1.75f)
                lineTo(1.75f, 8.11f)
                curveTo(1.16f, 8.7f, 1.16f, 9.65f, 1.75f, 10.23f)
                lineTo(13.77f, 22.25f)
                curveTo(14.36f, 22.84f, 15.31f, 22.84f, 15.89f, 22.25f)
                lineTo(22.25f, 15.89f)
                curveTo(22.84f, 15.3f, 22.84f, 14.35f, 22.25f, 13.77f)
                lineTo(10.23f, 1.75f)
                moveTo(16.5f, 2.5f)
                curveTo(19.75f, 4.07f, 22.09f, 7.24f, 22.45f, 11f)
                horizontalLineTo(23.95f)
                curveTo(23.44f, 4.84f, 18.29f, 0f, 12f, 0f)
                lineTo(11.34f, 0.03f)
                lineTo(15.15f, 3.84f)
                lineTo(16.5f, 2.5f)
                close()
            }
        }.build()

        return _ScreenRotation!!
    }

@Suppress("ObjectPropertyName")
private var _ScreenRotation: ImageVector? = null
