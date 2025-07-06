package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TicketOutline: ImageVector
    get() {
        if (_TicketOutline != null) {
            return _TicketOutline!!
        }
        _TicketOutline = ImageVector.Builder(
            name = "TicketOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 14f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18f)
                verticalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 10f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 4f)
                horizontalLineTo(4f)
                moveTo(4f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(8.54f)
                curveTo(18.76f, 9.25f, 18f, 10.57f, 18f, 12f)
                curveTo(18f, 13.43f, 18.76f, 14.75f, 20f, 15.46f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineTo(15.46f)
                curveTo(5.24f, 14.75f, 6f, 13.43f, 6f, 12f)
                curveTo(6f, 10.57f, 5.24f, 9.25f, 4f, 8.54f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _TicketOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TicketOutline: ImageVector? = null
