package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HazardLights: ImageVector
    get() {
        if (_HazardLights != null) {
            return _HazardLights!!
        }
        _HazardLights = ImageVector.Builder(
            name = "HazardLights",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                lineTo(14.33f, 16f)
                horizontalLineTo(9.68f)
                lineTo(12f, 12f)
                moveTo(12f, 8f)
                lineTo(6.21f, 18f)
                horizontalLineTo(17.8f)
                lineTo(12f, 8f)
                moveTo(12f, 2f)
                lineTo(1f, 21f)
                horizontalLineTo(23f)
                lineTo(12f, 2f)
                moveTo(12f, 6f)
                lineTo(19.53f, 19f)
                horizontalLineTo(4.47f)
                lineTo(12f, 6f)
                close()
            }
        }.build()

        return _HazardLights!!
    }

@Suppress("ObjectPropertyName")
private var _HazardLights: ImageVector? = null
