package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlarmNote: ImageVector
    get() {
        if (_AlarmNote != null) {
            return _AlarmNote!!
        }
        _AlarmNote = ImageVector.Builder(
            name = "AlarmNote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.4f, 1.86f)
                lineTo(16.11f, 3.39f)
                lineTo(20.71f, 7.25f)
                lineTo(22f, 5.72f)
                lineTo(17.4f, 1.86f)
                moveTo(6.6f, 1.86f)
                lineTo(2f, 5.71f)
                lineTo(3.29f, 7.24f)
                lineTo(7.88f, 3.39f)
                lineTo(6.6f, 1.86f)
                moveTo(12f, 4f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 13f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                curveTo(12.33f, 22f, 12.67f, 22f, 13f, 21.94f)
                verticalLineTo(19.94f)
                curveTo(12.67f, 20f, 12.33f, 20f, 12f, 20f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 13f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                curveTo(15.1f, 6f, 17.83f, 8.03f, 18.71f, 11f)
                horizontalLineTo(20.78f)
                curveTo(19.85f, 6.9f, 16.2f, 4f, 12f, 4f)
                moveTo(23f, 15f)
                horizontalLineTo(20f)
                verticalLineTo(20.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 23f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 20.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 18f)
                curveTo(18.04f, 18f, 18.57f, 18.18f, 19f, 18.5f)
                verticalLineTo(13f)
                horizontalLineTo(23f)
                verticalLineTo(15f)
                moveTo(11.5f, 8f)
                verticalLineTo(13.25f)
                lineTo(7.5f, 15.62f)
                lineTo(8.25f, 16.85f)
                lineTo(13f, 14f)
                verticalLineTo(8f)
                horizontalLineTo(11.5f)
                close()
            }
        }.build()

        return _AlarmNote!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmNote: ImageVector? = null
