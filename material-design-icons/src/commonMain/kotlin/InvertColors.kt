package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvertColors: ImageVector
    get() {
        if (_InvertColors != null) {
            return _InvertColors!!
        }
        _InvertColors = ImageVector.Builder(
            name = "InvertColors",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 19.58f)
                verticalLineTo(19.58f)
                curveTo(10.4f, 19.58f, 8.89f, 18.96f, 7.76f, 17.83f)
                curveTo(6.62f, 16.69f, 6f, 15.19f, 6f, 13.58f)
                curveTo(6f, 12f, 6.62f, 10.47f, 7.76f, 9.34f)
                lineTo(12f, 5.1f)
                moveTo(17.66f, 7.93f)
                lineTo(12f, 2.27f)
                verticalLineTo(2.27f)
                lineTo(6.34f, 7.93f)
                curveTo(3.22f, 11.05f, 3.22f, 16.12f, 6.34f, 19.24f)
                curveTo(7.9f, 20.8f, 9.95f, 21.58f, 12f, 21.58f)
                curveTo(14.05f, 21.58f, 16.1f, 20.8f, 17.66f, 19.24f)
                curveTo(20.78f, 16.12f, 20.78f, 11.05f, 17.66f, 7.93f)
                close()
            }
        }.build()

        return _InvertColors!!
    }

@Suppress("ObjectPropertyName")
private var _InvertColors: ImageVector? = null
