package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BoxCutter: ImageVector
    get() {
        if (_BoxCutter != null) {
            return _BoxCutter!!
        }
        _BoxCutter = ImageVector.Builder(
            name = "BoxCutter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.22f, 11.91f)
                curveTo(6.89f, 12.24f, 6.71f, 12.65f, 6.66f, 13.08f)
                lineTo(12.17f, 15.44f)
                lineTo(20.66f, 6.96f)
                curveTo(21.44f, 6.17f, 21.44f, 4.91f, 20.66f, 4.13f)
                lineTo(19.24f, 2.71f)
                curveTo(18.46f, 1.93f, 17.2f, 1.93f, 16.41f, 2.71f)
                lineTo(7.22f, 11.91f)
                moveTo(5f, 16f)
                verticalLineTo(21.75f)
                lineTo(10.81f, 16.53f)
                lineTo(5.81f, 14.53f)
                lineTo(5f, 16f)
                moveTo(17.12f, 4.83f)
                curveTo(17.5f, 4.44f, 18.15f, 4.44f, 18.54f, 4.83f)
                curveTo(18.93f, 5.23f, 18.93f, 5.86f, 18.54f, 6.25f)
                curveTo(18.15f, 6.64f, 17.5f, 6.64f, 17.12f, 6.25f)
                curveTo(16.73f, 5.86f, 16.73f, 5.23f, 17.12f, 4.83f)
                close()
            }
        }.build()

        return _BoxCutter!!
    }

@Suppress("ObjectPropertyName")
private var _BoxCutter: ImageVector? = null
