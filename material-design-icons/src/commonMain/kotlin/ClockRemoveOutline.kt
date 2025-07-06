package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClockRemoveOutline: ImageVector
    get() {
        if (_ClockRemoveOutline != null) {
            return _ClockRemoveOutline!!
        }
        _ClockRemoveOutline = ImageVector.Builder(
            name = "ClockRemoveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.47f, 15.08f)
                lineTo(11f, 13f)
                verticalLineTo(7f)
                horizontalLineTo(12.5f)
                verticalLineTo(12.25f)
                lineTo(15.58f, 14.08f)
                curveTo(15.17f, 14.36f, 14.79f, 14.7f, 14.47f, 15.08f)
                moveTo(13.08f, 19.92f)
                curveTo(12.72f, 19.97f, 12.37f, 20f, 12f, 20f)
                curveTo(7.58f, 20f, 4f, 16.42f, 4f, 12f)
                reflectiveCurveTo(7.58f, 4f, 12f, 4f)
                reflectiveCurveTo(20f, 7.58f, 20f, 12f)
                curveTo(20f, 12.37f, 19.97f, 12.72f, 19.92f, 13.08f)
                curveTo(20.61f, 13.18f, 21.25f, 13.4f, 21.84f, 13.72f)
                curveTo(21.94f, 13.16f, 22f, 12.59f, 22f, 12f)
                curveTo(22f, 6.5f, 17.5f, 2f, 12f, 2f)
                reflectiveCurveTo(2f, 6.5f, 2f, 12f)
                curveTo(2f, 17.5f, 6.47f, 22f, 12f, 22f)
                curveTo(12.59f, 22f, 13.16f, 21.94f, 13.72f, 21.84f)
                curveTo(13.4f, 21.25f, 13.18f, 20.61f, 13.08f, 19.92f)
                moveTo(21.12f, 15.46f)
                lineTo(19f, 17.59f)
                lineTo(16.88f, 15.47f)
                lineTo(15.47f, 16.88f)
                lineTo(17.59f, 19f)
                lineTo(15.47f, 21.12f)
                lineTo(16.88f, 22.54f)
                lineTo(19f, 20.41f)
                lineTo(21.12f, 22.54f)
                lineTo(22.54f, 21.12f)
                lineTo(20.41f, 19f)
                lineTo(22.54f, 16.88f)
                lineTo(21.12f, 15.46f)
                close()
            }
        }.build()

        return _ClockRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ClockRemoveOutline: ImageVector? = null
