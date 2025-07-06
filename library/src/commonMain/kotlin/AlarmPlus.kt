package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlarmPlus: ImageVector
    get() {
        if (_AlarmPlus != null) {
            return _AlarmPlus!!
        }
        _AlarmPlus = ImageVector.Builder(
            name = "AlarmPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
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
                moveTo(22f, 5.72f)
                lineTo(17.4f, 1.86f)
                lineTo(16.11f, 3.39f)
                lineTo(20.71f, 7.25f)
                moveTo(7.88f, 3.39f)
                lineTo(6.6f, 1.86f)
                lineTo(2f, 5.71f)
                lineTo(3.29f, 7.24f)
                lineTo(7.88f, 3.39f)
                close()
            }
        }.build()

        return _AlarmPlus!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmPlus: ImageVector? = null
