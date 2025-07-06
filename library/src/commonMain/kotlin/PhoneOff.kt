package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneOff: ImageVector
    get() {
        if (_PhoneOff != null) {
            return _PhoneOff!!
        }
        _PhoneOff = ImageVector.Builder(
            name = "PhoneOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.22f, 2.5f)
                lineTo(2.5f, 20.22f)
                lineTo(3.77f, 21.5f)
                lineTo(8.65f, 16.62f)
                curveTo(11.76f, 19.43f, 15.81f, 21f, 20f, 21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 20f)
                verticalLineTo(16.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 15.5f)
                curveTo(18.75f, 15.5f, 17.55f, 15.3f, 16.43f, 14.93f)
                curveTo(16.08f, 14.82f, 15.69f, 14.9f, 15.41f, 15.18f)
                lineTo(13.21f, 17.38f)
                curveTo(12.06f, 16.8f, 11f, 16.06f, 10.06f, 15.21f)
                lineTo(21.5f, 3.77f)
                lineTo(20.22f, 2.5f)
                moveTo(4f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4f)
                curveTo(3f, 7.57f, 4.14f, 11.05f, 6.24f, 13.94f)
                lineTo(7.66f, 12.5f)
                curveTo(7.28f, 11.97f, 6.93f, 11.39f, 6.62f, 10.79f)
                lineTo(8.82f, 8.59f)
                curveTo(9.1f, 8.31f, 9.18f, 7.92f, 9.07f, 7.57f)
                curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 3f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _PhoneOff!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneOff: ImageVector? = null
