package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandExtendedOutline: ImageVector
    get() {
        if (_HandExtendedOutline != null) {
            return _HandExtendedOutline!!
        }
        _HandExtendedOutline = ImageVector.Builder(
            name = "HandExtendedOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 15f)
                verticalLineTo(16f)
                lineTo(14f, 18.5f)
                lineTo(7f, 16.6f)
                verticalLineTo(18f)
                horizontalLineTo(1f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                lineTo(15.2f, 9.3f)
                curveTo(16.2f, 9.7f, 17f, 10.8f, 17f, 12f)
                horizontalLineTo(19f)
                curveTo(20.7f, 12f, 22f, 13.3f, 22f, 15f)
                moveTo(5f, 16f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                moveTo(19.9f, 14.6f)
                curveTo(19.7f, 14.2f, 19.4f, 14f, 19f, 14f)
                horizontalLineTo(13.6f)
                curveTo(13.1f, 14f, 12.5f, 13.9f, 12f, 13.8f)
                lineTo(9.7f, 13f)
                lineTo(10.3f, 11.1f)
                lineTo(12.7f, 11.9f)
                curveTo(13f, 11.9f, 15f, 12f, 15f, 12f)
                curveTo(15f, 11.6f, 14.8f, 11.3f, 14.4f, 11.2f)
                lineTo(8.6f, 9f)
                horizontalLineTo(7f)
                verticalLineTo(14.5f)
                lineTo(14f, 16.4f)
                lineTo(19.9f, 14.6f)
                close()
            }
        }.build()

        return _HandExtendedOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HandExtendedOutline: ImageVector? = null
