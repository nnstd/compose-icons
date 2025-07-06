package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BikePedal: ImageVector
    get() {
        if (_BikePedal != null) {
            return _BikePedal!!
        }
        _BikePedal = ImageVector.Builder(
            name = "BikePedal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.85f, 5f)
                curveTo(5.87f, 5f, 5.04f, 5.71f, 4.87f, 6.67f)
                lineTo(4f, 12f)
                lineTo(4.87f, 17.33f)
                curveTo(5.04f, 18.29f, 5.87f, 19f, 6.85f, 19f)
                horizontalLineTo(14.15f)
                curveTo(15.13f, 19f, 15.97f, 18.29f, 16.13f, 17.33f)
                lineTo(16.68f, 14f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                horizontalLineTo(16.68f)
                lineTo(16.13f, 6.67f)
                curveTo(15.97f, 5.71f, 15.13f, 5f, 14.15f, 5f)
                horizontalLineTo(6.85f)
                moveTo(6.85f, 7f)
                horizontalLineTo(14.15f)
                lineTo(14.82f, 11f)
                horizontalLineTo(6.18f)
                lineTo(6.85f, 7f)
                moveTo(6.18f, 13f)
                horizontalLineTo(14.82f)
                lineTo(14.15f, 17f)
                horizontalLineTo(6.85f)
                lineTo(6.18f, 13f)
                close()
            }
        }.build()

        return _BikePedal!!
    }

@Suppress("ObjectPropertyName")
private var _BikePedal: ImageVector? = null
