package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Dolby: ImageVector
    get() {
        if (_Dolby != null) {
            return _Dolby!!
        }
        _Dolby = ImageVector.Builder(
            name = "Dolby",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                horizontalLineTo(2f)
                moveTo(6f, 17f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                curveTo(8.86f, 7.09f, 11.1f, 9.33f, 11f, 12f)
                curveTo(11.1f, 14.67f, 8.86f, 16.91f, 6f, 17f)
                moveTo(20f, 17f)
                horizontalLineTo(18f)
                curveTo(15.14f, 16.91f, 12.9f, 14.67f, 13f, 12f)
                curveTo(12.9f, 9.33f, 15.14f, 7.09f, 18f, 7f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _Dolby!!
    }

@Suppress("ObjectPropertyName")
private var _Dolby: ImageVector? = null
