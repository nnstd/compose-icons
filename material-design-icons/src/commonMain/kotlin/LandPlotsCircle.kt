package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LandPlotsCircle: ImageVector
    get() {
        if (_LandPlotsCircle != null) {
            return _LandPlotsCircle!!
        }
        _LandPlotsCircle = ImageVector.Builder(
            name = "LandPlotsCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(20f)
                curveTo(2f, 21.1f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(20f)
                curveTo(21.1f, 22f, 22f, 21.1f, 22f, 20f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                moveTo(13f, 7.5f)
                curveTo(13f, 5.6f, 14.6f, 4f, 16.5f, 4f)
                curveTo(18.4f, 4f, 20f, 5.6f, 20f, 7.5f)
                curveTo(20f, 9.4f, 18.4f, 11f, 16.5f, 11f)
                curveTo(14.6f, 11f, 13f, 9.4f, 13f, 7.5f)
                moveTo(4f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                moveTo(4f, 20f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                moveTo(20f, 20f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _LandPlotsCircle!!
    }

@Suppress("ObjectPropertyName")
private var _LandPlotsCircle: ImageVector? = null
