package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Tray: ImageVector
    get() {
        if (_Tray != null) {
            return _Tray!!
        }
        _Tray = ImageVector.Builder(
            name = "Tray",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 19f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 17f)
                close()
            }
        }.build()

        return _Tray!!
    }

@Suppress("ObjectPropertyName")
private var _Tray: ImageVector? = null
