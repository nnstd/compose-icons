package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Valve: ImageVector
    get() {
        if (_Valve != null) {
            return _Valve!!
        }
        _Valve = ImageVector.Builder(
            name = "Valve",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                moveTo(22f, 2f)
                horizontalLineTo(20f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                moveTo(17.24f, 5.34f)
                lineTo(13.24f, 9.34f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.24f, 13.34f)
                lineTo(5.24f, 17.34f)
                lineTo(6.66f, 18.76f)
                lineTo(10.66f, 14.76f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.66f, 10.76f)
                lineTo(18.66f, 6.76f)
                close()
            }
        }.build()

        return _Valve!!
    }

@Suppress("ObjectPropertyName")
private var _Valve: ImageVector? = null
