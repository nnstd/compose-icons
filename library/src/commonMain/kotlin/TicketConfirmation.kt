package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TicketConfirmation: ImageVector
    get() {
        if (_TicketConfirmation != null) {
            return _TicketConfirmation!!
        }
        _TicketConfirmation = ImageVector.Builder(
            name = "TicketConfirmation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 8.5f)
                horizontalLineTo(11f)
                verticalLineTo(6.5f)
                horizontalLineTo(13f)
                verticalLineTo(8.5f)
                moveTo(13f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                moveTo(13f, 17.5f)
                horizontalLineTo(11f)
                verticalLineTo(15.5f)
                horizontalLineTo(13f)
                verticalLineTo(17.5f)
                moveTo(22f, 10f)
                verticalLineTo(6f)
                curveTo(22f, 4.89f, 21.1f, 4f, 20f, 4f)
                horizontalLineTo(4f)
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
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 10f)
                close()
            }
        }.build()

        return _TicketConfirmation!!
    }

@Suppress("ObjectPropertyName")
private var _TicketConfirmation: ImageVector? = null
