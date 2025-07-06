package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SortDescending: ImageVector
    get() {
        if (_SortDescending != null) {
            return _SortDescending!!
        }
        _SortDescending = ImageVector.Builder(
            name = "SortDescending",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 7f)
                horizontalLineTo(22f)
                lineTo(18f, 3f)
                lineTo(14f, 7f)
                horizontalLineTo(17f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                moveTo(2f, 17f)
                horizontalLineTo(12f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
                moveTo(6f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                moveTo(2f, 11f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _SortDescending!!
    }

@Suppress("ObjectPropertyName")
private var _SortDescending: ImageVector? = null
