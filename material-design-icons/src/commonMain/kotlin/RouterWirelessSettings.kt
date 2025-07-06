package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RouterWirelessSettings: ImageVector
    get() {
        if (_RouterWirelessSettings != null) {
            return _RouterWirelessSettings!!
        }
        _RouterWirelessSettings = ImageVector.Builder(
            name = "RouterWirelessSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.2f, 4.9f)
                curveTo(19f, 3.8f, 17.5f, 3.2f, 16f, 3.2f)
                curveTo(14.5f, 3.2f, 13f, 3.8f, 11.8f, 4.9f)
                lineTo(11f, 4.1f)
                curveTo(12.4f, 2.7f, 14.2f, 2f, 16f, 2f)
                curveTo(17.8f, 2f, 19.6f, 2.7f, 21f, 4.1f)
                lineTo(20.2f, 4.9f)
                moveTo(19.3f, 5.7f)
                lineTo(18.5f, 6.5f)
                curveTo(17.8f, 5.8f, 16.9f, 5.5f, 16f, 5.5f)
                curveTo(15.1f, 5.5f, 14.2f, 5.8f, 13.5f, 6.5f)
                lineTo(12.7f, 5.7f)
                curveTo(13.6f, 4.8f, 14.8f, 4.3f, 16f, 4.3f)
                curveTo(17.2f, 4.3f, 18.4f, 4.8f, 19.3f, 5.7f)
                moveTo(19f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 14f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 20f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18f)
                verticalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 12f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                horizontalLineTo(19f)
                moveTo(8f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                moveTo(11.5f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(9.5f)
                verticalLineTo(17f)
                horizontalLineTo(11.5f)
                moveTo(15f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                moveTo(7f, 22f)
                horizontalLineTo(9f)
                verticalLineTo(24f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                moveTo(11f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(24f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                moveTo(15f, 22f)
                horizontalLineTo(17f)
                verticalLineTo(24f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _RouterWirelessSettings!!
    }

@Suppress("ObjectPropertyName")
private var _RouterWirelessSettings: ImageVector? = null
