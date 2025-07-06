package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TicketAccount: ImageVector
    get() {
        if (_TicketAccount != null) {
            return _TicketAccount!!
        }
        _TicketAccount = ImageVector.Builder(
            name = "TicketAccount",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 14f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18f)
                verticalLineTo(14f)
                curveTo(3.11f, 14f, 4f, 13.1f, 4f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 10f)
                verticalLineTo(6f)
                curveTo(2f, 4.89f, 2.9f, 4f, 4f, 4f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6f)
                verticalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                moveTo(16.5f, 16.25f)
                curveTo(16.5f, 14.75f, 13.5f, 14f, 12f, 14f)
                curveTo(10.5f, 14f, 7.5f, 14.75f, 7.5f, 16.25f)
                verticalLineTo(17f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.25f)
                moveTo(12f, 12.25f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.25f, 10f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7.75f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.75f, 10f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12.25f)
                close()
            }
        }.build()

        return _TicketAccount!!
    }

@Suppress("ObjectPropertyName")
private var _TicketAccount: ImageVector? = null
