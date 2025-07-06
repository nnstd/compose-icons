package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClipboardPulse: ImageVector
    get() {
        if (_ClipboardPulse != null) {
            return _ClipboardPulse!!
        }
        _ClipboardPulse = ImageVector.Builder(
            name = "ClipboardPulse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(14.82f)
                curveTo(14.4f, 1.84f, 13.3f, 1f, 12f, 1f)
                curveTo(10.7f, 1f, 9.6f, 1.84f, 9.18f, 3f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                moveTo(12f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                moveTo(5f, 13.46f)
                horizontalLineTo(7.17f)
                lineTo(10.5f, 7.08f)
                lineTo(11.44f, 14.05f)
                lineTo(13.93f, 10.86f)
                lineTo(16.53f, 13.46f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(15.89f)
                lineTo(14.07f, 13.21f)
                lineTo(10.38f, 17.92f)
                lineTo(9.62f, 12.15f)
                lineTo(8.11f, 15f)
                horizontalLineTo(5f)
                verticalLineTo(13.46f)
                close()
            }
        }.build()

        return _ClipboardPulse!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardPulse: ImageVector? = null
