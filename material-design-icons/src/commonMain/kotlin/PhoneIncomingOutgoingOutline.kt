package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneIncomingOutgoingOutline: ImageVector
    get() {
        if (_PhoneIncomingOutgoingOutline != null) {
            return _PhoneIncomingOutgoingOutline!!
        }
        _PhoneIncomingOutgoingOutline = ImageVector.Builder(
            name = "PhoneIncomingOutgoingOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 16.5f)
                curveTo(17.8f, 16.5f, 16.5f, 16.3f, 15.4f, 15.9f)
                horizontalLineTo(15.1f)
                curveTo(14.8f, 15.9f, 14.6f, 16f, 14.4f, 16.2f)
                lineTo(12.2f, 18.4f)
                curveTo(9.4f, 16.9f, 7f, 14.6f, 5.6f, 11.8f)
                lineTo(7.8f, 9.6f)
                curveTo(8.1f, 9.3f, 8.2f, 8.9f, 8f, 8.6f)
                curveTo(7.7f, 7.5f, 7.5f, 6.2f, 7.5f, 5f)
                curveTo(7.5f, 4.5f, 7f, 4f, 6.5f, 4f)
                horizontalLineTo(3f)
                curveTo(2.5f, 4f, 2f, 4.5f, 2f, 5f)
                curveTo(2f, 14.4f, 9.6f, 22f, 19f, 22f)
                curveTo(19.5f, 22f, 20f, 21.5f, 20f, 21f)
                verticalLineTo(17.5f)
                curveTo(20f, 17f, 19.5f, 16.5f, 19f, 16.5f)
                moveTo(4f, 6f)
                horizontalLineTo(5.5f)
                curveTo(5.6f, 6.9f, 5.8f, 7.8f, 6f, 8.6f)
                lineTo(4.8f, 9.8f)
                curveTo(4.4f, 8.6f, 4.1f, 7.3f, 4f, 6f)
                moveTo(18f, 20f)
                curveTo(16.7f, 19.9f, 15.4f, 19.6f, 14.2f, 19.2f)
                lineTo(15.4f, 18f)
                curveTo(16.2f, 18.2f, 17.1f, 18.4f, 18f, 18.4f)
                verticalLineTo(20f)
                moveTo(16f, 9f)
                verticalLineTo(7.5f)
                horizontalLineTo(12.5f)
                lineTo(18f, 2f)
                lineTo(17f, 1f)
                lineTo(11.5f, 6.5f)
                verticalLineTo(3f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                moveTo(17f, 6f)
                verticalLineTo(7.5f)
                horizontalLineTo(20.5f)
                lineTo(15f, 13f)
                lineTo(16f, 14f)
                lineTo(21.5f, 8.5f)
                verticalLineTo(12f)
                horizontalLineTo(23f)
                verticalLineTo(6f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _PhoneIncomingOutgoingOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneIncomingOutgoingOutline: ImageVector? = null
