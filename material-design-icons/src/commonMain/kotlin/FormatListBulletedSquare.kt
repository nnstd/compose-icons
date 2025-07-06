package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatListBulletedSquare: ImageVector
    get() {
        if (_FormatListBulletedSquare != null) {
            return _FormatListBulletedSquare!!
        }
        _FormatListBulletedSquare = ImageVector.Builder(
            name = "FormatListBulletedSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                moveTo(9f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                moveTo(3f, 10f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(10f)
                moveTo(9f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                moveTo(3f, 16f)
                horizontalLineTo(7f)
                verticalLineTo(20f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                moveTo(9f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
            }
        }.build()

        return _FormatListBulletedSquare!!
    }

@Suppress("ObjectPropertyName")
private var _FormatListBulletedSquare: ImageVector? = null
