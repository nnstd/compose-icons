package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SizeS: ImageVector
    get() {
        if (_SizeS != null) {
            return _SizeS!!
        }
        _SizeS = ImageVector.Builder(
            name = "SizeS",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 7f)
                curveTo(9.9f, 7f, 9f, 7.9f, 9f, 9f)
                verticalLineTo(11f)
                curveTo(9f, 12.11f, 9.9f, 13f, 11f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                curveTo(14.11f, 17f, 15f, 16.11f, 15f, 15f)
                verticalLineTo(13f)
                curveTo(15f, 11.9f, 14.11f, 11f, 13f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _SizeS!!
    }

@Suppress("ObjectPropertyName")
private var _SizeS: ImageVector? = null
