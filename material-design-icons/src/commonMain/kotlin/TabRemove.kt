package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TabRemove: ImageVector
    get() {
        if (_TabRemove != null) {
            return _TabRemove!!
        }
        _TabRemove = ImageVector.Builder(
            name = "TabRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.46f, 11.88f)
                lineTo(8.88f, 10.46f)
                lineTo(11f, 12.59f)
                lineTo(13.12f, 10.46f)
                lineTo(14.54f, 11.88f)
                lineTo(12.41f, 14f)
                lineTo(14.54f, 16.12f)
                lineTo(13.12f, 17.54f)
                lineTo(11f, 15.41f)
                lineTo(8.88f, 17.54f)
                lineTo(7.46f, 16.12f)
                lineTo(9.59f, 14f)
                lineTo(7.46f, 11.88f)
                moveTo(3f, 3f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 21f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                moveTo(3f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _TabRemove!!
    }

@Suppress("ObjectPropertyName")
private var _TabRemove: ImageVector? = null
