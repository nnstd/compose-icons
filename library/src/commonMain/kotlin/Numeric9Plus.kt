package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Numeric9Plus: ImageVector
    get() {
        if (_Numeric9Plus != null) {
            return _Numeric9Plus!!
        }
        _Numeric9Plus = ImageVector.Builder(
            name = "Numeric9Plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                moveTo(10f, 7f)
                horizontalLineTo(8f)
                curveTo(6.9f, 7f, 6f, 7.9f, 6f, 9f)
                verticalLineTo(11f)
                curveTo(6f, 12.11f, 6.9f, 13f, 8f, 13f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                curveTo(11.11f, 17f, 12f, 16.11f, 12f, 15f)
                verticalLineTo(9f)
                curveTo(12f, 7.89f, 11.1f, 7f, 10f, 7f)
                moveTo(10f, 11f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _Numeric9Plus!!
    }

@Suppress("ObjectPropertyName")
private var _Numeric9Plus: ImageVector? = null
