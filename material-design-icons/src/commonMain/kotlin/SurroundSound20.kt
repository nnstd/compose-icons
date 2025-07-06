package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SurroundSound20: ImageVector
    get() {
        if (_SurroundSound20 != null) {
            return _SurroundSound20!!
        }
        _SurroundSound20 = ImageVector.Builder(
            name = "SurroundSound20",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                curveTo(3.9f, 11f, 3f, 11.9f, 3f, 13f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                curveTo(8.1f, 13f, 9f, 12.1f, 9f, 11f)
                verticalLineTo(9f)
                curveTo(9f, 7.9f, 8.1f, 7f, 7f, 7f)
                horizontalLineTo(3f)
                moveTo(13f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                moveTo(17f, 7f)
                curveTo(15.9f, 7f, 15f, 7.9f, 15f, 9f)
                verticalLineTo(15f)
                curveTo(15f, 16.1f, 15.9f, 17f, 17f, 17f)
                horizontalLineTo(19f)
                curveTo(20.1f, 17f, 21f, 16.1f, 21f, 15f)
                verticalLineTo(9f)
                curveTo(21f, 7.9f, 20.1f, 7f, 19f, 7f)
                horizontalLineTo(17f)
                moveTo(17f, 9f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _SurroundSound20!!
    }

@Suppress("ObjectPropertyName")
private var _SurroundSound20: ImageVector? = null
