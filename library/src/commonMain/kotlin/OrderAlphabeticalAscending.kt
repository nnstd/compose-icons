package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.OrderAlphabeticalAscending: ImageVector
    get() {
        if (_OrderAlphabeticalAscending != null) {
            return _OrderAlphabeticalAscending!!
        }
        _OrderAlphabeticalAscending = ImageVector.Builder(
            name = "OrderAlphabeticalAscending",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                moveTo(12f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                moveTo(12f, 11f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(12f)
                moveTo(9f, 13f)
                verticalLineTo(15f)
                lineTo(5.67f, 19f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                lineTo(6.33f, 15f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                moveTo(7f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                curveTo(9f, 3.9f, 8.11f, 3f, 7f, 3f)
                moveTo(7f, 7f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _OrderAlphabeticalAscending!!
    }

@Suppress("ObjectPropertyName")
private var _OrderAlphabeticalAscending: ImageVector? = null
