package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.UmbrellaClosed: ImageVector
    get() {
        if (_UmbrellaClosed != null) {
            return _UmbrellaClosed!!
        }
        _UmbrellaClosed = ImageVector.Builder(
            name = "UmbrellaClosed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(11.6f, 2f, 11.3f, 2.2f, 11.1f, 2.6f)
                lineTo(6.5f, 15f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                curveTo(11f, 19.6f, 10.6f, 20f, 10f, 20f)
                curveTo(9.4f, 20f, 9f, 19.6f, 9f, 19f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                curveTo(7f, 20.7f, 8.3f, 22f, 10f, 22f)
                reflectiveCurveTo(13f, 20.7f, 13f, 19f)
                verticalLineTo(15f)
                horizontalLineTo(17.5f)
                lineTo(12.9f, 2.6f)
                curveTo(12.7f, 2.2f, 12.4f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _UmbrellaClosed!!
    }

@Suppress("ObjectPropertyName")
private var _UmbrellaClosed: ImageVector? = null
