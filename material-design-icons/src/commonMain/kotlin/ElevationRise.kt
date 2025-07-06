package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ElevationRise: ImageVector
    get() {
        if (_ElevationRise != null) {
            return _ElevationRise!!
        }
        _ElevationRise = ImageVector.Builder(
            name = "ElevationRise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 21f)
                verticalLineTo(17.29f)
                lineTo(10.78f, 12.8f)
                lineTo(14.55f, 15f)
                lineTo(21f, 11.25f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                moveTo(21f, 8.94f)
                lineTo(14.55f, 12.67f)
                lineTo(10.78f, 10.5f)
                lineTo(3f, 15f)
                verticalLineTo(12.79f)
                lineTo(10.78f, 8.3f)
                lineTo(14.55f, 10.5f)
                lineTo(21f, 6.75f)
                verticalLineTo(8.94f)
                close()
            }
        }.build()

        return _ElevationRise!!
    }

@Suppress("ObjectPropertyName")
private var _ElevationRise: ImageVector? = null
