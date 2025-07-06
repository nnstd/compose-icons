package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TicketConfirmationOutline: ImageVector
    get() {
        if (_TicketConfirmationOutline != null) {
            return _TicketConfirmationOutline!!
        }
        _TicketConfirmationOutline = ImageVector.Builder(
            name = "TicketConfirmationOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 10f)
                verticalLineTo(6f)
                curveTo(22f, 4.89f, 21.1f, 4f, 20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.89f, 2f, 6f)
                verticalLineTo(10f)
                curveTo(3.11f, 10f, 4f, 10.9f, 4f, 12f)
                reflectiveCurveTo(3.11f, 14f, 2f, 14f)
                verticalLineTo(18f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(21.1f, 20f, 22f, 19.1f, 22f, 18f)
                verticalLineTo(14f)
                curveTo(20.9f, 14f, 20f, 13.1f, 20f, 12f)
                reflectiveCurveTo(20.9f, 10f, 22f, 10f)
                moveTo(20f, 8.54f)
                curveTo(18.81f, 9.23f, 18f, 10.53f, 18f, 12f)
                reflectiveCurveTo(18.81f, 14.77f, 20f, 15.46f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineTo(15.46f)
                curveTo(5.19f, 14.77f, 6f, 13.47f, 6f, 12f)
                curveTo(6f, 10.5f, 5.2f, 9.23f, 4f, 8.54f)
                lineTo(4f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(8.54f)
                moveTo(11f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                moveTo(11f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                moveTo(11f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _TicketConfirmationOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TicketConfirmationOutline: ImageVector? = null
