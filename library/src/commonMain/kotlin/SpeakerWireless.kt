package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SpeakerWireless: ImageVector
    get() {
        if (_SpeakerWireless != null) {
            return _SpeakerWireless!!
        }
        _SpeakerWireless = ImageVector.Builder(
            name = "SpeakerWireless",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.07f, 19.07f)
                lineTo(18.66f, 17.66f)
                curveTo(20.11f, 16.22f, 21f, 14.21f, 21f, 12f)
                curveTo(21f, 9.78f, 20.11f, 7.78f, 18.66f, 6.34f)
                lineTo(20.07f, 4.93f)
                curveTo(21.88f, 6.74f, 23f, 9.24f, 23f, 12f)
                curveTo(23f, 14.76f, 21.88f, 17.26f, 20.07f, 19.07f)
                moveTo(17.24f, 16.24f)
                lineTo(15.83f, 14.83f)
                curveTo(16.55f, 14.11f, 17f, 13.11f, 17f, 12f)
                curveTo(17f, 10.89f, 16.55f, 9.89f, 15.83f, 9.17f)
                lineTo(17.24f, 7.76f)
                curveTo(18.33f, 8.85f, 19f, 10.35f, 19f, 12f)
                curveTo(19f, 13.65f, 18.33f, 15.15f, 17.24f, 16.24f)
                moveTo(4f, 3f)
                horizontalLineTo(12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 3f)
                moveTo(8f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 5f)
                moveTo(8f, 11f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 15f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 19f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 11f)
                moveTo(8f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 13f)
                close()
            }
        }.build()

        return _SpeakerWireless!!
    }

@Suppress("ObjectPropertyName")
private var _SpeakerWireless: ImageVector? = null
