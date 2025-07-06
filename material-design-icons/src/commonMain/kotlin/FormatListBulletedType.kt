package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatListBulletedType: ImageVector
    get() {
        if (_FormatListBulletedType != null) {
            return _FormatListBulletedType!!
        }
        _FormatListBulletedType = ImageVector.Builder(
            name = "FormatListBulletedType",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 9.5f)
                lineTo(7.5f, 14f)
                horizontalLineTo(2.5f)
                lineTo(5f, 9.5f)
                moveTo(3f, 4f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                moveTo(5f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 20f)
                moveTo(9f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                moveTo(9f, 19f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                moveTo(9f, 13f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _FormatListBulletedType!!
    }

@Suppress("ObjectPropertyName")
private var _FormatListBulletedType: ImageVector? = null
