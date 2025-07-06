package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SelectCompare: ImageVector
    get() {
        if (_SelectCompare != null) {
            return _SelectCompare!!
        }
        _SelectCompare = ImageVector.Builder(
            name = "SelectCompare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 23f)
                horizontalLineTo(11f)
                verticalLineTo(1f)
                horizontalLineTo(13f)
                verticalLineTo(23f)
                moveTo(9f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                moveTo(19f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                moveTo(19f, 5f)
                horizontalLineTo(21f)
                curveTo(21f, 3.89f, 20.1f, 3f, 19f, 3f)
                verticalLineTo(5f)
                moveTo(21f, 15f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                moveTo(19f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                moveTo(17f, 3f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(3f)
                moveTo(19f, 21f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                horizontalLineTo(19f)
                verticalLineTo(21f)
                moveTo(17f, 19f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _SelectCompare!!
    }

@Suppress("ObjectPropertyName")
private var _SelectCompare: ImageVector? = null
