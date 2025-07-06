package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TurnstileOutline: ImageVector
    get() {
        if (_TurnstileOutline != null) {
            return _TurnstileOutline!!
        }
        _TurnstileOutline = ImageVector.Builder(
            name = "TurnstileOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.41f, 10.41f)
                curveTo(13.04f, 10.79f, 12.53f, 11f, 12f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 9f)
                curveTo(10f, 8.47f, 10.21f, 7.96f, 10.59f, 7.59f)
                lineTo(9.17f, 6.17f)
                curveTo(8.42f, 6.92f, 8f, 7.94f, 8f, 9f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                horizontalLineTo(8.55f)
                curveTo(8.9f, 11.6f, 9.4f, 12.1f, 10f, 12.45f)
                verticalLineTo(19f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                curveTo(13.06f, 13f, 14.08f, 12.58f, 14.83f, 11.83f)
                lineTo(13.41f, 10.41f)
                moveTo(10f, 2f)
                verticalLineTo(5f)
                lineTo(16f, 11f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(2f)
                horizontalLineTo(10f)
                moveTo(20f, 20f)
                horizontalLineTo(18f)
                verticalLineTo(10.17f)
                lineTo(12f, 4.17f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _TurnstileOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TurnstileOutline: ImageVector? = null
