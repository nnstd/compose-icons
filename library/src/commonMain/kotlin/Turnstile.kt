package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Turnstile: ImageVector
    get() {
        if (_Turnstile != null) {
            return _Turnstile!!
        }
        _Turnstile = ImageVector.Builder(
            name = "Turnstile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 22f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                lineTo(10f, 5f)
                verticalLineTo(2f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                moveTo(9.17f, 6.17f)
                curveTo(8.42f, 6.92f, 8f, 7.94f, 8f, 9f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                horizontalLineTo(8.55f)
                curveTo(8.9f, 11.6f, 9.4f, 12.1f, 10f, 12.45f)
                verticalLineTo(19f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                curveTo(13.06f, 13f, 14.08f, 12.58f, 14.83f, 11.83f)
                lineTo(9.17f, 6.17f)
                close()
            }
        }.build()

        return _Turnstile!!
    }

@Suppress("ObjectPropertyName")
private var _Turnstile: ImageVector? = null
