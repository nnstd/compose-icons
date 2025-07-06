package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TicketPercent: ImageVector
    get() {
        if (_TicketPercent != null) {
            return _TicketPercent!!
        }
        _TicketPercent = ImageVector.Builder(
            name = "TicketPercent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineTo(10f)
                curveTo(3.11f, 10f, 4f, 10.9f, 4f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 14f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18f)
                verticalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 12f)
                curveTo(20f, 10.89f, 20.9f, 10f, 22f, 10f)
                verticalLineTo(6f)
                curveTo(22f, 4.89f, 21.1f, 4f, 20f, 4f)
                horizontalLineTo(4f)
                moveTo(15.5f, 7f)
                lineTo(17f, 8.5f)
                lineTo(8.5f, 17f)
                lineTo(7f, 15.5f)
                lineTo(15.5f, 7f)
                moveTo(8.81f, 7.04f)
                curveTo(9.79f, 7.04f, 10.58f, 7.83f, 10.58f, 8.81f)
                arcTo(1.77f, 1.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.81f, 10.58f)
                curveTo(7.83f, 10.58f, 7.04f, 9.79f, 7.04f, 8.81f)
                arcTo(1.77f, 1.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.81f, 7.04f)
                moveTo(15.19f, 13.42f)
                curveTo(16.17f, 13.42f, 16.96f, 14.21f, 16.96f, 15.19f)
                arcTo(1.77f, 1.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.19f, 16.96f)
                curveTo(14.21f, 16.96f, 13.42f, 16.17f, 13.42f, 15.19f)
                arcTo(1.77f, 1.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.19f, 13.42f)
                close()
            }
        }.build()

        return _TicketPercent!!
    }

@Suppress("ObjectPropertyName")
private var _TicketPercent: ImageVector? = null
