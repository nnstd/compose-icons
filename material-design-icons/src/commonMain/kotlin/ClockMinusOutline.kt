package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClockMinusOutline: ImageVector
    get() {
        if (_ClockMinusOutline != null) {
            return _ClockMinusOutline!!
        }
        _ClockMinusOutline = ImageVector.Builder(
            name = "ClockMinusOutline",
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
                moveTo(15f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _ClockMinusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ClockMinusOutline: ImageVector? = null
