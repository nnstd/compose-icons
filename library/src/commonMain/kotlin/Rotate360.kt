package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Rotate360: ImageVector
    get() {
        if (_Rotate360 != null) {
            return _Rotate360!!
        }
        _Rotate360 = ImageVector.Builder(
            name = "Rotate360",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7f)
                curveTo(6.5f, 7f, 2f, 9.2f, 2f, 12f)
                curveTo(2f, 14.2f, 4.9f, 16.1f, 9f, 16.8f)
                verticalLineTo(20f)
                lineTo(13f, 16f)
                lineTo(9f, 12f)
                verticalLineTo(14.7f)
                curveTo(5.8f, 14.1f, 4f, 12.8f, 4f, 12f)
                curveTo(4f, 10.9f, 7f, 9f, 12f, 9f)
                reflectiveCurveTo(20f, 10.9f, 20f, 12f)
                curveTo(20f, 12.7f, 18.5f, 13.9f, 16f, 14.5f)
                verticalLineTo(16.6f)
                curveTo(19.5f, 15.8f, 22f, 14.1f, 22f, 12f)
                curveTo(22f, 9.2f, 17.5f, 7f, 12f, 7f)
                close()
            }
        }.build()

        return _Rotate360!!
    }

@Suppress("ObjectPropertyName")
private var _Rotate360: ImageVector? = null
