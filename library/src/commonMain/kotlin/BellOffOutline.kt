package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BellOffOutline: ImageVector
    get() {
        if (_BellOffOutline != null) {
            return _BellOffOutline!!
        }
        _BellOffOutline = ImageVector.Builder(
            name = "BellOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(5.83f, 7.72f)
                curveTo(5.29f, 8.73f, 5f, 9.86f, 5f, 11f)
                verticalLineTo(17f)
                lineTo(3f, 19f)
                verticalLineTo(20f)
                horizontalLineTo(18.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(7f, 18f)
                verticalLineTo(11f)
                curveTo(7f, 10.39f, 7.11f, 9.79f, 7.34f, 9.23f)
                lineTo(16.11f, 18f)
                horizontalLineTo(7f)
                moveTo(10f, 21f)
                horizontalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 23f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 21f)
                moveTo(8.29f, 5.09f)
                curveTo(8.82f, 4.75f, 9.4f, 4.5f, 10f, 4.29f)
                curveTo(10f, 4.19f, 10f, 4.1f, 10f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 4f)
                curveTo(14f, 4.1f, 14f, 4.19f, 14f, 4.29f)
                curveTo(16.97f, 5.17f, 19f, 7.9f, 19f, 11f)
                verticalLineTo(15.8f)
                lineTo(17f, 13.8f)
                verticalLineTo(11f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6f)
                curveTo(11.22f, 6f, 10.45f, 6.2f, 9.76f, 6.56f)
                lineTo(8.29f, 5.09f)
                close()
            }
        }.build()

        return _BellOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BellOffOutline: ImageVector? = null
