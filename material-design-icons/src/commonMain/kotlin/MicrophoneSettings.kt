package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MicrophoneSettings: ImageVector
    get() {
        if (_MicrophoneSettings != null) {
            return _MicrophoneSettings!!
        }
        _MicrophoneSettings = ImageVector.Builder(
            name = "MicrophoneSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 10f)
                horizontalLineTo(17.3f)
                curveTo(17.3f, 13f, 14.76f, 15.1f, 12f, 15.1f)
                curveTo(9.24f, 15.1f, 6.7f, 13f, 6.7f, 10f)
                horizontalLineTo(5f)
                curveTo(5f, 13.41f, 7.72f, 16.23f, 11f, 16.72f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(16.72f)
                curveTo(16.28f, 16.23f, 19f, 13.41f, 19f, 10f)
                moveTo(15f, 24f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                moveTo(11f, 24f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                moveTo(12f, 13f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 10f)
                verticalLineTo(4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 4f)
                verticalLineTo(10f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 13f)
                moveTo(7f, 24f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(24f)
                close()
            }
        }.build()

        return _MicrophoneSettings!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneSettings: ImageVector? = null
