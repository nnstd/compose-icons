package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SpeakerBluetooth: ImageVector
    get() {
        if (_SpeakerBluetooth != null) {
            return _SpeakerBluetooth!!
        }
        _SpeakerBluetooth = ImageVector.Builder(
            name = "SpeakerBluetooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 21f)
                horizontalLineTo(12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                horizontalLineTo(4f)
                moveTo(8f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 5f)
                moveTo(19f, 7f)
                verticalLineTo(10.79f)
                lineTo(16.71f, 8.5f)
                lineTo(16f, 9.21f)
                lineTo(18.79f, 12f)
                lineTo(16f, 14.79f)
                lineTo(16.71f, 15.5f)
                lineTo(19f, 13.21f)
                verticalLineTo(17f)
                horizontalLineTo(19.5f)
                lineTo(22.35f, 14.14f)
                lineTo(20.21f, 12f)
                lineTo(22.35f, 9.85f)
                lineTo(19.5f, 7f)
                horizontalLineTo(19f)
                moveTo(20f, 8.91f)
                lineTo(20.94f, 9.85f)
                lineTo(20f, 10.79f)
                verticalLineTo(8.91f)
                moveTo(8f, 11f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 19f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 15f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 11f)
                moveTo(8f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 13f)
                moveTo(20f, 13.21f)
                lineTo(20.94f, 14.14f)
                lineTo(20f, 15.08f)
                verticalLineTo(13.21f)
                close()
            }
        }.build()

        return _SpeakerBluetooth!!
    }

@Suppress("ObjectPropertyName")
private var _SpeakerBluetooth: ImageVector? = null
