package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TicketPercentOutline: ImageVector
    get() {
        if (_TicketPercentOutline != null) {
            return _TicketPercentOutline!!
        }
        _TicketPercentOutline = ImageVector.Builder(
            name = "TicketPercentOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.8f, 8f)
                lineTo(16f, 9.2f)
                lineTo(9.2f, 16f)
                lineTo(8f, 14.8f)
                lineTo(14.8f, 8f)
                moveTo(4f, 4f)
                horizontalLineTo(20f)
                curveTo(21.11f, 4f, 22f, 4.89f, 22f, 6f)
                verticalLineTo(10f)
                curveTo(20.9f, 10f, 20f, 10.9f, 20f, 12f)
                curveTo(20f, 13.11f, 20.9f, 14f, 22f, 14f)
                verticalLineTo(18f)
                curveTo(22f, 19.11f, 21.11f, 20f, 20f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.11f, 2f, 18f)
                verticalLineTo(14f)
                curveTo(3.11f, 14f, 4f, 13.11f, 4f, 12f)
                curveTo(4f, 10.9f, 3.11f, 10f, 2f, 10f)
                verticalLineTo(6f)
                curveTo(2f, 4.89f, 2.9f, 4f, 4f, 4f)
                moveTo(4f, 6f)
                verticalLineTo(8.54f)
                curveTo(5.24f, 9.26f, 6f, 10.57f, 6f, 12f)
                curveTo(6f, 13.43f, 5.24f, 14.75f, 4f, 15.46f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(15.46f)
                curveTo(18.76f, 14.75f, 18f, 13.43f, 18f, 12f)
                curveTo(18f, 10.57f, 18.76f, 9.26f, 20f, 8.54f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                moveTo(9.5f, 8f)
                curveTo(10.33f, 8f, 11f, 8.67f, 11f, 9.5f)
                curveTo(11f, 10.33f, 10.33f, 11f, 9.5f, 11f)
                curveTo(8.67f, 11f, 8f, 10.33f, 8f, 9.5f)
                curveTo(8f, 8.67f, 8.67f, 8f, 9.5f, 8f)
                moveTo(14.5f, 13f)
                curveTo(15.33f, 13f, 16f, 13.67f, 16f, 14.5f)
                curveTo(16f, 15.33f, 15.33f, 16f, 14.5f, 16f)
                curveTo(13.67f, 16f, 13f, 15.33f, 13f, 14.5f)
                curveTo(13f, 13.67f, 13.67f, 13f, 14.5f, 13f)
                close()
            }
        }.build()

        return _TicketPercentOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TicketPercentOutline: ImageVector? = null
