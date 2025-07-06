package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmoticonExcited: ImageVector
    get() {
        if (_EmoticonExcited != null) {
            return _EmoticonExcited!!
        }
        _EmoticonExcited = ImageVector.Builder(
            name = "EmoticonExcited",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.47f, 2f, 2f, 6.47f, 2f, 12f)
                curveTo(2f, 17.53f, 6.47f, 22f, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                curveTo(22f, 6.47f, 17.5f, 2f, 12f, 2f)
                moveTo(8.88f, 7.82f)
                lineTo(11f, 9.94f)
                lineTo(9.94f, 11f)
                lineTo(8.88f, 9.94f)
                lineTo(7.82f, 11f)
                lineTo(6.76f, 9.94f)
                lineTo(8.88f, 7.82f)
                moveTo(12f, 17.5f)
                curveTo(9.67f, 17.5f, 7.69f, 16.04f, 6.89f, 14f)
                horizontalLineTo(17.11f)
                curveTo(16.31f, 16.04f, 14.33f, 17.5f, 12f, 17.5f)
                moveTo(16.18f, 11f)
                lineTo(15.12f, 9.94f)
                lineTo(14.06f, 11f)
                lineTo(13f, 9.94f)
                lineTo(15.12f, 7.82f)
                lineTo(17.24f, 9.94f)
                lineTo(16.18f, 11f)
                close()
            }
        }.build()

        return _EmoticonExcited!!
    }

@Suppress("ObjectPropertyName")
private var _EmoticonExcited: ImageVector? = null
