package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GlobeLight: ImageVector
    get() {
        if (_GlobeLight != null) {
            return _GlobeLight!!
        }
        _GlobeLight = ImageVector.Builder(
            name = "GlobeLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.1f, 10f)
                curveTo(8.1f, 9f, 9.5f, 8.3f, 11f, 8.1f)
                verticalLineTo(2f)
                horizontalLineTo(13f)
                verticalLineTo(8.1f)
                curveTo(14.5f, 8.3f, 15.9f, 9f, 16.9f, 10f)
                horizontalLineTo(7.1f)
                moveTo(5.3f, 13f)
                curveTo(5.1f, 13.6f, 5f, 14.3f, 5f, 15f)
                curveTo(5f, 18.9f, 8.1f, 22f, 12f, 22f)
                reflectiveCurveTo(19f, 18.9f, 19f, 15f)
                curveTo(19f, 14.3f, 18.9f, 13.6f, 18.7f, 13f)
                horizontalLineTo(5.3f)
                close()
            }
        }.build()

        return _GlobeLight!!
    }

@Suppress("ObjectPropertyName")
private var _GlobeLight: ImageVector? = null
