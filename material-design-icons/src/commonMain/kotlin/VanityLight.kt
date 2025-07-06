package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VanityLight: ImageVector
    get() {
        if (_VanityLight != null) {
            return _VanityLight!!
        }
        _VanityLight = ImageVector.Builder(
            name = "VanityLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 20f)
                horizontalLineTo(16f)
                curveTo(16f, 18.34f, 17.34f, 13f, 19f, 13f)
                reflectiveCurveTo(22f, 18.34f, 22f, 20f)
                moveTo(12f, 13f)
                curveTo(10.34f, 13f, 9f, 18.34f, 9f, 20f)
                horizontalLineTo(15f)
                curveTo(15f, 18.34f, 13.66f, 13f, 12f, 13f)
                moveTo(5f, 13f)
                curveTo(3.34f, 13f, 2f, 18.34f, 2f, 20f)
                horizontalLineTo(8f)
                curveTo(8f, 18.34f, 6.66f, 13f, 5f, 13f)
                moveTo(14.82f, 6f)
                curveTo(14.26f, 4.44f, 12.53f, 3.64f, 11f, 4.2f)
                curveTo(10.14f, 4.5f, 9.5f, 5.17f, 9.18f, 6f)
                horizontalLineTo(2f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                horizontalLineTo(9.18f)
                curveTo(9.5f, 8.85f, 10.15f, 9.5f, 11f, 9.82f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                verticalLineTo(9.82f)
                curveTo(13.85f, 9.5f, 14.5f, 8.85f, 14.82f, 8f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                horizontalLineTo(14.82f)
                close()
            }
        }.build()

        return _VanityLight!!
    }

@Suppress("ObjectPropertyName")
private var _VanityLight: ImageVector? = null
