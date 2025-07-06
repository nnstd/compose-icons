package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MicrophoneVariant: ImageVector
    get() {
        if (_MicrophoneVariant != null) {
            return _MicrophoneVariant!!
        }
        _MicrophoneVariant = ImageVector.Builder(
            name = "MicrophoneVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 3f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 7f)
                horizontalLineTo(5f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 3f)
                moveTo(11.84f, 9.82f)
                lineTo(11f, 18f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 19f)
                verticalLineTo(14f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 10f)
                horizontalLineTo(20f)
                lineTo(19f, 11f)
                lineTo(20f, 12f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 14f)
                verticalLineTo(19f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 23f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 19f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                lineTo(6.16f, 9.82f)
                curveTo(5.67f, 9.32f, 5.31f, 8.7f, 5.13f, 8f)
                horizontalLineTo(12.87f)
                curveTo(12.69f, 8.7f, 12.33f, 9.32f, 11.84f, 9.82f)
                moveTo(9f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 11f)
                close()
            }
        }.build()

        return _MicrophoneVariant!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneVariant: ImageVector? = null
