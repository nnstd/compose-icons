package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Ticket: ImageVector
    get() {
        if (_Ticket != null) {
            return _Ticket!!
        }
        _Ticket = ImageVector.Builder(
            name = "Ticket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.58f, 16.8f)
                lineTo(12f, 14.5f)
                lineTo(8.42f, 16.8f)
                lineTo(9.5f, 12.68f)
                lineTo(6.21f, 10f)
                lineTo(10.46f, 9.74f)
                lineTo(12f, 5.8f)
                lineTo(13.54f, 9.74f)
                lineTo(17.79f, 10f)
                lineTo(14.5f, 12.68f)
                moveTo(20f, 12f)
                curveTo(20f, 10.89f, 20.9f, 10f, 22f, 10f)
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
                close()
            }
        }.build()

        return _Ticket!!
    }

@Suppress("ObjectPropertyName")
private var _Ticket: ImageVector? = null
