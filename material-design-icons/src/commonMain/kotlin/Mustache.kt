package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Mustache: ImageVector
    get() {
        if (_Mustache != null) {
            return _Mustache!!
        }
        _Mustache = ImageVector.Builder(
            name = "Mustache",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 12f)
                curveTo(19f, 12f, 18f, 9f, 15f, 9f)
                reflectiveCurveTo(12f, 11f, 12f, 11f)
                reflectiveCurveTo(12f, 9f, 9f, 9f)
                reflectiveCurveTo(5f, 12f, 3f, 12f)
                curveTo(2f, 12f, 1f, 11f, 1f, 11f)
                reflectiveCurveTo(2f, 16f, 6f, 16f)
                curveTo(11f, 16f, 12f, 13f, 12f, 13f)
                reflectiveCurveTo(13f, 16f, 18f, 16f)
                curveTo(22f, 16f, 23f, 11f, 23f, 11f)
                reflectiveCurveTo(22f, 12f, 21f, 12f)
                close()
            }
        }.build()

        return _Mustache!!
    }

@Suppress("ObjectPropertyName")
private var _Mustache: ImageVector? = null
