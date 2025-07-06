package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountVoiceOff: ImageVector
    get() {
        if (_AccountVoiceOff != null) {
            return _AccountVoiceOff!!
        }
        _AccountVoiceOff = ImageVector.Builder(
            name = "AccountVoiceOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3.27f)
                lineTo(3.28f, 2f)
                lineTo(22f, 20.72f)
                lineTo(20.73f, 22f)
                lineTo(16.73f, 18f)
                curveTo(16.9f, 18.31f, 17f, 18.64f, 17f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(1f)
                verticalLineTo(19f)
                curveTo(1f, 16.34f, 6.33f, 15f, 9f, 15f)
                curveTo(10.77f, 15f, 13.72f, 15.59f, 15.5f, 16.77f)
                lineTo(11.12f, 12.39f)
                curveTo(10.5f, 12.78f, 9.78f, 13f, 9f, 13f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 9f)
                curveTo(5f, 8.22f, 5.22f, 7.5f, 5.61f, 6.88f)
                lineTo(2f, 3.27f)
                moveTo(9f, 5f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 9f)
                verticalLineTo(9.17f)
                lineTo(8.83f, 5f)
                horizontalLineTo(9f)
                moveTo(16.76f, 5.36f)
                curveTo(18.78f, 7.56f, 18.78f, 10.61f, 16.76f, 12.63f)
                lineTo(15.08f, 10.94f)
                curveTo(15.92f, 9.76f, 15.92f, 8.23f, 15.08f, 7.05f)
                lineTo(16.76f, 5.36f)
                moveTo(20.07f, 2f)
                curveTo(24f, 6.05f, 23.97f, 12.11f, 20.07f, 16f)
                lineTo(18.44f, 14.37f)
                curveTo(21.21f, 11.19f, 21.21f, 6.65f, 18.44f, 3.63f)
                lineTo(20.07f, 2f)
                close()
            }
        }.build()

        return _AccountVoiceOff!!
    }

@Suppress("ObjectPropertyName")
private var _AccountVoiceOff: ImageVector? = null
