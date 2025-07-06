package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClockStarFourPoints: ImageVector
    get() {
        if (_ClockStarFourPoints != null) {
            return _ClockStarFourPoints!!
        }
        _ClockStarFourPoints = ImageVector.Builder(
            name = "ClockStarFourPoints",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.4f, 15.1f)
                curveTo(13.5f, 16.2f, 13f, 17.5f, 13f, 19f)
                curveTo(13f, 20f, 13.3f, 21f, 13.7f, 21.8f)
                curveTo(13.2f, 21.9f, 12.6f, 22f, 12f, 22f)
                curveTo(6.5f, 22f, 2f, 17.5f, 2f, 12f)
                curveTo(2f, 6.5f, 6.5f, 2f, 12f, 2f)
                curveTo(17.5f, 2f, 22f, 6.5f, 22f, 12f)
                curveTo(22f, 12.5f, 21.92f, 12.97f, 21.84f, 13.5f)
                lineTo(21.8f, 13.7f)
                curveTo(21f, 13.3f, 20f, 13f, 19f, 13f)
                curveTo(17.7f, 13f, 16.6f, 13.4f, 15.6f, 14.1f)
                lineTo(12.5f, 12.2f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                lineTo(14.4f, 15.1f)
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

        return _ClockStarFourPoints!!
    }

@Suppress("ObjectPropertyName")
private var _ClockStarFourPoints: ImageVector? = null
