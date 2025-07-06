package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TabUnselected: ImageVector
    get() {
        if (_TabUnselected != null) {
            return _TabUnselected!!
        }
        _TabUnselected = ImageVector.Builder(
            name = "TabUnselected",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 9f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                horizontalLineTo(1f)
                verticalLineTo(9f)
                moveTo(1f, 13f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(1f)
                verticalLineTo(13f)
                moveTo(1f, 5f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 5f)
                moveTo(9f, 21f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                moveTo(1f, 17f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineTo(1f)
                verticalLineTo(17f)
                moveTo(3f, 21f)
                verticalLineTo(19f)
                horizontalLineTo(1f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 21f)
                moveTo(21f, 3f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(23f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 3f)
                moveTo(21f, 17f)
                horizontalLineTo(23f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                moveTo(9f, 5f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                moveTo(5f, 21f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                moveTo(5f, 5f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                moveTo(21f, 21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 19f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                moveTo(21f, 13f)
                horizontalLineTo(23f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                moveTo(13f, 21f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                moveTo(17f, 21f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(21f)
                close()
            }
        }.build()

        return _TabUnselected!!
    }

@Suppress("ObjectPropertyName")
private var _TabUnselected: ImageVector? = null
