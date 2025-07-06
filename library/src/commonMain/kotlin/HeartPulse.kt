package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeartPulse: ImageVector
    get() {
        if (_HeartPulse != null) {
            return _HeartPulse!!
        }
        _HeartPulse = ImageVector.Builder(
            name = "HeartPulse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 4f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9.5f)
                curveTo(2f, 10f, 2.09f, 10.5f, 2.22f, 11f)
                horizontalLineTo(6.3f)
                lineTo(7.57f, 7.63f)
                curveTo(7.87f, 6.83f, 9.05f, 6.75f, 9.43f, 7.63f)
                lineTo(11.5f, 13f)
                lineTo(12.09f, 11.58f)
                curveTo(12.22f, 11.25f, 12.57f, 11f, 13f, 11f)
                horizontalLineTo(21.78f)
                curveTo(21.91f, 10.5f, 22f, 10f, 22f, 9.5f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 4f)
                curveTo(14.64f, 4f, 13f, 4.93f, 12f, 6.34f)
                curveTo(11f, 4.93f, 9.36f, 4f, 7.5f, 4f)
                verticalLineTo(4f)
                moveTo(3f, 12.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 13.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 14.5f)
                horizontalLineTo(5.44f)
                lineTo(11f, 20f)
                curveTo(12f, 20.9f, 12f, 20.9f, 13f, 20f)
                lineTo(18.56f, 14.5f)
                horizontalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 13.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12.5f)
                horizontalLineTo(13.4f)
                lineTo(12.47f, 14.8f)
                curveTo(12.07f, 15.81f, 10.92f, 15.67f, 10.55f, 14.83f)
                lineTo(8.5f, 9.5f)
                lineTo(7.54f, 11.83f)
                curveTo(7.39f, 12.21f, 7.05f, 12.5f, 6.6f, 12.5f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _HeartPulse!!
    }

@Suppress("ObjectPropertyName")
private var _HeartPulse: ImageVector? = null
