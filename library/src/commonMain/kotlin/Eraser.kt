package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Eraser: ImageVector
    get() {
        if (_Eraser != null) {
            return _Eraser!!
        }
        _Eraser = ImageVector.Builder(
            name = "Eraser",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.24f, 3.56f)
                lineTo(21.19f, 8.5f)
                curveTo(21.97f, 9.29f, 21.97f, 10.55f, 21.19f, 11.34f)
                lineTo(12f, 20.53f)
                curveTo(10.44f, 22.09f, 7.91f, 22.09f, 6.34f, 20.53f)
                lineTo(2.81f, 17f)
                curveTo(2.03f, 16.21f, 2.03f, 14.95f, 2.81f, 14.16f)
                lineTo(13.41f, 3.56f)
                curveTo(14.2f, 2.78f, 15.46f, 2.78f, 16.24f, 3.56f)
                moveTo(4.22f, 15.58f)
                lineTo(7.76f, 19.11f)
                curveTo(8.54f, 19.9f, 9.8f, 19.9f, 10.59f, 19.11f)
                lineTo(14.12f, 15.58f)
                lineTo(9.17f, 10.63f)
                lineTo(4.22f, 15.58f)
                close()
            }
        }.build()

        return _Eraser!!
    }

@Suppress("ObjectPropertyName")
private var _Eraser: ImageVector? = null
