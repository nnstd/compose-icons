package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TabMinus: ImageVector
    get() {
        if (_TabMinus != null) {
            return _TabMinus!!
        }
        _TabMinus = ImageVector.Builder(
            name = "TabMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 21f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 3f)
                horizontalLineTo(3f)
                moveTo(3f, 5f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                moveTo(7f, 13f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _TabMinus!!
    }

@Suppress("ObjectPropertyName")
private var _TabMinus: ImageVector? = null
