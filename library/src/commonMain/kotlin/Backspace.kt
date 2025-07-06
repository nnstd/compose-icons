package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Backspace: ImageVector
    get() {
        if (_Backspace != null) {
            return _Backspace!!
        }
        _Backspace = ImageVector.Builder(
            name = "Backspace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 3f)
                horizontalLineTo(7f)
                curveTo(6.31f, 3f, 5.77f, 3.35f, 5.41f, 3.88f)
                lineTo(0f, 12f)
                lineTo(5.41f, 20.11f)
                curveTo(5.77f, 20.64f, 6.31f, 21f, 7f, 21f)
                horizontalLineTo(22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 3f)
                moveTo(19f, 15.59f)
                lineTo(17.59f, 17f)
                lineTo(14f, 13.41f)
                lineTo(10.41f, 17f)
                lineTo(9f, 15.59f)
                lineTo(12.59f, 12f)
                lineTo(9f, 8.41f)
                lineTo(10.41f, 7f)
                lineTo(14f, 10.59f)
                lineTo(17.59f, 7f)
                lineTo(19f, 8.41f)
                lineTo(15.41f, 12f)
            }
        }.build()

        return _Backspace!!
    }

@Suppress("ObjectPropertyName")
private var _Backspace: ImageVector? = null
