package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Memory: ImageVector
    get() {
        if (_Memory != null) {
            return _Memory!!
        }
        _Memory = ImageVector.Builder(
            name = "Memory",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                moveTo(21f, 11f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                curveTo(19f, 5.89f, 18.1f, 5f, 17f, 5f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                curveTo(5.89f, 5f, 5f, 5.89f, 5f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 19f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                moveTo(13f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                moveTo(15f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _Memory!!
    }

@Suppress("ObjectPropertyName")
private var _Memory: ImageVector? = null
