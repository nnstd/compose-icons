package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatListBulletedTriangle: ImageVector
    get() {
        if (_FormatListBulletedTriangle != null) {
            return _FormatListBulletedTriangle!!
        }
        _FormatListBulletedTriangle = ImageVector.Builder(
            name = "FormatListBulletedTriangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 15.5f)
                lineTo(7.5f, 20f)
                horizontalLineTo(2.5f)
                lineTo(5f, 15.5f)
                moveTo(9f, 19f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                moveTo(5f, 9.5f)
                lineTo(7.5f, 14f)
                horizontalLineTo(2.5f)
                lineTo(5f, 9.5f)
                moveTo(9f, 13f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                moveTo(5f, 3.5f)
                lineTo(7.5f, 8f)
                horizontalLineTo(2.5f)
                lineTo(5f, 3.5f)
                moveTo(9f, 7f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _FormatListBulletedTriangle!!
    }

@Suppress("ObjectPropertyName")
private var _FormatListBulletedTriangle: ImageVector? = null
