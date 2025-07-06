package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WiperWashAlert: ImageVector
    get() {
        if (_WiperWashAlert != null) {
            return _WiperWashAlert!!
        }
        _WiperWashAlert = ImageVector.Builder(
            name = "WiperWashAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 6f)
                curveTo(11f, 5.7f, 11.1f, 4.6f, 11.8f, 3.8f)
                lineTo(10f, 2.4f)
                lineTo(8.2f, 3.9f)
                curveTo(8.9f, 4.6f, 9f, 5.7f, 9f, 6f)
                curveTo(2.7f, 6.4f, 0f, 11f, 0f, 11f)
                lineTo(7f, 18f)
                curveTo(7f, 18f, 7.7f, 16.7f, 9f, 16.2f)
                verticalLineTo(18.3f)
                curveTo(8.4f, 18.6f, 8f, 19.3f, 8f, 20f)
                curveTo(8f, 21.11f, 8.9f, 22f, 10f, 22f)
                reflectiveCurveTo(12f, 21.11f, 12f, 20f)
                curveTo(12f, 19.3f, 11.6f, 18.6f, 11f, 18.3f)
                verticalLineTo(16.2f)
                curveTo(12.3f, 16.7f, 13f, 18f, 13f, 18f)
                lineTo(20f, 11f)
                curveTo(20f, 11f, 17.3f, 6.5f, 11f, 6f)
                moveTo(9f, 14.1f)
                curveTo(8.2f, 14.3f, 7.5f, 14.6f, 6.9f, 15.1f)
                lineTo(2.7f, 10.9f)
                curveTo(3.8f, 9.8f, 5.8f, 8.3f, 9f, 8.1f)
                verticalLineTo(14.1f)
                moveTo(13.1f, 15.1f)
                curveTo(12.5f, 14.7f, 11.8f, 14.3f, 11f, 14.1f)
                verticalLineTo(8.1f)
                curveTo(14.2f, 8.4f, 16.2f, 9.8f, 17.3f, 10.9f)
                lineTo(13.1f, 15.1f)
                moveTo(16f, 1.3f)
                lineTo(15.3f, 3.2f)
                curveTo(14.6f, 2.9f, 13.5f, 2.9f, 12.7f, 3.2f)
                lineTo(12f, 1.3f)
                curveTo(13.2f, 0.9f, 14.8f, 0.9f, 16f, 1.3f)
                moveTo(19f, 6f)
                horizontalLineTo(17f)
                curveTo(17f, 6f, 17f, 4.7f, 16.2f, 3.9f)
                lineTo(17.7f, 2.6f)
                curveTo(19f, 4f, 19f, 5.9f, 19f, 6f)
                moveTo(2.2f, 2.6f)
                lineTo(3.7f, 3.9f)
                curveTo(3f, 4.7f, 3f, 6f, 3f, 6f)
                horizontalLineTo(1f)
                curveTo(1f, 5.9f, 1f, 4f, 2.2f, 2.6f)
                moveTo(8f, 1.3f)
                lineTo(7.3f, 3.2f)
                curveTo(6.6f, 2.9f, 5.5f, 2.9f, 4.7f, 3.2f)
                lineTo(4f, 1.3f)
                curveTo(5.2f, 0.9f, 6.8f, 0.9f, 8f, 1.3f)
                moveTo(22f, 12f)
                verticalLineTo(7f)
                horizontalLineTo(24f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                moveTo(22f, 17f)
                horizontalLineTo(24f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
            }
        }.build()

        return _WiperWashAlert!!
    }

@Suppress("ObjectPropertyName")
private var _WiperWashAlert: ImageVector? = null
