package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Alarm: ImageVector
    get() {
        if (_Alarm != null) {
            return _Alarm!!
        }
        _Alarm = ImageVector.Builder(
            name = "Alarm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 13f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 13f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                moveTo(12f, 4f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 13f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 13f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                moveTo(12.5f, 8f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                lineTo(15.75f, 16.85f)
                lineTo(16.5f, 15.62f)
                lineTo(12.5f, 13.25f)
                verticalLineTo(8f)
                moveTo(7.88f, 3.39f)
                lineTo(6.6f, 1.86f)
                lineTo(2f, 5.71f)
                lineTo(3.29f, 7.24f)
                lineTo(7.88f, 3.39f)
                moveTo(22f, 5.72f)
                lineTo(17.4f, 1.86f)
                lineTo(16.11f, 3.39f)
                lineTo(20.71f, 7.25f)
                lineTo(22f, 5.72f)
                close()
            }
        }.build()

        return _Alarm!!
    }

@Suppress("ObjectPropertyName")
private var _Alarm: ImageVector? = null
