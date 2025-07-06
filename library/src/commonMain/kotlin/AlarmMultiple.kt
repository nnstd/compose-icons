package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlarmMultiple: ImageVector
    get() {
        if (_AlarmMultiple != null) {
            return _AlarmMultiple!!
        }
        _AlarmMultiple = ImageVector.Builder(
            name = "AlarmMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.29f, 3.25f)
                lineTo(5.16f, 6.72f)
                lineTo(4f, 5.34f)
                lineTo(8.14f, 1.87f)
                lineTo(9.29f, 3.25f)
                moveTo(22f, 5.35f)
                lineTo(20.84f, 6.73f)
                lineTo(16.7f, 3.25f)
                lineTo(17.86f, 1.87f)
                lineTo(22f, 5.35f)
                moveTo(13f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 4f)
                moveTo(13f, 6f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 18f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 6f)
                moveTo(12f, 7.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(12.03f)
                lineTo(16.72f, 13.5f)
                lineTo(16.1f, 14.86f)
                lineTo(12f, 13f)
                verticalLineTo(7.5f)
                moveTo(1f, 14f)
                curveTo(1f, 11.5f, 2.13f, 9.3f, 3.91f, 7.83f)
                curveTo(3.33f, 9.1f, 3f, 10.5f, 3f, 12f)
                lineTo(3.06f, 13.13f)
                lineTo(3f, 14f)
                curveTo(3f, 16.28f, 4.27f, 18.26f, 6.14f, 19.28f)
                curveTo(7.44f, 20.5f, 9.07f, 21.39f, 10.89f, 21.78f)
                curveTo(10.28f, 21.92f, 9.65f, 22f, 9f, 22f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 14f)
                close()
            }
        }.build()

        return _AlarmMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmMultiple: ImageVector? = null
