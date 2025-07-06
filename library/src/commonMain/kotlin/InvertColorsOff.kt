package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvertColorsOff: ImageVector
    get() {
        if (_InvertColorsOff != null) {
            return _InvertColorsOff!!
        }
        _InvertColorsOff = ImageVector.Builder(
            name = "InvertColorsOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.65f, 20.87f)
                lineTo(18.3f, 18.5f)
                lineTo(12f, 12.23f)
                lineTo(8.44f, 8.66f)
                lineTo(7f, 7.25f)
                lineTo(4.27f, 4.5f)
                lineTo(3f, 5.77f)
                lineTo(5.78f, 8.55f)
                curveTo(3.23f, 11.69f, 3.42f, 16.31f, 6.34f, 19.24f)
                curveTo(7.9f, 20.8f, 9.95f, 21.58f, 12f, 21.58f)
                curveTo(13.79f, 21.58f, 15.57f, 21f, 17.03f, 19.8f)
                lineTo(19.73f, 22.5f)
                lineTo(21f, 21.23f)
                lineTo(20.65f, 20.87f)
                moveTo(12f, 19.59f)
                curveTo(10.4f, 19.59f, 8.89f, 18.97f, 7.76f, 17.83f)
                curveTo(6.62f, 16.69f, 6f, 15.19f, 6f, 13.59f)
                curveTo(6f, 12.27f, 6.43f, 11f, 7.21f, 10f)
                lineTo(12f, 14.77f)
                verticalLineTo(19.59f)
                moveTo(12f, 5.1f)
                verticalLineTo(9.68f)
                lineTo(19.25f, 16.94f)
                curveTo(20.62f, 14f, 20.09f, 10.37f, 17.65f, 7.93f)
                lineTo(12f, 2.27f)
                lineTo(8.3f, 5.97f)
                lineTo(9.71f, 7.38f)
                lineTo(12f, 5.1f)
                close()
            }
        }.build()

        return _InvertColorsOff!!
    }

@Suppress("ObjectPropertyName")
private var _InvertColorsOff: ImageVector? = null
