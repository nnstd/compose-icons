package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BellCheck: ImageVector
    get() {
        if (_BellCheck != null) {
            return _BellCheck!!
        }
        _BellCheck = ImageVector.Builder(
            name = "BellCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.75f, 21.16f)
                lineTo(15f, 18.16f)
                lineTo(16.16f, 17f)
                lineTo(17.75f, 18.59f)
                lineTo(21.34f, 15f)
                lineTo(22.5f, 16.41f)
                lineTo(17.75f, 21.16f)
                moveTo(3f, 20f)
                verticalLineTo(19f)
                lineTo(5f, 17f)
                verticalLineTo(11f)
                curveTo(5f, 7.9f, 7.03f, 5.18f, 10f, 4.29f)
                verticalLineTo(4f)
                curveTo(10f, 2.9f, 10.9f, 2f, 12f, 2f)
                curveTo(13.11f, 2f, 14f, 2.9f, 14f, 4f)
                verticalLineTo(4.29f)
                curveTo(16.97f, 5.18f, 19f, 7.9f, 19f, 11f)
                verticalLineTo(12.08f)
                lineTo(18f, 12f)
                curveTo(14.69f, 12f, 12f, 14.69f, 12f, 18f)
                curveTo(12f, 18.7f, 12.12f, 19.37f, 12.34f, 20f)
                horizontalLineTo(3f)
                moveTo(12f, 23f)
                curveTo(10.9f, 23f, 10f, 22.11f, 10f, 21f)
                horizontalLineTo(12.8f)
                curveTo(13.04f, 21.41f, 13.33f, 21.79f, 13.65f, 22.13f)
                curveTo(13.29f, 22.66f, 12.69f, 23f, 12f, 23f)
                close()
            }
        }.build()

        return _BellCheck!!
    }

@Suppress("ObjectPropertyName")
private var _BellCheck: ImageVector? = null
