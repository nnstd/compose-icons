package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClockStarFourPointsOutline: ImageVector
    get() {
        if (_ClockStarFourPointsOutline != null) {
            return _ClockStarFourPointsOutline!!
        }
        _ClockStarFourPointsOutline = ImageVector.Builder(
            name = "ClockStarFourPointsOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                curveTo(12.4f, 20f, 12.7f, 20f, 13.1f, 19.9f)
                curveTo(13.2f, 20.6f, 13.4f, 21.3f, 13.7f, 21.8f)
                curveTo(13.2f, 21.9f, 12.6f, 22f, 12f, 22f)
                curveTo(6.5f, 22f, 2f, 17.5f, 2f, 12f)
                curveTo(2f, 6.5f, 6.5f, 2f, 12f, 2f)
                curveTo(17.5f, 2f, 22f, 6.5f, 22f, 12f)
                curveTo(22f, 12.5f, 21.92f, 12.97f, 21.84f, 13.5f)
                lineTo(21.8f, 13.7f)
                curveTo(21.2f, 13.4f, 20.6f, 13.2f, 19.9f, 13.1f)
                curveTo(20f, 12.7f, 20f, 12.4f, 20f, 12f)
                curveTo(20f, 7.6f, 16.4f, 4f, 12f, 4f)
                curveTo(7.6f, 4f, 4f, 7.6f, 4f, 12f)
                curveTo(4f, 16.4f, 7.6f, 20f, 12f, 20f)
                moveTo(12.5f, 12.3f)
                lineTo(15.6f, 14.1f)
                curveTo(15.2f, 14.4f, 14.8f, 14.7f, 14.5f, 15.1f)
                lineTo(11f, 13f)
                verticalLineTo(7f)
                horizontalLineTo(12.5f)
                verticalLineTo(12.3f)
                moveTo(17.74f, 17.75f)
                lineTo(19f, 15f)
                lineTo(20.25f, 17.75f)
                lineTo(23f, 19f)
                lineTo(20.25f, 20.26f)
                lineTo(19f, 23f)
                lineTo(17.74f, 20.26f)
                lineTo(15f, 19f)
                lineTo(17.74f, 17.75f)
                close()
            }
        }.build()

        return _ClockStarFourPointsOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ClockStarFourPointsOutline: ImageVector? = null
