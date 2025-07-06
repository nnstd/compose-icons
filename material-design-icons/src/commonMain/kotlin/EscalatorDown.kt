package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EscalatorDown: ImageVector
    get() {
        if (_EscalatorDown != null) {
            return _EscalatorDown!!
        }
        _EscalatorDown = ImageVector.Builder(
            name = "EscalatorDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                horizontalLineTo(18.95f)
                lineTo(6.95f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.11f, 2f, 18f)
                curveTo(2f, 16.9f, 2.9f, 16f, 4f, 16f)
                horizontalLineTo(5.29f)
                lineTo(7f, 14.29f)
                verticalLineTo(10f)
                curveTo(7f, 9.45f, 7.45f, 9f, 8f, 9f)
                horizontalLineTo(9f)
                curveTo(9.55f, 9f, 10f, 9.45f, 10f, 10f)
                verticalLineTo(11.29f)
                lineTo(17.29f, 4f)
                horizontalLineTo(20f)
                curveTo(21.11f, 4f, 22f, 4.89f, 22f, 6f)
                curveTo(22f, 7.11f, 21.11f, 8f, 20f, 8f)
                moveTo(8.5f, 5f)
                curveTo(9.33f, 5f, 10f, 5.67f, 10f, 6.5f)
                curveTo(10f, 7.33f, 9.33f, 8f, 8.5f, 8f)
                curveTo(7.67f, 8f, 7f, 7.33f, 7f, 6.5f)
                curveTo(7f, 5.67f, 7.67f, 5f, 8.5f, 5f)
                moveTo(14.83f, 17.34f)
                lineTo(20.34f, 11.83f)
                lineTo(22.17f, 13.66f)
                lineTo(16.66f, 19.17f)
                lineTo(18.5f, 21f)
                horizontalLineTo(13f)
                verticalLineTo(15.5f)
                lineTo(14.83f, 17.34f)
                close()
            }
        }.build()

        return _EscalatorDown!!
    }

@Suppress("ObjectPropertyName")
private var _EscalatorDown: ImageVector? = null
