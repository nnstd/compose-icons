package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SendClock: ImageVector
    get() {
        if (_SendClock != null) {
            return _SendClock!!
        }
        _SendClock = ImageVector.Builder(
            name = "SendClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3f)
                verticalLineTo(10f)
                lineTo(11f, 12f)
                lineTo(2f, 14f)
                verticalLineTo(21f)
                lineTo(9.27f, 17.89f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 23f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 16f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 9f)
                lineTo(2f, 3f)
                moveTo(16f, 11f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 16f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 21f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 16f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 11f)
                moveTo(15f, 12.5f)
                verticalLineTo(16.5f)
                lineTo(18f, 18.5f)
                lineTo(18.75f, 17.25f)
                lineTo(16.5f, 15.75f)
                verticalLineTo(12.5f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _SendClock!!
    }

@Suppress("ObjectPropertyName")
private var _SendClock: ImageVector? = null
