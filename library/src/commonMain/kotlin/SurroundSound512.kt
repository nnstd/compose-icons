package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SurroundSound512: ImageVector
    get() {
        if (_SurroundSound512 != null) {
            return _SurroundSound512!!
        }
        _SurroundSound512 = ImageVector.Builder(
            name = "SurroundSound512",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                curveTo(18.9f, 11f, 18f, 11.9f, 18f, 13f)
                verticalLineTo(17f)
                horizontalLineTo(24f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                curveTo(23.1f, 13f, 24f, 12.1f, 24f, 11f)
                verticalLineTo(9f)
                curveTo(24f, 7.9f, 23.1f, 7f, 22f, 7f)
                horizontalLineTo(18f)
                moveTo(9f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(17f)
                moveTo(9f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                moveTo(0f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                curveTo(5.1f, 17f, 6f, 16.1f, 6f, 15f)
                verticalLineTo(13f)
                curveTo(6f, 11.9f, 5.1f, 11f, 4f, 11f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                horizontalLineTo(0f)
                moveTo(17f, 17f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
            }
        }.build()

        return _SurroundSound512!!
    }

@Suppress("ObjectPropertyName")
private var _SurroundSound512: ImageVector? = null
